package com.infi.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.appium.manager.CommonAppiumTest;
import com.infi.page.objects.ChoosePricePageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ChoosePricePage extends CommonAppiumTest {

	ChoosePricePageObject choose_price = new ChoosePricePageObject();
		public ChoosePricePage(AppiumDriver<MobileElement> driver) {
		super(driver);
		waitForGivenTime(2);
		PageFactory.initElements(new AppiumFieldDecorator(driver,15,TimeUnit.SECONDS), choose_price);
	}

	public boolean click(String findbyText) {
		boolean status = false;

		for (MobileElement price : choose_price.PRICE_RANGE) {
			System.out.println("vaues " + price.getText().toLowerCase().replaceAll("[^a-z0-9]", ""));
			if (price.getText().toLowerCase().replaceAll("[^a-z0-9]", "").equals(findbyText)) {
				if(isElementLoaded(price))
				price.click();
				status = true;
			}
		}
		return status;
	}

}
