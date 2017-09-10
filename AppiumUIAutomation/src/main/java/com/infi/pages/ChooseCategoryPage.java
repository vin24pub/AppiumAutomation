package com.infi.pages;

import org.openqa.selenium.support.PageFactory;

import com.appium.manager.CommonAppiumTest;
import com.appium.manager.ConfigFileManager;
import com.infi.page.objects.ChooseCategoryPageObjects;
import com.infi.page.objects.ChoosePricePageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ChooseCategoryPage extends CommonAppiumTest {

	/* ******************* MALE ********************/

	public int TSHIRTS = 2;
	public int SHIRTS = 3;
	public int JEANS = 4;
	public int TROUSERS = 5;
	public int FOOTWEAR_M = 6;
	public int ACCESSORIES_M = 7;
	public int WATCHES = 8;
	public int HOME_AND_DECOR_M = 9;

	/* ******************* FEMALE ********************/
	public int KURTA_KURTIS = 2;
	public int TOPS = 3;
	public int DRESSES = 4;
	public int SAREES = 5;
	public int SUITS = 6;
	public int BAGS = 7;
	public int BOTTOMWEAR = 8;
	public int FOOTWEAR_W = 9;
	public int LINGERIE = 10;
	public int ACCESSORIES_W = 11;
	public int HOME_AND_DECOR_W = 12;

	ChooseCategoryPageObjects choose_category = new ChooseCategoryPageObjects();
	ChoosePricePageObject choose_price = new ChoosePricePageObject();

	public ChooseCategoryPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		waitForGivenTime(2);
		PageFactory.initElements(new AppiumFieldDecorator(driver), choose_category);
		PageFactory.initElements(new AppiumFieldDecorator(driver), choose_price);
	}

	public ChoosePricePage clickWomen_BOTTOMWEAR() {
		if (ConfigFileManager.configFileMap.get("APP_TYPE").equals("web")) {			
			choose_category.BOTTOMWEAR.click();
		} else {
			choose_category.CATEGORY_LIST.get(BOTTOMWEAR).click();
			waitForElement(choose_price.PRICE_RANGE.get(0));
			
		}
		return new ChoosePricePage(driver);
	}

	public ChoosePricePage clickWomen_BAGS() {

		if (ConfigFileManager.configFileMap.get("APP_TYPE").equals("web")) {
			choose_category.BAGS.click();
		} else {
			choose_category.CATEGORY_LIST.get(BAGS).click();
			waitForElement(choose_price.PRICE_RANGE.get(0));
		}
		return new ChoosePricePage(driver);
	}

	public ChoosePricePage clickWomen_DRESSES() {
		if (ConfigFileManager.configFileMap.get("APP_TYPE").equals("web")) {
			choose_category.DRESSES.click();
		} else {
			choose_category.CATEGORY_LIST.get(DRESSES).click();
			waitForElement(choose_price.PRICE_RANGE.get(0));

		}
		return new ChoosePricePage(driver);
	}

	public ChoosePricePage clickWomen_KURTA_KURTIS() {
		if (ConfigFileManager.configFileMap.get("APP_TYPE").equals("web")) {
			choose_category.KURTA_KURTIS.click();
		} else {
			choose_category.CATEGORY_LIST.get(KURTA_KURTIS).click();
			waitForElement(choose_price.PRICE_RANGE.get(0));

		}
		return new ChoosePricePage(driver);
	}

	public ChoosePricePage clickWomen_SAREES() {
		if (ConfigFileManager.configFileMap.get("APP_TYPE").equals("web")) {
			choose_category.SAREES.click();
		} else {
			choose_category.CATEGORY_LIST.get(SAREES).click();
			waitForElement(choose_price.PRICE_RANGE.get(0));

		}
		return new ChoosePricePage(driver);
	}

	public ChoosePricePage clickMen_TSHIRTS() {
		if (ConfigFileManager.configFileMap.get("APP_TYPE").equals("web")) {
			choose_category.TSHIRTS.click();
		} else {
			if(isElementLoaded(choose_category.CATEGORY_LIST.get(TSHIRTS)))
			choose_category.CATEGORY_LIST.get(TSHIRTS).click();
			waitForElement(choose_price.PRICE_RANGE.get(0));

		}
		
		return new ChoosePricePage(driver);
	}
}
