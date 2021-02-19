package com.chu.common;

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
                String ret = "";
                for (int i = 0; i < tmp.length(); i++) {
                    if (tmp.charAt(i) == 46 && i == 0){
                        ret += "0.";
                        continue;
            }

            if (48 <= tmp.charAt(i) && tmp.charAt(i) <= 57 || '.' == tmp.charAt(i)){
                if (ret.indexOf('.') >= 0 && '.' == tmp.charAt(i)){/*如果当前浮点序列已经包含了"."，那么截取到第二个小数点前为止*/
                    break;
                }else {
                    ret += tmp.charAt(i);
                }
            }else {
                break;
            }
        }
        if (ret.length() == 0){/*如果*/
            return "0";
        }else {
            return  ret;
        }
    }


    
}
