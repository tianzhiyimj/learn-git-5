package com.juice.test;

import com.juice.utils.Transfer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransferTest {
    String testStr = "零一二三四五六七八九十";

    @Test
    public void toNum() {
        for (int i = 0; i < testStr.length(); i++) {
            String chStr = testStr.substring(i, i + 1);
            int result = Transfer.toNum(chStr);
            Assert.assertEquals(i, result);
        }
    }

    @Test
    public void toChStr() {
        for (int i = 0; i < testStr.length(); i++) {
            String expect = testStr.substring(i, i + 1);
            String result = Transfer.toChStr(i);
            Assert.assertEquals(expect, result);
        }
    }
}