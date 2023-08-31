package com.flows.wishlistflow;

import com.flows.commonflows.pageheader.PageHeader;
import com.pages.productpage.ProductPage;
import com.pages.wishlistpage.WishlistPage;
import org.openqa.selenium.WebDriver;

public class WishlistFlow {
    private WishlistPage wishlistPage;
    private PageHeader pageHeader;
    private ProductPage productPage;

    public WishlistFlow(WebDriver driver) {
        wishlistPage = new WishlistPage(driver);
        pageHeader = new PageHeader(driver);
        productPage = new ProductPage(driver);
    }

    public String addToWishlist() {
        pageHeader.getNAVBAR_FOR_HER().click();
        String productBrand = productPage.getPRODUCT_BRAND().getText();
        productPage.getPRODUCT_BRAND().click();
        productPage.getADD_TO_WISHLIST_BUTTON().click();
        return productBrand;
    }

    public String checkWishlist() {
        pageHeader.getNAVBAR_WISHLIST_ICON().click();
        return productPage.getPRODUCT_BRAND().getText();
    }

    public void removeFromWishlist() {
        pageHeader.getNAVBAR_WISHLIST_ICON().click();
        wishlistPage.getREMOVE_FROM_WISHLIST().click();
    }

    public void removeFromFavorites() {
        pageHeader.getNAVBAR_FOR_HER().click();
        productPage.getPRODUCT_BRAND().click();
        wishlistPage.getREMOVE_FROM_FAVORITES().click();
    }
}
