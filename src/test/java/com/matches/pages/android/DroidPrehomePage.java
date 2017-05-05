package com.matches.pages.android;

import java.util.concurrent.TimeUnit;

import com.tools.Constants;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class DroidPrehomePage extends PageObject{

	public void clickSignIn() {
		this.find(By.id("com.matchesfashion.android:id/header_just_in")).withTimeoutOf(Constants.WAIT_TIME, TimeUnit.SECONDS).click();
	}
}
