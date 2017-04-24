package com.matches.pages.ios.login;

import java.util.concurrent.TimeUnit;

import com.tools.Constants;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject {

	// TODO update locators with element specific attributes
	private String userNameLocator = "//*[1]//*[1]//*[2]//*[1]//*[1]//*[3]//*[1]//*[1]//*[1]//*[1]//*[1]//*[3]//*[1]";
	private String userPassLocator = "//*[1]//*[1]//*[2]//*[1]//*[1]//*[3]//*[1]//*[1]//*[1]//*[1]//*[1]//*[4]//*[1]";

	public void inputUserName(String userName) {
		this.find(MobileBy.xpath(userNameLocator)).withTimeoutOf(Constants.WAIT_TIME, TimeUnit.SECONDS).type(userName);
	}

	public void inputUserPass(String userPass) {
		this.find(MobileBy.xpath(userPassLocator)).withTimeoutOf(Constants.WAIT_TIME, TimeUnit.SECONDS).type(userPass);
	}

	public void clickLogin() {
		this.find(MobileBy.AccessibilityId("LOGIN")).withTimeoutOf(Constants.WAIT_TIME, TimeUnit.SECONDS).click();
	}
}
