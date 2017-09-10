package com.infi.page.objects;

import java.util.List;
import java.util.concurrent.TimeUnit;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;

public class FeedObject {

	@AndroidFindBy(id = "com.shopping.limeroad:id/tabs")
	@WithTimeout(time = 2, unit = TimeUnit.SECONDS)
	private List<MobileElement> TABS;

	@AndroidFindBy(id = "com.shopping.limeroad:id/tool_bar")
	@WithTimeout(time = 2, unit = TimeUnit.SECONDS)
	private MobileElement CART;

	@AndroidFindBy(id = "com.shopping.limeroad:id/tool_bar")
	@WithTimeout(time = 2, unit = TimeUnit.SECONDS)
	private MobileElement SETTINGS;

	@AndroidFindBy(id = "com.shopping.limeroad:id/tool_bar")
	@WithTimeout(time = 2, unit = TimeUnit.SECONDS)
	private List<MobileElement> SCRAP_LIST;

	@AndroidFindBy(id = "com.shopping.limeroad:id/tool_bar")
	@WithTimeout(time = 2, unit = TimeUnit.SECONDS)
	private List<MobileElement> STORY_LIST;

	@AndroidFindBy(id = "com.shopping.limeroad:id/tool_bar")
	@WithTimeout(time = 2, unit = TimeUnit.SECONDS)
	private MobileElement SEARCH;

}
