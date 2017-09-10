package com.infi.pages;

import org.openqa.selenium.support.PageFactory;
import com.appium.manager.CommonAppiumTest;
import com.infi.page.objects.SwitchAccountPageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SwitchAccountPage extends CommonAppiumTest {

	SwitchAccountPageObject switchPage = new SwitchAccountPageObject();

	public SwitchAccountPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		waitForGivenTime(2);
		PageFactory.initElements(new AppiumFieldDecorator(driver), switchPage);
	}

	public boolean clickOnSwitchAccount() {
		if (isElementLoaded(switchPage.signupEmail)) {
			switchPage.signupEmail.click();
		}

		return false;
	}

	public boolean clickOnNewMailID() {
		if (isElementLoaded(switchPage.enterEmail)) {
			switchPage.enterEmail.click();
		}

		return false;
	}

	public boolean enterUserName(String username) {
		if (isElementLoaded(switchPage.userName)) {
			switchPage.userName.clear();
			switchPage.userName.sendKeys(username);
		}

		return false;
	}

	public boolean enterPassword(String pass) {
		if (isElementLoaded(switchPage.passw)) {
			switchPage.passw.clear();
			switchPage.passw.sendKeys(pass);
		}

		return false;
	}

	public FeedPage clickOnLetMeIn() {
		if (isElementLoaded(switchPage.letMeIn)) {
			switchPage.letMeIn.click();
			return new FeedPage(driver);
		}

		return null;
	}

	public boolean verifyUserIsLogin() {
		if (isElementLoaded(switchPage.signupEmail)) {
			return true;
		} else
			return false;
	}

	public boolean verifyUnableToLogin() {
		return isElementLoaded(switchPage.letMeIn);
	}

	public boolean validateInput(String username, String password) {
		enterUserName(username);
		enterPassword(password);
		clickOnLetMeIn();
		return verifyUnableToLogin();

	}
}
