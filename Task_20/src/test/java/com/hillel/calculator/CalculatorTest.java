package com.hillel.calculator;

import org.junit.jupiter.api.*;

public class CalculatorTest {

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

    @Test
    @DisplayName("Test sum a+b")
    public void testSum() {
        int a = 10;
        int b = 3;
        int result = 13;
        int actualResult = calculator.sum(a, b);
        Assertions.assertEquals(result, actualResult, "actual result:" + actualResult + " expected was :" + result);
    }

    @Test
    @DisplayName("Test sub a-b")
    public void testSub() {
        int a = 10;
        int b = 4;
        int result = 6;
        int actualResult = calculator.sub(a, b);
        Assertions.assertEquals(result, actualResult, "actual result:" + actualResult + " expected was :" + result);
    }

    @Test
    @DisplayName("Test mul a*b")
    public void testMul() {
        int a = 10;
        int b = 3;
        int result = 30;
        int actualResult = calculator.mul(a, b);
        Assertions.assertEquals(result, actualResult, "actual result:" + actualResult + " expected was :" + result);
    }

    @Test
    @DisplayName("Test div a/b")
    public void testDiv() {
        int a = 10;
        int b = 2;
        int result = 5;
        int actualResult = calculator.div(a, b);
        Assertions.assertEquals(result, actualResult, "actual result:" + actualResult + " expected was :" + result);
    }

    @Test
    @DisplayName("Test div by 0")
    public void testDivBy0() {
        int a = 10;
        int b = 0;
        ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class, () -> calculator.div(a, b));
        Assertions.assertEquals("/ by zero", exception.getMessage());
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
