package com.hillel.calculator;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

public class CalculatorParametrizedTest {

    private static Calculator calculator;

    @BeforeAll
    public static void init() {
        System.out.println("Calculator instance was created");
        calculator = new Calculator();
    }

    @BeforeEach
    public void beforeEachTest() {
        System.out.println("Before each test");
    }

    @ParameterizedTest
    @MethodSource("com.hillel.calculator.ParametrizedValues#getValuesSub")
    @DisplayName("Parametrized test sub a-b")
    public void testSub(int a, int b, int result) {
        int actualResult = calculator.sub(a, b);
        Assertions.assertEquals(result, actualResult, "actual result:" + actualResult + " expected was :" + result);
    }

    @AfterEach
    public void after() {
        System.out.println("After each test");
    }

    @AfterAll
    public static void close() {
        System.out.println("All tests were finished");
    }
}
