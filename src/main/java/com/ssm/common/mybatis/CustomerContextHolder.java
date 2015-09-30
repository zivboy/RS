package com.ssm.common.mybatis;

/**
 * Created by vincent on 2014/10/13.
 */
public abstract class CustomerContextHolder {

    public final static String DATA_SOURCE_DEFAULT = "dataSource";
    public final static String DATA_SOURCE_GENERATOR = "dataSourceGenerator";

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    public static void setCustomerType(String customerType) {
        contextHolder.set(customerType);
    }

    public static String getCustomerType() {
        return contextHolder.get();
    }

    public static void clearCustomerType() {
        contextHolder.remove();
    }
}
