package com.ssm.entity;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by vincent on 2014/10/13.
 */
@Repository
public class DataBase implements Serializable {
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    String database;

}
