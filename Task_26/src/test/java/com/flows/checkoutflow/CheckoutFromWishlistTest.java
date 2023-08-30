package com.flows.checkoutflow;

import com.flows.loginflow.LoginFlow;
import com.flows.logoutflow.LogoutFlow;
import com.flows.wishlistflow.WishlistFlow;
import com.pages.wishlistpage.WishlistPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class CheckoutFromWishlistTest {
    private LoginFlow loginFlow;
    private LogoutFlow logoutFlow;
    private WishlistFlow wishlistFlow;
    private WishlistPage wishlistPage;
    private CheckoutFromWishlistFlow checkoutFromWishlistFlow;
    private WebDriver driver;

    @BeforeClass
    public void init() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.edge.driver", "src/test/resources/msedgedriver");
        driver = new EdgeDriver();
        loginFlow = new LoginFlow(driver);
        logoutFlow = new LogoutFlow(driver);
        wishlistFlow = new WishlistFlow(driver);
        wishlistPage = new WishlistPage(driver);
        checkoutFromWishlistFlow = new CheckoutFromWishlistFlow(driver);
        driver.manage().window().maximize();
        driver.get("https://trends-hunters.com/ua");
        loginFlow.login("yana.daniiel@nure.ua", "Qaz123wsx!1");
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.MILLISECONDS);
    }

    @Test
    public void testCheckoutFromWishlist() {
        driver.navigate().to("https://trends-hunters.com/ua");
        wishlistFlow.addToWishlist();
        driver.navigate().refresh();
        wishlistFlow.checkWishlist();
        String productPrice = checkoutFromWishlistFlow.addToCart();
        String orderSum = checkoutFromWishlistFlow.countOrderSum().toUpperCase();
        Assert.assertEquals(productPrice, orderSum);
        checkoutFromWishlistFlow.removeOrder();
        wishlistFlow.removeFromWishlist();
        Assert.assertTrue(wishlistPage.getGET_BACK_TO_PRODUCTS().isDisplayed());
        wishlistFlow.removeFromFavorites();
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
