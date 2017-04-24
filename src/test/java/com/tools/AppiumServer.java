package com.tools;

import static com.tools.Property.APPIUM_HOST;
import static com.tools.Property.APPIUM_PORT;
import static com.tools.Property.APPIUM_LOG_LEVEL;


import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AppiumServer {

	private final static AppiumDriverLocalService service;

	static {
		System.out.println(APPIUM_HOST + "    " + APPIUM_PORT + "     " + APPIUM_LOG_LEVEL + "     " + GeneralServerFlag.LOG_LEVEL);

		service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().withIPAddress(Constants.APPIUM_HOST).usingPort(Integer.parseInt(Constants.APPIUM_PORT)));
	}

	public static void startAppiumServer() {
		try {
			service.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void stopAppiumServer() {
		try {
			if (service.isRunning()) {
				service.stop();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
