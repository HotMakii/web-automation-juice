package com.testing.pageObjects.pages;

import org.openqa.selenium.By;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/order-completion")
public class OrderCompletionPage extends BasePage {
  public static By ORDER_COMPLETION_TITLE = text("Thank you for your purchase!");

  public void waitForPageToLoad(){
    getElement(ORDER_COMPLETION_TITLE).waitUntilVisible();
    logWeAreOnPage();
  }
}