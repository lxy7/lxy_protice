package com.caih.cloudec.common.utils;

import java.util.UUID;

public class UuidUtil {
    public static String getUuid(){
        UUID uuid = UUID.randomUUID();
        String uuidStr =  uuid.toString();
        uuidStr = uuidStr.replace("-", "");
        return uuidStr;
    }

}
