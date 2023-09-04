package com.thebackendpro.junit5.exceptionstesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArithmeticOperatorsTest {

    @Test
    public void divisionTestWhenExceptionIsThrown() {
        ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
        ArithmeticException arithmeticException = Assertions.assertThrows(ArithmeticException.class,
                () -> arithmeticOperators.division(5, 0), "Failed due to no excpeption is thrown");
        Assertions.assertEquals("Cannot divide a number by 0", arithmeticException.getMessage());
    }

    @Test
    public void divisionTestWhenNoExceptionIsThrown() {
        ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
        ArithmeticException arithmeticException = Assertions.assertThrows(ArithmeticException.class,
                () -> arithmeticOperators.division(5, 1), "Failed due to no excpeption is thrown");
        Assertions.assertEquals("Cannot divide a number by 0", arithmeticException.getMessage());
    }
}
