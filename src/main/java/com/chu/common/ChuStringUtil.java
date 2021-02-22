package com.chu.common;

import org.springframework.boot.convert.Delimiter;
import org.springframework.util.StringUtils;

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
     * @description 如果一个字符串去除空格后以数字或者"."开头，当以数字开头的时候返回第一个浮点序列，当以"."开头默认小数点前为0并返回第一个浮点序列，如果不是以数字或者小数点开头则返回"0"。仿c语言atof函数
     * @date : 11:20 2021/2/19
     */
    public static String getFirstFloFromStr(String str){
        String tmp = str.trim();
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < tmp.length(); i++) {
            if (tmp.charAt(i) == 46 && i == 0){
                ret.append("0.") ;
                continue;
            }

            if (48 <= tmp.charAt(i) && tmp.charAt(i) <= 57 || '.' == tmp.charAt(i)){
                if (ret.toString().indexOf('.') >= 0 && '.' == tmp.charAt(i)){/*如果当前浮点序列已经包含了"."，那么截取到第二个小数点前为止*/
                    if (ret.length() == 0){
                        return "0";
                    }else {
                        return  ret.toString();
                    }
                }else {
                    ret.append(tmp.charAt(i));
                }
            }else {
                if (ret.length() == 0){
                    return "0";
                }else {
                    return  ret.toString();
                }
            }
        }

        return "0";
    }

    public static String getSubStringFromCsvLine(int n,char delimiter,String csvline){

        if ("".equals(csvline) || null == csvline){
            return null;
        }
        int pos = 0;
        int i = 0;
        if (n > 0){
            for (; i < csvline.length(); i++) {
                if (csvline.charAt(i) == delimiter){
                    pos++;
                }
                if (pos >= n){
                    i++;
                    break;
                }
            }
        }

        String subStr = csvline.substring(i);
        if (subStr.indexOf(delimiter) >= 0){
            return subStr.substring(0, subStr.indexOf(delimiter));
        }else {
            return subStr;
        }
    }

}
