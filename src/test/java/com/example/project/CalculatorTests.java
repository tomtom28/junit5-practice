/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


@DisplayName("Calculator")
class CalculatorTests {

	// Test 1 for Addition
	@Test
	@DisplayName("1 + 1 = 2")
	void addsOneAndTwo() {
		Calculator calculator = new Calculator();
		int expected = 2;
		int actual = calculator.add(1, 1);
		String messageIfFailure = "1 + 1 should equal 2";
		assertEquals(expected, actual, messageIfFailure);
	}

	// Test 2 for Addition
	@Test
	@DisplayName("-1 + 2 = 1")
	void addsNegativeOneAndTwo() {
		Calculator calculator = new Calculator();
		assertEquals(1, calculator.add(-1,2), "-1 + 2 should equal 1");
	}


	// -----------------------------------------------------------------------------------------------------------------


	// Intentionally Skip an Unfinished Test Case for Multiply
	@Test
	@DisplayName("Skipped Test: 2 * 3 = 6")
	@Ignore // <-- Just add the "Ignore" tag
	void multiplyTwoAndThree() {
		// TODO: Implement Test once multiply method is created
	}


	// -----------------------------------------------------------------------------------------------------------------


	// Intentionally Fail an Unfinished Test Case for Multiply
	@Test
	@DisplayName("2 * 3 = 6")
	void multiplyTwoAndThreeFailure() {
		fail("Untested Case: 2 * 3 = 6");
	}


	// -----------------------------------------------------------------------------------------------------------------


	// Two Combined Tests for Subtraction
	@Nested
	@DisplayName("Subtraction Operation")
	class SubtractionTests {
		@Test
		@DisplayName("1 - 1 = 0")
		void subtractOneAndOne() {
			Calculator calculator = new Calculator();
			assertEquals(0, calculator.subtract(1,1), "1 - 1 should equal 0");
		}

		@Test
		@DisplayName("1 - (-2) = 3")
		void subtractOneAndNegativeTwo() {
			Calculator calculator = new Calculator();
			assertEquals(3, calculator.subtract(1,-2), "1 - (-2) should equal 3");
		}
	}


	// -----------------------------------------------------------------------------------------------------------------


	// Three Combined Tests for Divide
	@Nested
	@DisplayName("Division Operation")
	class DivisionTests {

		@Test
		@DisplayName("6 / 2 = 3")
		void divideSixByTwo() {
			Calculator calculator = new Calculator();
			assertEquals(3, calculator.divide(6, 2), "6 / 2 should equal 3");
		}

		@Test
		@DisplayName("1 / 2 = 0.5")
		void divideOneByTwo() {
			Calculator calculator = new Calculator();
			// TODO: What do you think will happen?
			assertEquals(0.5, calculator.divide(1, 2), "1 / 2 should equal 0.5");
		}

		@Test
		@DisplayName("1 / 0 = ?")
		@Ignore // <-- TODO: Implement test
		void divideOneByZero() {
			Calculator calculator = new Calculator();
			// TODO: How do you think we can test this?
		}

	}

}
