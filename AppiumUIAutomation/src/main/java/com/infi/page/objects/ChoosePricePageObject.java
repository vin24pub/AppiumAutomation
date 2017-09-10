package com.infi.page.objects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;

public class ChoosePricePageObject {

	@AndroidFindBy(id = "com.shopping.limeroad:id/header_tv")
	public MobileElement choosePriceRangeText;

	@WithTimeout(time = 2000, unit = TimeUnit.SECONDS)
	@AndroidFindBy(xpath = "//android.widget.TextView")
	@FindBy(xpath = "//div[@id='p1']//*[@data-a='price']")
	public List<MobileElement> PRICE_RANGE;

}