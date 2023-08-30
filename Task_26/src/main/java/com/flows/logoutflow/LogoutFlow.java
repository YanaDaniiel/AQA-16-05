package com.flows.logoutflow;

import com.flows.baseflow.BaseFlow;
import com.flows.commonflows.pageheader.PageHeader;
import com.utils.Helper;
import org.openqa.selenium.WebDriver;

public class LogoutFlow extends BaseFlow {
    private PageHeader pageHeader;

    public LogoutFlow(WebDriver driver) {
        super(driver);
        this.pageHeader = new PageHeader(driver);
    }

    public void logout(WebDriver driver) {
        Helper.hoverElement(driver, pageHeader.getMY_ACCOUNT());
        pageHeader.getMY_ACCOUNT_EXIT_BUTTON().click();
    }
}
