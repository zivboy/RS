package com.ssm.business.service.thread;

import com.linuxense.javadbf.DBFReader;
import com.ssm.business.entity.Ksjl;
import com.ssm.business.service.KsjlService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by vincent on 2015/11/8.
 */
public class ImportKsjlThread  implements Runnable {

    KsjlService ksjlService;

    Object[] rowValues;
    Class tClass;
    Ksjl ksjlSource;
    DBFReader reader;

    public KsjlService getKsjlService() {
        return ksjlService;
    }

    public void setKsjlService(KsjlService ksjlService) {
        this.ksjlService = ksjlService;
    }

    public ImportKsjlThread(Class tClass, Ksjl ksjlSource, DBFReader reader)
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
                Ksjl ksjl = new Ksjl();
                ksjl.setNy(ksjlSource.getNy());
                ksjl.setPc(ksjlSource.getPc());
                ksjl.setSf(ksjlSource.getSf());
                list.add((Ksjl) DbfFieldExtend.RowToObject(rowValues,Ksjl.class,ksjl,reader));
            }

            if(list!=null)
            ksjlService.saveBatch(list);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
