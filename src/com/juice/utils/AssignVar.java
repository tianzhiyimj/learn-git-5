package com.juice.utils;

public class AssignVar {
    public static void assignVar(String str){
        String[] str1=str.split("\\s+");
        int Toint=Transfer.toNum(str1[3]);
        System.out.println(Toint);
        Variable.setVar(str1[1],Toint);
    }
}
