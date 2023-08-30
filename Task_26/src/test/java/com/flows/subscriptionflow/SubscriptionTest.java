package com.flows.subscriptionflow;

import com.flows.loginflow.LoginFlow;
import com.flows.logoutflow.LogoutFlow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class SubscriptionTest {
    private LoginFlow loginFlow;
    private LogoutFlow logoutFlow;
    private SubscriptionFlow subscriptionFlow;
    private WebDriver driver;

    @BeforeClass
    public void init() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.edge.driver", "src/test/resources/msedgedriver");
        driver = new EdgeDriver();
        loginFlow = new LoginFlow(driver);
        logoutFlow = new LogoutFlow(driver);
        subscriptionFlow = new SubscriptionFlow(driver);
        driver.manage().window().maximize();
        driver.get("https://trends-hunters.com/ua");
        loginFlow.login("yana.daniiel@nure.ua", "Qaz123wsx!1");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testSubscription() {
        driver.navigate().to("https://trends-hunters.com/ua");
        String sellerName = subscriptionFlow.subscribeForProductSeller(driver);
        String subscriptionAmount = subscriptionFlow.checkSubscriptionAmount();
        driver.navigate().refresh();
        Assert.assertEquals(subscriptionAmount, "1");
        String subscribedSellerName = subscriptionFlow.checkSubscriptionSellerName();
        Assert.assertEquals(subscribedSellerName, sellerName);
        subscriptionFlow.unsubscribeFromSeller(driver);
        String subscriptionAmountAfterUnsubscribe = subscriptionFlow.checkSubscriptionAmount();
        Assert.assertEquals(subscriptionAmountAfterUnsubscribe, "0");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After each test");
    }

    @AfterClass
    public void close() {
        logoutFlow.logout(driver);
        driver.quit();
        System.out.println("All tests were finished");
    }
}
