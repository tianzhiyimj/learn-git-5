package com.juice.utils;

/**
 * 数字和汉字相互转化的类
 */
public class Transfer {
    private static String numWords = "零一二三四五六七八九十";

    /**
     * 汉字转为数字
     *
     * @param str 中文数字
     * @return 对应int类型数字
     */
    public static int toNum(String str) {
        return numWords.indexOf(str);

    }

    /**
     * 数字转为汉字
     *
     * @param num int类型数字
     * @return 对应中文字符串
     */
    public static String toChStr(int num) {
        return numWords.substring(num, num + 1);
    }
}
