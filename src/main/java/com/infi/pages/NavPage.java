package com.infi.pages;

import org.openqa.selenium.support.PageFactory;

import com.appium.manager.CommonAppiumTest;
import com.infi.page.objects.LeftNavPageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NavPage extends CommonAppiumTest {

	LeftNavPageObject navPage = new LeftNavPageObject();

	public NavPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		waitForGivenTime(4);
		PageFactory.initElements(new AppiumFieldDecorator(driver), navPage);
	}

	public boolean clickOnHambuger() {
		if (isElementLoaded(navPage.HAMBURGER)) {
			navPage.HAMBURGER.click();
			return true;
		}

		return false;
	}

	public void clickAccountArrow() {
		if (isElementLoaded(navPage.Accountarrow)) {
			navPage.Accountarrow.click();
			
		}

	}

	public SwitchAccountPage clickSwitchAccount() {
		if (isElementLoaded(navPage.switchACC)) {
			navPage.switchACC.click();
			return new SwitchAccountPage(driver);
		}

		return null;
	}

}
