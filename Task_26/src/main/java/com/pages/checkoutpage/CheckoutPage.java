package com.pages.checkoutpage;

import com.basepage.BasePage;
import com.utils.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage {

    //<editor-fold desc = "Checkout locators">
    private static final By ADD_TO_CART = By.xpath("//button[@class='standart-button add-cart']");
    private static final By CHECKOUT_BUTTON = By.xpath("//a[@class='standart-button checkout-btn']");
    private static final By PRODUCT_PRICE = By.xpath("//div[@class='product-sale-prices uppercase']");
    private static final By ORDER_SUM = By.xpath("//div[@class='total-block']//span[@class='sum']");
    private static final By REMOVE_ORDER = By.xpath("//div[@class='single-cart']//div[@class='close-button']");
    //</editor-fold>

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getADD_TO_CART() {
        return Helper.waitVisibility(ADD_TO_CART, driver);
    }

    public WebElement getCHECKOUT_BUTTON() {
        return Helper.waitVisibility(CHECKOUT_BUTTON, driver);
    }

    public WebElement getPRODUCT_PRICE() {
        return driver.findElement(PRODUCT_PRICE);
    }

    public WebElement getORDER_SUM() {
        return driver.findElement(ORDER_SUM);
    }

    public WebElement getREMOVE_ORDER() {
        return driver.findElement(REMOVE_ORDER);
    }
}
