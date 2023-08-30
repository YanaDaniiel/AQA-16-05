package com.flows.baseflow;

import com.flows.commonflows.pageheader.PageHeader;
import org.openqa.selenium.WebDriver;

public class BaseFlow {
    private PageHeader pageHeader;

    public BaseFlow(WebDriver driver) {
        this.pageHeader = new PageHeader(driver);
    }

    public PageHeader getHeaderFlow() {
        return pageHeader;
    }
}
