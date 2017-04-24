package com.matches.pages.login;

import java.util.concurrent.TimeUnit;

import com.tools.Constants;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;

public class LoginWarningPage extends PageObject{

	
	public void clickLogin() {
		this.find(MobileBy.AccessibilityId("LOGIN")).withTimeoutOf(Constants.WAIT_TIME, TimeUnit.SECONDS).click();
	}
}
