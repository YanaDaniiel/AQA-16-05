package com.flows.checkoutflow;

import com.pages.checkoutpage.CheckoutPage;
import org.openqa.selenium.WebDriver;

public class CheckoutFromWishlistFlow {
    private CheckoutPage checkoutPage;

    public CheckoutFromWishlistFlow(WebDriver driver) {
        checkoutPage = new CheckoutPage(driver);
    }

    public String addToCart() {
        checkoutPage.getADD_TO_CART().click();
        checkoutPage.getCHECKOUT_BUTTON().click();
        return checkoutPage.getPRODUCT_PRICE().getText();
    }

    public String countOrderSum() {
        return checkoutPage.getORDER_SUM().getText();
    }


    public void removeOrder() {
        checkoutPage.getREMOVE_ORDER().click();
    }
}
