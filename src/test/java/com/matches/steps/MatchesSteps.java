package com.matches.steps;

import com.matches.pages.SendNotificationPage;
import com.matches.pages.SettingsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MatchesSteps extends ScenarioSteps{

	private static final long serialVersionUID = 1L;
	
	
	public SendNotificationPage sendNotificationPage;
	
	public SettingsPage settingsPage;
	
	@Step
	public void clickNotificationAllow(){
		sendNotificationPage.clickAllow();
	}
	
	@Step
	public void clickSettingsSubmit(){
		settingsPage.clickSubmit();
	}
	
}
