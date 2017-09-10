package com.infi.page.objects;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HeaderPageObject {

	
	@AndroidFindBy(id = "com.shopping.limeroad:id/text_item_count")
	private AndroidElement CART;

	@AndroidFindBy(id = "com.shopping.limeroad:id/text_price")
	private AndroidElement SETTINGS;

	@AndroidFindBy(id = "com.shopping.limeroad:id/text_checkout")
	private AndroidElement SEARCH;

	@AndroidFindBy(id = "com.shopping.limeroad:id/text_checkout")
	private AndroidElement MENU;

	@AndroidFindBy(id = "com.shopping.limeroad:id/text_checkout")
	private AndroidElement SHOP;

	@AndroidFindBy(id = "com.shopping.limeroad:id/text_checkout")
	private AndroidElement HOT;

	@AndroidFindBy(id = "com.shopping.limeroad:id/text_checkout")
	private AndroidElement NOTIF;

	@AndroidFindBy(id="com.shopping.limeroad:id/share")
	private AndroidElement SHARE;
	
	@AndroidFindBy(xpath="//*[@content-desc='back_arrow']")
	private AndroidElement BACK;
		
	
	
	
}
