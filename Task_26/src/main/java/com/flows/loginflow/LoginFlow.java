package com.flows.loginflow;

import com.flows.baseflow.BaseFlow;
import com.pages.loginpage.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginFlow extends BaseFlow {
    private LoginPage loginPage;

    public LoginFlow(WebDriver driver) {
        super(driver);
        this.loginPage = new LoginPage(driver);
    }

    public void fillEmail(String email) {
        loginPage.getLOGIN_LINK().click();
        loginPage.getLOGIN_EMAIL().sendKeys(email);
    }

    public void fillPassword(String password) {
        loginPage.getLOGIN_PASSWORD().sendKeys(password);
    }

    public void submit() {
        loginPage.getLOGIN_BUTTON().click();
    }

    public void login(String email, String password) {
        fillEmail(email);
        fillPassword(password);
        submit();
    }
}
