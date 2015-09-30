package com.ssm.generator.entity;

import org.springframework.stereotype.Repository;

/**
 * Created by ZHEJIANG RUIZHENG  on 2014/10/13.
 */
@Repository
public class DataBase {
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    String database;

}
