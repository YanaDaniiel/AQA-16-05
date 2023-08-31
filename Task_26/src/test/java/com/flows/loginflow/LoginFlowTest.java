package com.flows.loginflow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class LoginFlowTest {

    private LoginFlow loginFlow;
    private static WebDriver driver;

    @BeforeClass
    public void init() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.edge.driver", "src/test/resources/msedgedriver");
        driver = new EdgeDriver();
        loginFlow = new LoginFlow(driver);
        driver.manage().window().maximize();
        driver.get("https://trends-hunters.com/ua");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testLogin() {
        driver.navigate().to("https://trends-hunters.com/ua");
        loginFlow.login("yana.daniiel@nure.ua", "Qaz123wsx!1");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After each test");
    }

    @AfterClass
    public void close() {
        driver.quit();
        System.out.println("All tests were finished");
    }
}
