package com.example.demo.util.stringUtil;

/**
 * ClassName:ChuStringUtil
 * Description:字符串相关工具方法
 * @date:2021/2/19 11:19
 * @author: chuliyi
 */
public class ChuStringUtil {
    
    /**
     * @author : chuliyi
     * @version : v1.0
     * @description 如果一个字符串去除空格后以数字或者"."开头，当以数字开头的时候返回第一个浮点序列，当以"."开头默认小数点前为0并返回第一个浮点序列，如果不是以数字或者小数点开头则返回"0"
     * @date : 11:20 2021/2/19
     */
    public static String getFirstFloFromStr(String str){
        String tmp = str.trim();
        String ret = "";
        for (int i = 0; i < tmp.length(); i++) {
            if (tmp.charAt(i) == 46){
                ret += "0.";
            }
            if (30 <= tmp.charAt(i) && tmp.charAt(i) <= 39){
                ret += tmp.charAt(i);
            }else {
                break;
            }
        }
        if (ret.length() == 0){
            return "0";
        }else {
            return  ret;
        }
    }


    
}
