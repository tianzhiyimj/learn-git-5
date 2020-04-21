package com.juice.utils;

import java.util.Arrays;

/**
 * 比较运算符的类
 */
public class JudgeOperator {
    /**
     * 调用Variable的getVar()方法来获取变量
     *
     * @param str 传入的字符串，格式为：“气温 大于 八”
     * @return 默认返回失败
     */
    public static boolean judgeOperator(String str) {
        String[] str1 = str.split("\\s+");
        String varStr = str1[0];
        Integer varNum = Variable.getVar(varStr);
        int varRight = Transfer.toNum(str1[2]);
        String operator = str1[1];
        switch (operator) {
            case "大于":
                return varNum > varRight;
            case "等于":
                return varNum == varRight;
            case "小于":
                return varNum < varRight;
        }
        return false;
    }
}