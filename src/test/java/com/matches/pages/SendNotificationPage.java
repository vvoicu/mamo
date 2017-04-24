package com.matches.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;

public class SendNotificationPage extends PageObject{

	
	   //@iOSFindBy(xpath="//XCUIElementTypeApplication[1]//XCUIElementTypeTextField[contains(@name,'fbemail')]")
    //private MobileElement emailTextField; 
	
	@iOSFindBy(accessibility = "Allow")
	public MobileElement allowButton;
	
    //https://github.com/serenity-bdd/serenity-core/issues/660
    //http://appium.github.io/java-client/io/appium/java_client/ios/IOSDriver.html#method.summary
    public IOSDriver<IOSElement> iOSDriver() {
	return (IOSDriver<IOSElement>) ((WebDriverFacade) getDriver()).getProxiedDriver();
   }
    
    
    public void clickAllow(){
    	element(allowButton).waitUntilVisible();
    	allowButton.click();
    }
    
}
