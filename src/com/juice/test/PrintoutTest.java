package com.juice.test;

import com.juice.utils.Printout;
import com.juice.utils.Variable;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrintoutTest {
    @Test
    public void PrintoutTest() {
        String result = Printout.printout("看看 ”我穷死了“");
        Assert.assertEquals("我穷死了",result);
        Variable.setVar("气温",10);
        result = Printout.printout("看看 气温");
        Assert.assertEquals("10",result);
    }
}