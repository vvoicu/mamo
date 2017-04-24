package com.matches.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.matches.steps.MatchesSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class MatchesTest {

	@Managed(driver = "appium")
	private WebDriver driver;

	@Steps
	public MatchesSteps matchesSteps;

	private String userName = "mfautotest+3001@gmail.com";
	private String userPass = "Testing89";

	@Test
	public void matchesLoginTest() {
		matchesSteps.clickNotificationAllow();
		matchesSteps.clickSettingsSubmit();
		matchesSteps.clickOnSignIn();
		matchesSteps.performLogin(userName, userPass);
	}

}
