package com.zoushiyou.web.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
        String string = password + salt;
        if (string.isEmpty()) {
            return "";
        }
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] bytes = md5.digest(string.getBytes("UTF-8"));
            String result = "";
            for (byte b : bytes) {
                String temp = Integer.toHexString(b & 0xff);
                if (temp.length() == 1) {
                    temp = "0" + temp;
                }
                result += temp;
            }
            return result;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
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
