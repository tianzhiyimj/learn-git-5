package com.juice.utils;

/**
 * 为参数赋值
 */
public class AssignVar {
    /**
     * 将输入的字符串分割，调用Transfer方法转换str[3]，为整型
     * @param str 传入的字符串
     */
    public static void assignVar(String str){
        String[] str1=str.split("\\s+");
        int toInt=Transfer.toNum(str1[3]);
        System.out.println(toInt);
        Variable.setVar(str1[1],toInt);
    }
}
