package com.infi.page.objects;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;

public class LoginPageObject {

	@FindBy(id="emlb")
	public MobileElement EMAIL;
	
	@FindBy(id="pslb")
	public MobileElement PASSWORD;
	
	@FindBy(xpath="//*[@name='commit']")
	public MobileElement LOGIN;
	
	@FindBy(xpath="//*[@name='commit']")
	public MobileElement FORGOT;
	
	
	@FindBy(xpath="//*[@name='commit']")
	public MobileElement SIGNUP;
	
	
}
