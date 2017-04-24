package com.matches.pages;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PreHomePage extends PageObject{

	
	public void clickSignIn() {
		WebElementFacade submitButton = this.find(MobileBy.AccessibilityId("SIGN IN / REGISTER")).withTimeoutOf(10,
				TimeUnit.SECONDS);
		submitButton.click();
	}
}
