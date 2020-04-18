package com.bl.demo;

import org.junit.Assert;
import org.junit.Test;

public class ArithmeticComputationTest {
    Arithmetic arithmetic = new Arithmetic();
    @Test
    public void givenTwoValue_WhenAddAndMultiply_ReturnAddMultiply() {
        int addMultiplyResult = arithmetic.addMultiply(2, 2, 2);
        Assert.assertEquals(6, addMultiplyResult);
    }

    @Test
    public void givenTwoValue_WhenMultiplyAdd_ReturnMultiplyAdd() {
        int multiplyAddResult = arithmetic.multiplyAdd(2, 4, 1);
        Assert.assertEquals(9, multiplyAddResult);
    }
}