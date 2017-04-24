package com.matches.pages.extra;

import java.util.concurrent.TimeUnit;

import com.tools.Constants;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class IosKeyboardPage extends PageObject{

	
	public void closeKeyboard(){
			WebElementFacade doneButton = this.find(MobileBy.AccessibilityId("Done")).withTimeoutOf(Constants.WAIT_TIME, TimeUnit.SECONDS);
			doneButton.click();
		}
}
