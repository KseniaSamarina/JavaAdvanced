package CalculatorOOP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    @Test
    void getResultAddition() {
        Addition add = new Addition(6,3);
        assertEquals(9, add.getResult());
    }

    @Test
    void getResultSubtraction() {
        Subtraction sub = new Subtraction(10,3);
        assertEquals(7, sub.getResult());
    }

    @Test
    void getResultMultiplication() {
        Multiplication mul = new Multiplication(2,0);
        assertEquals(0, mul.getResult());
    }

    @Test
    void getResultDivision() {
        Division div = new Division(6,3);
        assertEquals(2, div.getResult());
    }
    @Test
    void getResultDivisionByZero() {
        Division div = new Division(3, 0);
        assertThrows(ArithmeticException.class, div::getResult, "Dividing by zero is prohibited");
    }
}