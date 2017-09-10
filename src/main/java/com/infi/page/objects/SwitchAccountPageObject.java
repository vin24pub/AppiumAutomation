package com.infi.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SwitchAccountPageObject {

	@AndroidFindBy(xpath = "//*[@resource-id='android:id/text1']")
	public MobileElement signupEmail;

	@AndroidFindBy(xpath = "//*[@text='Enter a new email ID']")
	public MobileElement enterEmail;

	@AndroidFindBy(xpath = "//*[@resource-id='com.shopping.limeroad:id/edit_text_account_name']")
	public MobileElement userName;

	@AndroidFindBy(xpath = "//EditText[@resource-id='com.shopping.limeroad:id/edit_text_account_password']")
	public MobileElement passw;

	@AndroidFindBy(xpath = "//*[@resource-id='com.shopping.limeroad:id/email_log_in']")
	public MobileElement letMeIn;

}
