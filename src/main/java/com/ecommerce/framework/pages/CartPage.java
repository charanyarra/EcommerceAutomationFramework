package com.ecommerce.framework.pages;

import com.ecommerce.framework.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;
    WaitUtils waitUtils;

    By cartItem = By.className("inventory_item_name");

    public CartPage(WebDriver driver) {
        this.driver = driver;
        waitUtils = new WaitUtils(driver);
    }

    public boolean isProductDisplayed() {
        waitUtils.waitForElementVisible(cartItem);
        return driver.findElement(cartItem).isDisplayed();
    }
}