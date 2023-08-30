package com.pages.productpage;

import com.basepage.BasePage;
import com.utils.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    //<editor-fold desc = "Product page locators">
    private static final By PRODUCT_BRAND = By.xpath("//div[@class='producer-title']/span");
    private static final By ADD_TO_WISHLIST_BUTTON = By.xpath("//a[@class='add-like ']");
    private static final By SUBSCRIBE_SELLER_NAME = By.xpath("//p[@class='nick-name']//a");
    private static final By SUBSCRIBE_BUTTON = By.xpath("//button[@class='subscribe md_s']");
    private static final By SUBSCRIPTIONS_POPUP_CLOSE_BUTTON =
            By.xpath("//div[@class='follow-popup following-popup popup active']/div[@class='close-button']");
    private static final By UNSUBSCRIBE_BUTTON = By.xpath("//button[@class='subscribe subscribed md_s']");
    //</editor-fold>

    public WebElement getPRODUCT_BRAND() {
        return driver.findElement(PRODUCT_BRAND);
    }

    public WebElement getADD_TO_WISHLIST_BUTTON() {
        return driver.findElement(ADD_TO_WISHLIST_BUTTON);
    }

    public WebElement getSUBSCRIBE_SELLER_NAME() {
        return driver.findElement(SUBSCRIBE_SELLER_NAME);
    }

    public WebElement getSUBSCRIPTIONS_POPUP_CLOSE_BUTTON() {
        return Helper.waitVisibility(SUBSCRIPTIONS_POPUP_CLOSE_BUTTON, driver);
    }

    public WebElement getSUBSCRIBE_BUTTON() {
        return driver.findElement(SUBSCRIBE_BUTTON);
    }

    public WebElement getUNSUBSCRIBE_BUTTON() {
        return driver.findElement(UNSUBSCRIBE_BUTTON);
    }
}
