package com.zoushiyou.web.util;

import org.apache.shiro.crypto.hash.Md5Hash;

import java.util.UUID;

/**
 * 帮助类
 */
public class Helper {
    /**
     * 获取Md5字符串
     * @param password
     * @param salt
     * @return
     */
    public static String GetMd5Str(String password,String salt){
        String encodedPassword = new Md5Hash(password, salt).toString();
        return encodedPassword;
    }

    /**
     * 获取UUID
     * @return
     */
    public static String GetUUID(){
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }
}
