package com.lqt.hr.common.utils;

import java.util.UUID;

public class StringUtil {

    public static String getUUID(){
        String uuid = UUID.randomUUID().toString();
        return uuid;

    }

    public static void main(String[] args) {
        System.out.println(getUUID());
    }

}
