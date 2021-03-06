package com.ado.java.odata.util;

import java.util.HashMap;
import java.util.Map;

public class StringHelper {

    private static Map<String, String> types = new HashMap<String, String>();

    static {
        types.put("BIGINT", "number");
        types.put("DOUBLE", "number");
        types.put("FLOAT", "float");
        types.put("BIT", "boolean");
        types.put("BLOB", "blob");
        types.put("CHAR", "string");
        types.put("DECIMAL", "decimal");
        types.put("INTEGER", "integer");
        types.put("VARCHAR", "string");
        types.put("TIMESTAMP", "date");
        types.put("INT", "int");
        types.put("DATETIME", "date");
    }

    public static String toUpperCase(String str) {
        return str == null ? null : str.toUpperCase();
    }

    public static String toLowerCase(String str) {
        return str == null ? null : str.toLowerCase();
    }

    public static String getType(String type) {
        return types.get(type);
    }
}
