package com.matches.tests;

import static com.tools.AppiumServer.startAppiumServer;
import static com.tools.AppiumServer.stopAppiumServer;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.matches.pages.SendNotificationPage;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class MatchesTest {

	@Managed
	WebDriver appiumDriver;

	@Steps
	public SendNotificationPage iOSsteps;

	@BeforeClass
	public static void startAppium() {
		startAppiumServer();
	}

	@AfterClass
	public static void stopAppium() {
		stopAppiumServer();
	}

	@Test
	public void verifySauceiOSAppTest() {
		iOSsteps.clickAllow();
	}

}
