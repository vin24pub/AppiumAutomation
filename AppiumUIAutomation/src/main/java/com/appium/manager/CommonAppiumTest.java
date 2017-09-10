package com.appium.manager;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.Status;
import com.infi.annotation.values.ElementDescription;
import com.infi.annotation.values.PageName;
import com.infi.report.factory.ExtentTestManager;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CommonAppiumTest {
	public AppiumDriver driver;
	
	public CommonAppiumTest(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}

	public void waitForPageToLoad(MobileElement id) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(id));
	}

	public void waitForElementToDisAppear(String id) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(id)));
	}

	public MobileElement waitForElement(MobileElement arg) {
		waitForPageToLoad(arg);
		MobileElement el = arg;
		return el;
	}
	public boolean isElementLoaded(MobileElement mElement) {
		if (mElement != null) {
			try {
				long start = System.currentTimeMillis();
				WebDriverWait wait = new WebDriverWait(driver, 5);
				wait.until(ExpectedConditions.elementToBeClickable(mElement));
				long finish = System.currentTimeMillis() - start;
				return true;
			} catch (Exception e) {
				return false;
			}
		} else
			return false;
	}

//	public void swipeRightUntilLogOutScreen() {
//		do {
//			swipeRight();
//		} while (!isElementPresent(By.id("org.wordpress.android:id/me_login_logout_text_view")));
//	}

	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}

	}

//	public void swipeLeftUntilTextExists(String expected) {
//		do {
//			swipeLeft();
//		} while (!driver.getPageSource().contains(expected));
//	}

//	public void swipeRight() {
//		Dimension size = driver.manage().window().getSize();
//		int startx = (int) (size.width * 0.9);
//		int endx = (int) (size.width * 0.20);
//		int starty = size.height / 2;
//		driver.swipe(startx, starty, endx, starty, 5000);
//	}

//	public void swipeLeft() {
//		Dimension size = driver.manage().window().getSize();
//		int startx = (int) (size.width * 0.8);
//		int endx = (int) (size.width * 0.20);
//		int starty = size.height / 2;
//		driver.swipe(startx, starty, endx, starty, 1000);
//	}

	public void setContext(String context) {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Set<String> contextNames = driver.getContextHandles();
		for (String contextName : contextNames) {
			System.out.println(contextName); // prints out something like
												// NATIVE_APP \n WEBVIEW_1
		}
		driver.context((String) contextNames.toArray()[1]); // set context to
															// WEBVIEW_1


	}

	public void clickBackButton() {
		driver.navigate().back(); // Closes keyboard
		// driver.navigate().back(); //Comes out of edit mode
	}

	public String getCurrentMethodName() {
		return Thread.currentThread().getStackTrace()[2].getMethodName();
	}

	public void logStepIntoExtentReport(String elementDescription, String action, String typeString) {
		ExtentTestManager.getTest().log(Status.INFO,
				elementDescription + "; " + withBoldHTML("Text") + ": " + typeString);
	}

	public String withBoldHTML(String string) {
		if (!string.trim().isEmpty()) {
			return "<b>" + string + "</b>";
		} else {
			return "";
		}
	}

	public String getPageObjectElemetDescription(Object pageObject, String fieldName) {
		try {
			return this.getClass().getAnnotation(PageName.class).value() + "::"
					+ pageObject.getClass().getField(fieldName).getAnnotation(ElementDescription.class).value();
		} catch (NoSuchFieldException e) {

			e.printStackTrace();
		}
		return "";
	}
	public void waitForGivenTime(int seconds)
	{
		try{
			
		
		Thread.sleep(seconds*1000);
		}catch(Exception e)
		{}
	}
}
