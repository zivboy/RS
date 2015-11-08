package com.ssm.business.service.thread;

import java.lang.reflect.Field;

/**
 * Created by vincent on 2015/11/5.
 */
public class Example {
    Field field;
    String methodName;

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
}
