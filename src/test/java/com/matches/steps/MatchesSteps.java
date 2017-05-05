package com.matches.steps;

import com.matches.pages.android.DroidPrehomePage;
import com.matches.pages.ios.PreHomePage;
import com.matches.pages.ios.SendNotificationPage;
import com.matches.pages.ios.SettingsPage;
import com.matches.pages.ios.extra.IosKeyboardPage;
import com.matches.pages.ios.login.LoginPage;
import com.matches.pages.ios.login.LoginWarningPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class MatchesSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;

	// IOS
	public SendNotificationPage sendNotificationPage;
	public SettingsPage settingsPage;
	public PreHomePage preHomePage;
	public LoginPage loginPage;
	public IosKeyboardPage iosKeyboard;
	public LoginWarningPage loginWarningPage;

	// ANDROID
	public DroidPrehomePage prehomePage;

	@Step
	public void clickNotificationAllow() {
		sendNotificationPage.clickAllow();
	}

	@Step
	public void clickSettingsSubmit() {
		settingsPage.clickSubmit();
	}

	@Step
	public void clickOnSignIn() {
		
		String platform = System.getProperty("appium.platformName");
		
		if (platform != null && platform.contains("iOS"))
			preHomePage.clickSignIn();
		else
			prehomePage.clickSignIn();
	}

	@StepGroup
	public void performLogin(String user, String pass) {
		inputUserName(user);
		inputUserPass(pass);
		iosKeyboard.closeKeyboard();
		clickLogin();
	}

	@Step
	public void inputUserName(String user) {
		loginPage.inputUserName(user);
	}

	@Step
	public void inputUserPass(String pass) {
		loginPage.inputUserPass(pass);
	}

	@Step
	public void clickLogin() {
		loginPage.clickLogin();
	}

	@Step
	public String getUserNameWarning() {
		return loginWarningPage.getUserWarning();
	}

	@Step
	public String getUserPassWarning() {
		return loginWarningPage.getPasswordWarning();
	}
}
