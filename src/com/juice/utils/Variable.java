package com.juice.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 存储中文变量的类
 */
public class Variable {
    private static Map<String, Integer> varMap = new HashMap<>();

    /**
     * 根据中文变量名称得到变量值
     *
     * @param varStr 输入中文数字
     * @return 返回整数类型数字
     */
    public static Integer getVar(String varStr) {
        return varMap.get(varStr);
    }

    /**
     * 设置中文变量的名称和数值
     *
     * @param varStr 中文变量的名称
     * @param var    变量数值
     */
    public static void setVar(String varStr, int var) {
        varMap.put(varStr, var);
    }
}
