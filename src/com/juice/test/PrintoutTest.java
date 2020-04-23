package com.juice.test;

import com.juice.utils.Variable;
import com.juice.utils.Printout;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrintoutTest {
    @Test
    public void PrintoutTest() {
        String result = Printout.printout(str:"看看 ”我穷死了“");
        Assert.assertEquals(expected:"我穷死了",result);
        Variable.setVar(varStr:"气温",var:10);
        result = Printout.printout(str:"看看 气温");
        Assert.assertEquals(expected:"10",result);
    }
}