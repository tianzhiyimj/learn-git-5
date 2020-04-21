package com.juice.utils;

/**
 * 为参数赋值
 */
public class AssignVar {
    /**
     * 解析赋值语句，将变量名称和变量数值存储入Map键值对
     * @param str 传入的字符串，格式为：“整数 气温 等于 十”
     */
    public static void assignVar(String str){
        String[] str1=str.split("\\s+");
        int toInt=Transfer.toNum(str1[3]);
        Variable.setVar(str1[1],toInt);
    }
}
