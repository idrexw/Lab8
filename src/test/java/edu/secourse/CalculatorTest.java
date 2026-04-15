package edu.secourse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("add(): add two numbers")
    void add() {
        assertAll(
                () -> assertEquals(2, Calculator.add(1, 1)),
                () -> assertEquals(2, Calculator.add(2, 0)),
                () -> assertEquals(-1, Calculator.add(2, -3))
        );
    }

    @Test
    @DisplayName("multiply(): multiply two numbers")
    void multiply() {
        assertAll(
                // Adding 0.0001 as the "delta" allows 0.0 and -0.0 to be equal
                () -> assertEquals(0.0, Calculator.multiply(-3.0, 0.0), 0.0001)
        );
    }

    @Test
    @DisplayName("sqrt(): square root one number")
    void sqrt() {
        assertAll(
                () -> assertEquals(2, Calculator.sqrt(4))
        );
    }
    @Test
    @DisplayName("divide(): divide two double numbers")
    void divide() {
        assertAll(
                () -> assertEquals(2.5, Calculator.divide(5.0, 2.0), 0.0001),
                () -> assertThrows(RuntimeException.class, () -> Calculator.divide(5.0, 0.0))
        );
    }

    @Test
    @DisplayName("add(int): add two integer numbers")
    void addInt() {
        assertAll(
                () -> assertEquals(5, Calculator.add(2, 3)),
                () -> assertEquals(-1, Calculator.add(2, -3))
        );
    }

    @Test
    @DisplayName("multiply(int): multiply two integer numbers")
    void multiplyInt() {
        assertAll(
                () -> assertEquals(6, Calculator.multiply(2, 3))
        );
    }
}