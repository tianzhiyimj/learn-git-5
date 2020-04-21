package com.juice.test;

import com.juice.utils.AssignVar;
import com.juice.utils.Variable;
import org.junit.Assert;
import org.junit.Test;
import com.juice.utils.ManipulateNum;

public class ManipulateNumTest {
    @Test
    public void manipulateNumTest(){
        AssignVar.assignVar("整数 气温 等于 十");
        ManipulateNum.manipulateNum("气温 减少 三");
        int testInfo = Variable.getVar("气温");
        Assert.assertEquals(7,testInfo);
        ManipulateNum.manipulateNum("气温 增加 三");
        testInfo = Variable.getVar("气温");
        Assert.assertEquals(10,testInfo);
    }
}
