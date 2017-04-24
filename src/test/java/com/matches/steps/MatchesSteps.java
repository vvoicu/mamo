package com.matches.steps;

import com.matches.pages.PreHomePage;
import com.matches.pages.SendNotificationPage;
import com.matches.pages.SettingsPage;
import com.matches.pages.extra.IosKeyboardPage;
import com.matches.pages.login.LoginPage;
import com.matches.pages.login.LoginWarningPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class MatchesSteps extends ScenarioSteps{

	private static final long serialVersionUID = 1L;
	
	public SendNotificationPage sendNotificationPage;
	public SettingsPage settingsPage;
	public PreHomePage preHomePage;
	public LoginPage loginPage;
	public IosKeyboardPage iosKeyboard;
	public LoginWarningPage loginWarningPage;
	
	@Step
	public void clickNotificationAllow(){
		sendNotificationPage.clickAllow();
	}
	
	@Step
	public void clickSettingsSubmit(){
		settingsPage.clickSubmit();
	}
	
	@Step
	public void clickOnSignIn(){
		preHomePage.clickSignIn();
	}

	@StepGroup
	public void performLogin(String user,String pass){
		loginPage.inputUserName(user);
		loginPage.inputUserPass(pass);
		iosKeyboard.closeKeyboard();
		loginPage.clickLogin();
	}
	
	@Step
	public String getUserNameWarning(){
		return loginWarningPage.getUserWarning();
	}
	
	@Step
	public String getUserPassWarning(){
		return loginWarningPage.getPasswordWarning();
	}
}
