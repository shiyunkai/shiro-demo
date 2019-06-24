package com.example.shirodemo.utils;

/**
 * @Auther: shiyunkai
 * @Date: 2019/03/27 13:55
 * @Description:
 */
public class StringUtils {

    public static String[] splitByWholeSeparatorPreserveAllTokens(String str, String separator){
        String[] split = str.split(separator);
        return split;
    }
}
