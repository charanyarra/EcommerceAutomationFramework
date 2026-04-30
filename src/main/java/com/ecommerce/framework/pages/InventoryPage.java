package com.ecommerce.framework.pages;

import com.ecommerce.framework.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {

    WebDriver driver;
    WaitUtils waitUtils;

    By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    By cartIcon = By.className("shopping_cart_link");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        waitUtils = new WaitUtils(driver);
    }

    public void clickAddToCart() {
        waitUtils.waitForElementVisible(addToCartButton);
        driver.findElement(addToCartButton).click();
    }

    public void clickCartIcon() {
        waitUtils.waitForElementVisible(cartIcon);
        driver.findElement(cartIcon).click();
    }
}