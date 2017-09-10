package com.infi.pages;

import org.openqa.selenium.support.PageFactory;

import com.appium.manager.CommonAppiumTest;
import com.infi.page.objects.FeedObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FeedPage extends CommonAppiumTest {
	
	FeedObject feedpage = new FeedObject();
	public FeedPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		waitForGivenTime(2);
		PageFactory.initElements(new AppiumFieldDecorator(driver), feedpage);
		}

	
	
	
}
