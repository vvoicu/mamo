package com.matches.tests.cucumber;

import org.junit.Assert;

import com.matches.steps.MatchesSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class StepDefinitions {

	@Steps
	public MatchesSteps matchesSteps;

	@Given("^I allow application Notifications$")
	public void givenIAllowApplicationNotifications() {
		matchesSteps.clickNotificationAllow();
	}

	@Given("^I submit default settings$")
	public void givenISubmitDefaultSettings() {
		matchesSteps.clickSettingsSubmit();
	}

	@When("^I go to the Sign In page$")
	public void whenTheUserLooksUpTheDefinitionOf() {
		matchesSteps.clickOnSignIn();
	}

	@When("^I perform the login with '(.*)' and '(.*)'$")
	public void whenIPerformTheLoginWithUsernameAndPassword(String userName, String userPass) {
		matchesSteps.performLogin(userName, userPass);
	}

	@Then("^the login warning message should be '(.*)'$")
	public void thenTheLoginWarningMessageShouldBe(String message) {
		String actualWarning = matchesSteps.getUserNameWarning();
		Assert.assertTrue("Login warning not as expected. Actual: " + actualWarning, actualWarning.contains(message));
	}
}
