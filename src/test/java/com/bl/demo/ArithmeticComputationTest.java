package com.bl.demo;

import org.junit.Assert;
import org.junit.Test;

public class ArithmeticComputationTest {
    ArithmeticComputation arithmeticComputation = new ArithmeticComputation();
    @Test
    public void givenTwoValue_WhenAddAndMultiply_ReturnAddMultiply() {
        int addMultiplyResult = arithmeticComputation.addMultiply(2, 2, 2);
        Assert.assertEquals(6, addMultiplyResult);
    }

    @Test
    public void givenTwoValue_WhenMultiplyAdd_ReturnMultiplyAdd() {
        int multiplyAddResult = arithmeticComputation.multiplyAdd(2, 4, 1);
        Assert.assertEquals(9, multiplyAddResult);
    }
    @Test
    public void givenTwoValue_WhenDivideAdd_ReturnDivideAdd() {
        int divideAddResult = arithmeticComputation.divideAdd(10, 5, 1);
        Assert.assertEquals(3, divideAddResult);
    }
    @Test
    public void givenTwoValue_WhenModAdd_ReturnModAdd() {
        int modAddResult = arithmeticComputation.modAdd(10, 5, 1);
        Assert.assertEquals(1, modAddResult);
    }
}