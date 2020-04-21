package com.juice.test;

import com.juice.utils.AssignVar;
import com.juice.utils.JudgeOperator;
import com.juice.utils.Variable;
import org.junit.Assert;
import org.junit.Test;

public class JudgeOperatorTest {
    @Test
    public void judgeOperatorTest() {
        Variable.setVar("气温", 10);
        boolean temp = JudgeOperator.judgeOperator("气温 大于 八");
        Assert.assertEquals(true, temp);
    }
}

