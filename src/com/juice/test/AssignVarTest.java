package com.juice.test;

import com.juice.utils.AssignVar;
import com.juice.utils.Variable;
import org.junit.Assert;
import org.junit.Test;

public class AssignVarTest {
    @Test
    public void assignVarTest(){
        AssignVar.assignVar("整数 气温 等于 十");
        int a=Variable.getVar("气温");
        Assert.assertEquals(10,a);
    }
}
