package com.example.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorSolutionTests extends CalculatorTests {
    // Three Combined Tests for Divide
    @Nested
    @DisplayName("Division Operation")
    class DivisionTests {

        @Test
        @DisplayName("6 / 2 = 3")
        void divideSixByTwo() {
            CalculatorSolution calculator = new CalculatorSolution();
            assertEquals(3, calculator.divide(6, 2), "6 / 2 should equal 3");
        }

        @Test
        @DisplayName("1 / 2 = 0.5")
        void divideOneByTwo() {
            CalculatorSolution calculator = new CalculatorSolution();
            assertEquals(0.5, calculator.divide(1.0, 2.0), "1 / 2 should equal 0.5");
        }

        @Test
        @DisplayName("1 / 0 = ArithmeticException")
        void divideOneByZero() {
            CalculatorSolution calculator = new CalculatorSolution();
            assertThrows(ArithmeticException.class, () -> calculator.divide(1,0), "should throw / 0 by error");
        }

    }
}
