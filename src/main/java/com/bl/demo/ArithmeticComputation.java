package com.bl.demo;

public class ArithmeticComputation {
    public int multiplyAdd(int a, int b, int c) {
        return (a * b) + c;
    }
    public int addMultiply(int a, int b, int c) {
        return a + (b * c);
    }

    public int divideAdd(int a, int b, int c) {
        return c + (a / b);
    }
}
