package com.ecommerce.framework.pages;

import com.ecommerce.framework.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    WaitUtils waitUtils;

    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        waitUtils = new WaitUtils(driver);
    }

    public void login(String username, String password) {
        waitUtils.waitForElementVisible(usernameField);
        driver.findElement(usernameField).sendKeys(username);

        waitUtils.waitForElementVisible(passwordField);
        driver.findElement(passwordField).sendKeys(password);

        waitUtils.waitForElementVisible(loginButton);
        driver.findElement(loginButton).click();
    }
}