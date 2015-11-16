package com.ssm.business.service.thread;

import com.linuxense.javadbf.DBFField;
import com.linuxense.javadbf.DBFReader;
import com.ssm.business.entity.Item;
import com.ssm.common.util.SimpleDate;
import com.ssm.common.util.StringUtil;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Created by vincent on 2015/11/8.
 */
public  class DbfFieldExtend {

    /**
     * 字段类型转换成对应的类型
     * @param field
     * @param initValue
     * @return
     */
    public static  Object getField(Field field, Object initValue) {
        if (field.getType().equals(String.class)) {
            initValue = StringUtil.replaceBlank(String.valueOf(initValue));
        } else if (field.getType().equals(Double.class)) {
            initValue = Double.parseDouble(initValue.toString());
        } else if (field.getType().equals(Date.class)) {
            try {
                initValue = SimpleDate.strToDate(SimpleDate.format((Date) initValue));
            } catch (Exception e) {
                initValue = new Date();
            }
        } else {
            initValue = String.valueOf(initValue);
        }
        return initValue;
    }

    /**
     * 获取字段的set方法
     *
     * @param orginString
     * @return
     */
    public static String getMethodName(String orginString) {
        return "set" + getFieldName(orginString);
    }

    /**
     * 获取字段
     *
     * @param orginString
     * @return
     */
    public static String getFieldName(String orginString) {
        return StringUtil.firstCharacterToUpper((orginString.toLowerCase()));
    }


    /**
     * 一行数据转换成对应的类
     * @param rowValues
     * @param tClass
     * @return
     */
    public static Object RowToObject(Object[] rowValues, Class tClass, Object object,DBFReader reader)
    {
        Object initValue;
        List<Example> examples =   RowToMethod(rowValues,tClass,reader);
        for (int i = 0; i < rowValues.length; i++) {//循环每一行的每一个字段的值
            Example example = examples.get(i);
            initValue = rowValues[i];
            try {
                tClass.getMethod(example.getMethodName(), example.getField().getType()).invoke(object, initValue);//通过反射将值保存到bean
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return object;
    }


    /**
     * 一行数据转换成对应的方法
     * @param row
     * @param tClass
     * @param reader
     * @return
     */
    public static List<Example>  RowToMethod(Object[] row, Class tClass, DBFReader reader)
    {
        List<Example> examples = new ArrayList<>();
        Field[] fields = tClass.getDeclaredFields();//该类所有的属性
        try {
            for (int i = 0; i < row.length; i++) {//一行
                DBFField dbfField = reader.getField(i);//一列
                out:
                for(Field field: fields)
                {
                    if(dbfField.getName().toLowerCase().indexOf(field.getName().toLowerCase())>-1)
                    {
                        Example example = new Example();//存储列信息
                        example.setField(field);
                        example.setMethodName(getMethodName(field.getName()));
                        examples.add(example);
                        break out;
                    }
                }
            }
            return examples;
        }
        catch (Exception e)
        {
            ;
        }
        return null;
    }
}
