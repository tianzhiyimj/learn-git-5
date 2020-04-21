package com.juice.utils;

/**
 * 对变量支持加减法
 */
public class ManipulateNum {
    public static void manipulateNum(String str){
        /**
         * 读取第二个字符串数组的字符串 判断做加法或减法
         *
         * @param str 输入的语句
         * @param info str拆分后的字符串数组
         */
        String[] info = str.split("\\s+");
        if(info[1].equals("减少")){
            Variable.setVar(info[0],Variable.getVar(info[0])-Transfer.toNum(info[2]));
        }
        else if(info[1].equals("增加")){
            Variable.setVar(info[0],Variable.getVar(info[0])+Transfer.toNum(info[2]));
        }
    }
}
