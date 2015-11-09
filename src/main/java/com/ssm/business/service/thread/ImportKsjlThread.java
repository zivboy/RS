package com.ssm.business.service.thread;

import com.linuxense.javadbf.DBFReader;
import com.ssm.business.entity.Ksjl;
import com.ssm.business.service.ImportService;
import com.ssm.business.service.KsjlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by vincent on 2015/11/8.
 */
@Service("ImportKsjlThread")
public class ImportKsjlThread  implements Runnable {

    @Autowired
    KsjlService ksjlService;

    public ImportKsjlThread(){}

    Object[] rowValues;
    Class tClass;
    Ksjl ksjlSource;
    DBFReader reader;

    public ImportKsjlThread(Class tClass,Ksjl ksjlSource, DBFReader reader)
    {
        this.tClass = tClass;
        this.reader = reader;
        this.ksjlSource = ksjlSource;
    }

    @Override
    public synchronized void run() {
        try
        {
            List<Ksjl> list = new ArrayList<>();
            while ((rowValues = reader.nextRecord()) != null) {//取dbf文件的每一行
                list.add((Ksjl) DbfFieldExtend.RowToObject(rowValues,Ksjl.class,ksjlSource,reader));
            }
            ksjlService.saveBatch(list);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
