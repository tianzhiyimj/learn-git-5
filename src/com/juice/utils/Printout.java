package com.juice.utils;

import com.juice.utils.Variable;
/**
 * 输出字符串或者变量
 * @param array
 */
public class Printout{
    public static String printOut(String str) {
        String[] split = str.split(regax"\\s+");
        String varStr=split[1];
        if(varStr.contains("“")&&varStr.contains("“")){
            String trim = varStr.trim().replace(target"“",replacement"").replace(target"”",replacement"").trim();
            System.out.println(trim);
        }
        System.out.println(varStr);
        if (varStr.contains("")){
            return null ;
        }
        else{
            int var = Variable.getVar(varStr.trim());
            return ""+var;
        }
    }
}