package com.trendshunterssignin;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SignUpTest {
    private WebDriver driver;

    //<editor-fold desc = "SignUp locators">
    private static final By signUpIcon = By.xpath("//span[@class='sign-up-btn']");
    private static final By signUpLogin = By.xpath("//input[@id='input-email']");
    private static final By signUpName = By.xpath("//input[@id='input-name']");
    private static final By signUpTelephone = By.xpath("//input[@id='main-reg-tel']");
    private static final By signUpPassword = By.xpath("//input[@id='input-password']");
    private static final By signUpPasswordConfirm = By.xpath("//input[@id='input-password-confirm']");
    private static final By signUpGender = By.xpath("//label[@for='select-gender-male']");
    private static final By signUpButton = By.xpath("//button[@class='standart-button mobileze_register']");
    private static final By signUpConfirmMessage = By.xpath("//p[@class='sign-up-popup-confirm-info']");
    private static final By signUpConfirmEmail = By.xpath("//p[@class='sign-up-popup-confirm-info']/span");
    //</editor-fold>

    @BeforeMethod
    public void init() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.edge.driver", "src/test/resources/msedgedriver");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://trends-hunters.com/ua");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testSignIn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(300));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(signUpIcon)));
        driver.findElement(signUpIcon).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(signUpLogin)));
        driver.findElement(signUpLogin).sendKeys("mylogin9@gmail.com");
        driver.findElement(signUpName).sendKeys("DummyUserTry9");
        driver.findElement(signUpTelephone).sendKeys("501234567");
        driver.findElement(signUpPassword).sendKeys("Qaz123wsx!1");
        driver.findElement(signUpPasswordConfirm).sendKeys("Qaz123wsx!1");
        driver.findElement(signUpGender).click();
        driver.findElement(signUpButton).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(signUpConfirmMessage)));
        Assert.assertTrue(driver.findElement(signUpConfirmMessage).isDisplayed());
        String signUpLoginMessage = driver.findElement(signUpConfirmEmail).getText();
        Assert.assertEquals(driver.findElement(signUpConfirmMessage).getText(), "На електронну пошту " + signUpLoginMessage + " відправлено лист для підтвердження реєстрації.");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After each test");
        driver.quit();
    }

    @AfterClass
    public static void close() {
        System.out.println("All tests were finished");
    }
}
