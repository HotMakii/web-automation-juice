package com.testing.pageObjects.pages;

import org.openqa.selenium.By;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/order-summary")
public class OrderSummaryPage extends BasketPage {
  // Locators
  // -------------------------------------------------------------------------------------------------------------------
    public static By ORDER_SUMMARY_TITLE =text("Order Summary");
    public static By PLACE_YOUR_ORDER_AND_PAY_BUTTON =css("button[id='checkoutButton']");
  // Public methods
  // -------------------------------------------------------------------------------------------------------------------
  public void waitForPageToLoad(){
    getElement(ORDER_SUMMARY_TITLE).waitUntilVisible();
    logWeAreOnPage();
  }
}