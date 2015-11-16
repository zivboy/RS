package com.ssm.business.service.thread;

import com.linuxense.javadbf.DBFReader;
import com.ssm.business.entity.CodeManage;
import com.ssm.business.service.CodeManageService;
import com.ssm.common.util.SimpleDate;
import com.sun.tools.javac.jvm.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

/**
 * Created by vincent on 2015/11/8.
 */

public class ImportDmThread implements Runnable {

    CodeManageService codeManageService;

    Object[] rowValues;

    int ny = Integer.valueOf(SimpleDate.formatYear(new Date()));

    public CodeManageService getCodeManageService() {
        return codeManageService;
    }

    public void setCodeManageService(CodeManageService codeManageService) {
        this.codeManageService = codeManageService;
    }

    public ImportDmThread(){}
    Map<String, String> filesMap = new HashMap<>();//存储使用

    public ImportDmThread(Map<String, String> filesMap)
    {
        this.filesMap = filesMap;
    }

    @Override
    public synchronized void run() {

        //毕业类别代码
        if (filesMap.size() > 0 && filesMap.get("TD_BYLBDM") != null) {
            batchSave("TD_BYLBDM");
        }
        //成绩项代码
        if (filesMap.size() > 0 && filesMap.get("TD_CJXDM") != null) {
            batchSave("TD_CJXDM");
        }
        //地区代码
        if (filesMap.size() > 0 && filesMap.get("TD_DQDM") != null) {
            batchSave("TD_DQDM");
        }
        //计划性质代码
        if (filesMap.size() > 0 && filesMap.get("TD_JHXZDM") != null) {
            batchSave("TD_JHXZDM");
        }
        //科类代码
        if (filesMap.size() > 0 && filesMap.get("TD_KLDM") != null) {
            batchSave("TD_KLDM");
        }
        //考生类别代码
        if (filesMap.size() > 0 && filesMap.get("TD_KSLBDM") != null) {
            batchSave("TD_KSLBDM");
        }
        //考试类型代码
        if (filesMap.size() > 0 && filesMap.get("TD_KSLXDM") != null) {
            batchSave("TD_KSLXDM");
        }
        //录取方式代码
        if (filesMap.size() > 0 && filesMap.get("TD_LQFSDM") != null) {
            batchSave("TD_LQFSDM");
        }
        //民族代码
        if (filesMap.size() > 0 && filesMap.get("TD_MZDM") != null) {
            batchSave("TD_MZDM");
        }
        //批次代码
        if (filesMap.size() > 0 && filesMap.get("TD_PCDM") != null) {
            batchSave("TD_PCDM");
        }
        //退档原因代码
        if (filesMap.size() > 0 && filesMap.get("TD_TDYYDM") != null) {
            batchSave("TD_TDYYDM");
        }
        //体检结论代码
        if (filesMap.size() > 0 && filesMap.get("TD_TJJLDM") != null) {
            batchSave("TD_TJJLDM");
        }
        //外语语种代码
        if (filesMap.size() > 0 && filesMap.get("TD_WYYZDM") != null) {
            batchSave("TD_WYYZDM");
        }
        //性别代码
        if (filesMap.size() > 0 && filesMap.get("TD_XBDM") != null) {
            batchSave("TD_XBDM");
        }
        //系统单位代码
        if (filesMap.size() > 0 && filesMap.get("TD_XTDWDM") != null) {
            batchSave("TD_XTDWDM");
        }
        //政策代码
//            Zcdm	政策代码	Char(1)
//            Zcmc	政策名称	Char(32)
//            Zgf	照顾分	Number(7,3)
//            Xdx	相对线	Char(1)
        if (filesMap.size() > 0 && filesMap.get("TD_ZCDM") != null) {
            batchSave("TD_ZCDM");
        }
//            //志愿特征代码
//            Zytzdm	志愿特征代码	Char(1)
//            Zytzmc	志愿特征名称	Char(32)
        if (filesMap.size() > 0 && filesMap.get("TD_ZYTZDM") != null) {
            batchSave("TD_ZYTZDM");
        }
        //政治面貌代码
        if (filesMap.size() > 0 && filesMap.get("TD_ZZMMDM") != null) {
            batchSave("TD_ZZMMDM");
        }


    }

    /**
     * 导入代码型数据
     * @param type
     */
    public void batchSave(String type)
    {

        try
        {
            CodeManage codeManageSearch = new CodeManage();
            codeManageSearch.setDmType(type);
            codeManageSearch.setNf(ny);
            int count = codeManageService.countByExample(null,codeManageSearch);
            if(count==0)
            {
                InputStream fis = new FileInputStream(filesMap.get(type));
                DBFReader reader = new DBFReader(fis);
                reader.setCharactersetName("GBK");
                List<CodeManage> list = new ArrayList<>();

                while ((rowValues = reader.nextRecord()) != null) {//取dbf文件的每一行
                    CodeManage codeManage = new CodeManage();
                    codeManage.setNf(ny);
                    codeManage.setId(null);
                    codeManage.setDmType(type);
                    if (!(type.indexOf("TD_ZCDM") > -1)) {
                        codeManage.setDm(((String) rowValues[0]).trim());
                        codeManage.setMc(((String) rowValues[1]).trim());
                        codeManage.setZgf(null);
                        codeManage.setXdx(null);
                        list.add(codeManage);
                    } else {
                        codeManage.setDm(((String) rowValues[0]).trim());
                        codeManage.setMc(((String) rowValues[1]).trim());
                        Double dd = (Double)( rowValues[2]);
                        Float spd = (Float)dd.floatValue();
                        codeManage.setZgf((rowValues[2] != null) ? spd : null);
                        codeManage.setXdx((rowValues[3] != null) ? ((String) rowValues[3]).trim() : null);
                        list.add(codeManage);
                    }
                }
                if(list.size()!=0)
                codeManageService.save(list);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
