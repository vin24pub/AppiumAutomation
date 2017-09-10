package com.infi.page.objects;

import java.util.List;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ChooseCategoryPageObjects {

	public MobileElement heading;
	
	@AndroidFindBy(className = "android.widget.RelativeLayout")
	public List<MobileElement> CATEGORY_LIST;
	
	@FindBy(xpath = "//*[@data-b='tshirt']")
	public MobileElement TSHIRTS;
	@FindBy(xpath = "//*[@data-b='shirts']")
	public MobileElement SHIRTS;
	@FindBy(xpath = "//*[@data-b='menjeans']")
	public MobileElement JEANS;
	@FindBy(xpath = "//*[@data-b='trousers']")
	public MobileElement TROUSERS ;
	@FindBy(xpath = "//*[@data-b='shoes']")
	public MobileElement FOOTWEAR_M;
	
	
	@FindBy(xpath = "//*[@data-b='kurta']")
	public MobileElement KURTA_KURTIS ;
	@FindBy(xpath = "//*[@data-b='tops']")
	public MobileElement TOPS ;
	@FindBy(xpath = "//*[@data-b='dresses']")
	public MobileElement DRESSES ;
	@FindBy(xpath = "//*[@data-b='sarees']")
	public MobileElement SAREES ;
	@FindBy(xpath = "//*[@data-b='suits']")
	public MobileElement SUITS ;
	@FindBy(xpath = "//*[@data-b='bags']")
	public MobileElement BAGS ;
	@FindBy(xpath = "//*[@data-b='jeans']")
	public MobileElement BOTTOMWEAR ;

}
