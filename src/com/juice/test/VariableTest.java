package com.juice.test;


import com.juice.utils.Variable;
import org.junit.Assert;
import org.junit.Test;

public class VariableTest {

    @Test
    public void setVar() {
        Variable.setVar("天气", 10);
    }

    @Test
    public void getVar() {
        Variable.setVar("天气", 10);
        int temp = Variable.getVar("天气");
        Assert.assertEquals(10, temp);
    }
}