package com.hillel.calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorParametrizedTest {

    private Calculator calculator = new Calculator();

    @Test(dataProvider = "dataProviderDiv", dataProviderClass = ParametrizedValues.class, groups = {"parametrized"})
    public void divisionTest(int a, int b, int expectedResult) {
        int actualResult = calculator.div(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
