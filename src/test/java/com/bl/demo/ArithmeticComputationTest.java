package com.bl.demo;

import org.junit.Assert;
import org.junit.Test;

public class ArithmeticComputationTest {
    @Test
    public void givenTwoValue_WhenAddAndMultiply_ReturnAddMultiply() {
        Arithmetic arithmetic = new Arithmetic();
        int addMultiplyResult = arithmetic.addMultiply(2, 2, 2);
        Assert.assertEquals(6, addMultiplyResult);
    }
}
