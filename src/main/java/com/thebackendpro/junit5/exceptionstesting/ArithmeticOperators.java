package com.thebackendpro.junit5.exceptionstesting;

public class ArithmeticOperators {

    public int division(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("Cannot divide a number by 0");
        }
        return a/b;
    }
}
