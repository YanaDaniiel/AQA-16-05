package com.pages.wishlistpage;

import com.basepage.BasePage;
import com.utils.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishlistPage extends BasePage {

    //<editor-fold desc = "Wishlist locators">
    private static final By REMOVE_FROM_WISHLIST = By.xpath("//div[@class='close-button']//a");
    private static final By REMOVE_FROM_FAVORITES = By.xpath("//a[@class='add-like in-fav']");
    private static final By GET_BACK_TO_PRODUCTS = By.xpath("//a[@class='dark-button button-width']");
    private static final By FOLLOWING_LINK = By.xpath("//div[@class='following']");
    private static final By FOLLOWING_AMOUNT =
            By.xpath("//div[@class='following']/p[@class='followers-quantity']");
    private static final By FOLLOWING_SELLER_NAME = By.xpath("//p[@class='name']/a");
    //</editor-fold>

    public WishlistPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getREMOVE_FROM_WISHLIST() {
        return Helper.waitVisibility(REMOVE_FROM_WISHLIST, driver);
    }

    public WebElement getREMOVE_FROM_FAVORITES() {
        return Helper.waitVisibility(REMOVE_FROM_FAVORITES, driver);
    }

    public WebElement getGET_BACK_TO_PRODUCTS() {
        return Helper.waitVisibility(GET_BACK_TO_PRODUCTS, driver);
    }

    public WebElement getFOLLOWING_LINK() {
        return Helper.waitVisibility(FOLLOWING_LINK, driver);
    }

    public WebElement getFOLLOWING_AMOUNT() {
        return Helper.waitVisibility(FOLLOWING_AMOUNT, driver);
    }

    public WebElement getFOLLOWING_SELLER_NAME() {
        return Helper.waitVisibility(FOLLOWING_SELLER_NAME, driver);
    }
}
