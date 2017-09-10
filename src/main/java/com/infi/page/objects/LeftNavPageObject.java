package com.infi.page.objects;

import java.util.List;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LeftNavPageObject {

	@AndroidFindBy(xpath = "//*[@content-desc='hamburger_menu']")
	public AndroidElement HAMBURGER;

	@AndroidFindBy(xpath = "//*[@resource-id='com.shopping.limeroad:id/lblListHeaderIndicator']")
	public AndroidElement Accountarrow;
	
	@AndroidFindBy(xpath = "//*[@text='Login / Switch Account']")
	public AndroidElement switchACC;
	
	
	
	@AndroidFindBy(className = "android.widget.TextView")
	public AndroidElement MYPROFILE;

	@AndroidFindBy(className = "android.widget.Button")
	public AndroidElement MYACCOUNT;

	@AndroidFindBy(className = "android.widget.Button")
	public AndroidElement MYORDERS;

	@AndroidFindBy(className = "android.widget.Button")
	public AndroidElement MYRETURN;

	@AndroidFindBy(className = "android.widget.Button")
	public AndroidElement MYWISHLIST;

	@AndroidFindBy(className = "android.widget.Button")
	public AndroidElement EDITPROFILE;

	@AndroidFindBy(className = "android.widget.Button")
	public List<AndroidElement> MEN;

	@AndroidFindBy(className = "android.widget.Button")
	public List<AndroidElement> MEN_SUB;

	@AndroidFindBy(className = "android.widget.Button")
	public List<AndroidElement> WOMEN;

	@AndroidFindBy(className = "android.widget.Button")
	public List<AndroidElement> WOMEN_SUB;

	@AndroidFindBy(className = "android.widget.Button")
	public AndroidElement SWTICHACC;

}
