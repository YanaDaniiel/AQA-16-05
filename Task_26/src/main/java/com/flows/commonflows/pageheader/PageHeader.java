package com.flows.commonflows.pageheader;

import com.basepage.BasePage;
import com.utils.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageHeader extends BasePage {

    public PageHeader(WebDriver driver) {
        super(driver);
    }

    //<editor-fold desc = "Header locators">
    private static final By NAVBAR_FOR_HER =
            By.xpath("//ul[@class='main-nav flex']//a[@href='https://trends-hunters.com/ua/dlya-neyi/']");
    private static final By NAVBAR_WISHLIST_ICON = By.xpath("//img[@alt='wishlist icon']");
    private static final By MY_ACCOUNT = By.xpath("//a[@href='https://trends-hunters.com/ua/mij-akkaunt/']//img");
    private static final By MY_ACCOUNT_EXIT_BUTTON = By.xpath("//li//a[@class='exit']");
    //</editor-fold>

    public WebElement getNAVBAR_FOR_HER() {
        return Helper.waitVisibility(NAVBAR_FOR_HER, driver);
    }

    public WebElement getNAVBAR_WISHLIST_ICON() {
        return driver.findElement(NAVBAR_WISHLIST_ICON);
    }

    public WebElement getMY_ACCOUNT() {
        return driver.findElement(MY_ACCOUNT);
    }

    public WebElement getMY_ACCOUNT_EXIT_BUTTON() {
        return driver.findElement(MY_ACCOUNT_EXIT_BUTTON);
    }
}
