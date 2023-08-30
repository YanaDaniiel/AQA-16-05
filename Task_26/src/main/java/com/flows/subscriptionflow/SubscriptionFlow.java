package com.flows.subscriptionflow;

import com.flows.commonflows.pageheader.PageHeader;
import com.pages.productpage.ProductPage;
import com.pages.wishlistpage.WishlistPage;
import com.utils.Helper;
import org.openqa.selenium.WebDriver;

public class SubscriptionFlow {
    private WishlistPage wishlistPage;
    private PageHeader pageHeader;
    private ProductPage productPage;

    public SubscriptionFlow(WebDriver driver) {
        wishlistPage = new WishlistPage(driver);
        pageHeader = new PageHeader(driver);
        productPage = new ProductPage(driver);
    }

    public String subscribeForProductSeller(WebDriver driver) {
        pageHeader.getNAVBAR_FOR_HER().click();
        productPage.getPRODUCT_BRAND().click();
        Helper.scrollToPageElement(driver, productPage.getSUBSCRIBE_BUTTON());
        String sellerName = productPage.getSUBSCRIBE_SELLER_NAME().getText();
        productPage.getSUBSCRIBE_BUTTON().click();
        return sellerName;
    }

    public String checkSubscriptionAmount() {
        pageHeader.getNAVBAR_WISHLIST_ICON().click();
        return wishlistPage.getFOLLOWING_AMOUNT().getText();
    }

    public String checkSubscriptionSellerName() {
        wishlistPage.getFOLLOWING_LINK().click();
        return wishlistPage.getFOLLOWING_SELLER_NAME().getText();
    }

    public void unsubscribeFromSeller(WebDriver driver) {
        productPage.getSUBSCRIPTIONS_POPUP_CLOSE_BUTTON().click();
        pageHeader.getNAVBAR_FOR_HER().click();
        productPage.getPRODUCT_BRAND().click();
        Helper.scrollToPageElement(driver, productPage.getUNSUBSCRIBE_BUTTON());
        productPage.getUNSUBSCRIBE_BUTTON().click();
    }
}
