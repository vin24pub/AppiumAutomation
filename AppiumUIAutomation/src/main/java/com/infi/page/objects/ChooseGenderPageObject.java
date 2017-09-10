package com.infi.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ChooseGenderPageObject {

	@AndroidFindBy(id = "com.shopping.limeroad:id/men_tv")
	// @FindBy(xpath = "//*[@data-b='Men']")
	public MobileElement MEN;

	@AndroidFindBy(id = "com.shopping.limeroad:id/women_tv")
	// @FindBy(xpath = "//*[@data-b='Women']")
	public MobileElement WOMEN;

}
