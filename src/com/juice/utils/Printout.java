package com.juice.utils;

import com.juice.utils.Variable;
/**
 * 输出字符串或者变量
 * @param str 传入字符串 看看 变量 或 看看 字符串
 */
public class Printout{
    public static String printOut(String str) {
        String[] split = str.split("\\s+");
        String varStr=split[1];
        if(varStr.contains("“")&&varStr.contains("”")){
            String trim = varStr.trim().replace("“","").replace("”","").trim();
            System.out.println(trim);
        }
        if (varStr.contains("")){
            return null ;
        }
        else{
            int var = Variable.getVar(varStr.trim());
            return ""+var;
        }
    }
}