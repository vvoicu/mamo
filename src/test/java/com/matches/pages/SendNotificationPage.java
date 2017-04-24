package com.matches.pages;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SendNotificationPage extends PageObject {

	public void clickAllow() {
		WebElementFacade allowButton = this.find(MobileBy.AccessibilityId("Allow")).withTimeoutOf(10,
				TimeUnit.SECONDS);
		allowButton.click();
	}

}