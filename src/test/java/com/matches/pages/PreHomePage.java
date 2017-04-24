package com.matches.pages;

import java.util.concurrent.TimeUnit;

import com.tools.Constants;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;

public class PreHomePage extends PageObject {

	public void clickSignIn() {
		this.find(MobileBy.AccessibilityId("SIGN IN / REGISTER")).withTimeoutOf(Constants.WAIT_TIME, TimeUnit.SECONDS)
				.click();
	}
}
