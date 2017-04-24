package com.matches.pages.ios;

import java.util.concurrent.TimeUnit;

import com.tools.Constants;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;

public class SendNotificationPage extends PageObject {

	public void clickAllow() {
		try {
			this.find(MobileBy.AccessibilityId("Allow")).withTimeoutOf(Constants.WAIT_TIME, TimeUnit.SECONDS).click();
		} catch (Exception e) {
			System.out.println("Application Notification was not displayed...");
		}

	}

}