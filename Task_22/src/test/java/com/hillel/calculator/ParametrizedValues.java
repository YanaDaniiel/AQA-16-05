package com.hillel.calculator;

import org.testng.annotations.DataProvider;

public class ParametrizedValues {

    @DataProvider(name = "dataProviderDiv")
    public Object[][] createData() {
        return new Object[][]{
                new Object[]{10, 2, 5},
                new Object[]{20, 4, 5}
        };
    }
}
