package com.hillel.calculator;

import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTest {

    private static Calculator calculator = new Calculator();

    @BeforeSuite
    public void initSuite() {
        calculator = new Calculator();
        System.out.println("Before suite");
    }

    @BeforeGroups
    public void initGroup() {
        calculator = new Calculator();
        System.out.println("Before group");
    }

    @BeforeTest
    public void printBeforeTest() {
        System.out.println("Before test");
    }

    @BeforeClass
    public static void initClass() {
        System.out.println("Calculator instance was created");
        calculator = new Calculator();
    }

    @BeforeMethod
    public void beforeEachTest() {
        System.out.println("Before each test");
    }

    @Test(groups = {"smoke", "regression"})
    public void testSum() {
        int a = 10;
        int b = 3;
        int expectedResult = 13;
        int actualResult = calculator.sum(a, b);
        Assert.assertEquals(actualResult, expectedResult, "actual result:" + actualResult + " expected was :" + expectedResult);
    }

    @Test(groups = {"smoke", "regression"})
    public void testSub() {
        int a = 10;
        int b = 4;
        int expectedResult = 6;
        int actualResult = calculator.sub(a, b);
        Assert.assertEquals(actualResult, expectedResult, "actual result:" + actualResult + " expected was :" + expectedResult);
    }

    @Test(groups = {"smoke", "regression"})
    public void testMul() {
        int a = 10;
        int b = 3;
        int expectedResult = 30;
        int actualResult = calculator.mul(a, b);
        Assert.assertEquals(actualResult, expectedResult, "actual result:" + actualResult + " expected was :" + expectedResult);
    }

    @Test(groups = {"smoke", "regression"})
    public void testDiv() {
        int a = 10;
        int b = 2;
        int expectedResult = 5;
        int actualResult = calculator.div(a, b);
        Assert.assertEquals(actualResult, expectedResult, "actual result:" + actualResult + " expected was :" + expectedResult);
    }

    @Test(expectedExceptions = ArithmeticException.class, groups = {"exceptions"})
    public void testDivBy0() {
        int a = 10;
        int b = 0;
        String expectedResult = "/ by zero";
        int actualResult = calculator.div(a, b);
        Assert.assertEquals(actualResult, expectedResult, "actual result:" + actualResult + " expected was :" + expectedResult);
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After each test");
    }

    @AfterClass
    public static void close() {
        System.out.println("All tests were finished");
    }
}
