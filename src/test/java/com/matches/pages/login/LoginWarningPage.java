package com.matches.pages.login;

import java.util.concurrent.TimeUnit;

import com.tools.Constants;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;

public class LoginWarningPage extends PageObject{

	//TODO update with propper locators
	public String userWarningLocator = "//*[1]//*[1]//*[2]//*[1]//*[1]//*[3]//*[1]//*[1]//*[1]//*[1]//*[1]//*[3]//*[1]";
	public String passwordWarningLocator = "//*[1]//*[1]//*[2]//*[1]//*[1]//*[3]//*[1]//*[1]//*[1]//*[1]//*[1]//*[4]//*[1]";
//	public String passwordWarningLocator = "//*[contains(@name, 'Your password')]";
	
	public String getUserWarning() {
		try {
			return this.find(MobileBy.xpath(userWarningLocator)).withTimeoutOf(Constants.WAIT_TIME, TimeUnit.SECONDS).getAttribute("name");
		} catch (Exception e) {
			System.out.println("User warning message was not found");
			return "";
		}
	}
	
	
	public String getPasswordWarning() {
		try {
			return this.find(MobileBy.xpath(passwordWarningLocator)).withTimeoutOf(Constants.WAIT_TIME, TimeUnit.SECONDS).getAttribute("name");
		} catch (Exception e) {
			System.out.println("Password warning message was not found");
			return "";
		}
	}
}
