package com.juice.utils;

public class ManipulateNum {
    public static void manipulateNum(String str){
        String[] info = str.split("\\s+");
        if(info[1].equals("减少")){
            Variable.setVar(info[0],Variable.getVar(info[0])-Transfer.toNum(info[2]));
        }
        else if(info[1].equals("增加")){
            Variable.setVar(info[0],Variable.getVar(info[0])+Transfer.toNum(info[2]));
        }
    }
}
