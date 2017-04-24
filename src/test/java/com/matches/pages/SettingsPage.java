package com.matches.pages;

import java.util.concurrent.TimeUnit;

import com.tools.Constants;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;

public class SettingsPage extends PageObject {

	public void clickSubmit() {
		this.find(MobileBy.AccessibilityId("SUBMIT")).withTimeoutOf(Constants.WAIT_TIME, TimeUnit.SECONDS).click();
	}
}
