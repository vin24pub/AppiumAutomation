package com.infi.pages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.appium.manager.AppiumDriverManager;
import com.appium.manager.CommonAppiumTest;
import com.appium.utils.ScreenShotManager;
import com.infi.page.objects.LoginPageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends CommonAppiumTest {

	LoginPageObject login = new LoginPageObject();

	public LoginPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		//waitForGivenTime(10);
		PageFactory.initElements(new AppiumFieldDecorator(AppiumDriverManager.getDriver()), login);
	}

	public boolean enterUserAndPassword(String user, String pass) {
		waitForElement(login.EMAIL);
		logStepIntoExtentReport("", "set username and password", "success");
		try {
		if(isElementLoaded(login.EMAIL))
		{	
		login.EMAIL.sendKeys(user);
		login.PASSWORD.sendKeys(pass);
		new ScreenShotManager().captureScreenShot("Login sucess");
		return true;
		}	
		} catch (InterruptedException | IOException e) {

			e.printStackTrace();
		}
		return false;
	}

	public FeedPage signIn() {
		login.LOGIN.click();
		return new FeedPage(driver);
	}
	public FeedPage validateInput(String username, String password) {
		enterUserAndPassword(username,password);
		
		return signIn();

	}
}
