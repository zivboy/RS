package com.ssm.business.service.thread;

import com.linuxense.javadbf.DBFReader;
import com.ssm.business.entity.Imports;
import com.ssm.business.entity.Item;
import com.ssm.business.entity.Student;
import com.ssm.business.service.ImportService;
import com.ssm.business.service.StudentService;
import com.ssm.common.util.SimpleDate;
import com.ssm.common.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by vincent on 2015/11/5.
 */
//异步最终导入数据
@Service("ImportDateThread")
public class ImportDateThread implements Runnable {

    public ImportDateThread()
    {}

    @Autowired
    ImportService importService;


    @Autowired
    StudentService studentService;

    private DBFReader reader;
    private List<String> fieldHtml, columnHtml;
    private List<Item> dataList;
    private int num = 1;
    private Imports imports;
    private long userId;

    public ImportDateThread(Imports imports, DBFReader reader, List<String> fieldHtml, List<String> columnHtml, List<Item> dataList,long userId) {
        this.imports = imports;
        this.reader = reader;
        this.fieldHtml = fieldHtml;
        this.columnHtml = columnHtml;
        this.dataList = dataList;//所有的dbf数据字段
        this.userId = userId;
    }



    @Override
    public synchronized void run() {
        Object[] rowValues;
        String methodName;
        Object initValue;
        Field field;
        int location;
        List<Example> examples = new ArrayList<>();
        Student student = new Student();
        student.setNy(new Date());
        student.setDrpc(Long.valueOf(imports.getPc()));
        student.setDrrid(userId);
        try {
            while ((rowValues = reader.nextRecord()) != null) {//取dbf文件的每一行
                if (num == 1) {//第一条记录保存逻辑字段
                    for (int i = 0; i < rowValues.length; i++) {//循环每一行的每一个字段的值
                        Example example = new Example();
                        initValue = rowValues[i];
                        Item item = dataList.get(i);
                        location = fieldHtml.lastIndexOf(item.getSourceField().trim());//如果表头在界面的配置里面
                        try {
                            field = Student.class.getDeclaredField(((location > -1) ? (columnHtml.get(location)).split("\\.")[1] : item.getSourceField().trim()).toLowerCase());
                            methodName = DbfFieldExtend.getMethodName(field.getName());//界面dbf展现字段名等于界面表的字段
                            initValue = DbfFieldExtend.getField(field, initValue);
                            example.setField(field);
                            example.setMethodName(methodName);
                            Student.class.getMethod(methodName, field.getType()).invoke(student, initValue);//通过反射将值保存到bean
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        examples.add(example);//逻辑字段
                    }
                } else {
                    for (int i = 0; i < rowValues.length; i++) {//循环每一行的每一个字段的值
                        Example example = examples.get(i);
                        initValue = rowValues[i];
                        try {
                            Student.class.getMethod(example.getMethodName(), example.getField().getType()).invoke(student, initValue);//通过反射将值保存到bean
                        } catch (Exception e) {
                            ;
                        }
                    }
                }
                studentService.save(student);//保存一行
                num++;
            }

            Imports imports = new Imports();
            imports.setState(1);
            imports.setImportId(imports.getImportId());
            imports.setMessage("导入成功");
            imports.setRowSum(num);
            importService.update(imports);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}
