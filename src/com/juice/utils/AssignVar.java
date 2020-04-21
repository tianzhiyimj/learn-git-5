package com.juice.utils;

public class AssignVar {
    /**
 * 将输入的字符串分割
 * 调用Transfer方法转换str[3]，为整型
 */
    public static void assignVar(String str){
        String[] str1=str.split("\\s+");
        int Toint=Transfer.toNum(str1[3]);
        System.out.println(Toint);
        Variable.setVar(str1[1],Toint);
    }
}
