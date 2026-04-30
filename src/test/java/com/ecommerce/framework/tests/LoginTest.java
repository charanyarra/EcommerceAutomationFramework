package com.ecommerce.framework.tests;

import com.ecommerce.framework.base.BaseTest;
import com.ecommerce.framework.pages.CartPage;
import com.ecommerce.framework.pages.InventoryPage;
import com.ecommerce.framework.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void verifyAddToCart() {

        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);

        loginPage.login("standard_user", "secret_sauce");
        inventoryPage.clickAddToCart();
        inventoryPage.clickCartIcon();

        Assert.assertTrue(cartPage.isProductDisplayed());
    }
}