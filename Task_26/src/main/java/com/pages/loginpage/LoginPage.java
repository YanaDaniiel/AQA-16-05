package com.pages.loginpage;

import com.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    //<editor-fold desc = "Login locators">
    private static final By LOGIN_LINK = By.xpath("//div[@class='unregistered-link']//span[@class='log-in-btn']");
    private static final By LOGIN_EMAIL = By.xpath("//input[@class='input-text mobileze_email']");
    private static final By LOGIN_PASSWORD = By.xpath("//input[@class='input-text mobileze_pass']");
    private static final By LOGIN_BUTTON = By.xpath("//button[@class='standart-button mobileze_login']");
    //</editor-fold>

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLOGIN_LINK() {
        return driver.findElement(LOGIN_LINK);
    }

    public WebElement getLOGIN_EMAIL() {
        return driver.findElement(LOGIN_EMAIL);
    }

    public WebElement getLOGIN_PASSWORD() {
        return driver.findElement(LOGIN_PASSWORD);
    }

    public WebElement getLOGIN_BUTTON() {
        return driver.findElement(LOGIN_BUTTON);
    }
}
