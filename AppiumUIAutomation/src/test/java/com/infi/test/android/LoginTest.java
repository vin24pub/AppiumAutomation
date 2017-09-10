package com.infi.test.android;

import com.appium.manager.AppiumDriverManager;
import com.appium.utils.ScreenShotManager;
import com.infi.annotation.values.Author;
import com.infi.annotation.values.Description;
import com.infi.pages.ChooseCategoryPage;
import com.infi.pages.ChooseGenderPage;
import com.infi.pages.ChoosePricePage;
import com.infi.pages.NavPage;
import com.infi.pages.SwitchAccountPage;
import com.infi.testdata.loginTestData;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.util.Iterator;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

@Description("validates Login user")
public class LoginTest {
	private AppiumDriver<MobileElement> driver;
    private ScreenShotManager sshot;
	@Test(description = "verify lite quiz and login feature")
	@Author(name = "Vinod Sharma")
	public void verifyLiteQuiz() throws Exception {
		driver = AppiumDriverManager.getDriver();
		sshot=new ScreenShotManager();
		ChooseGenderPage genderPage;
		ChooseCategoryPage categoryPage;
		ChoosePricePage pricePage;
		SwitchAccountPage switchPage;
		Map<String,String[]> testdata;
		NavPage navPage;
		genderPage = new ChooseGenderPage(driver);

		// play quiz
		categoryPage = genderPage.selectMen();
		pricePage = categoryPage.clickMen_TSHIRTS();
		Assert.assertTrue(pricePage.click("under1099"));
		navPage = new NavPage(driver);

		// open hemburger and switch account
		Assert.assertTrue(navPage.clickOnHambuger());
		navPage.clickAccountArrow();
		switchPage = navPage.clickSwitchAccount();

		// check whether user is login first time if not skip this
		if (switchPage.verifyUserIsLogin()) {
			switchPage.clickOnSwitchAccount();
			switchPage.clickOnNewMailID();
		}
		
		
		sshot.captureScreenShot("unable to login with no values");
		
		testdata=new loginTestData().getloginData();
		Iterator itr=testdata.entrySet().iterator();
		// verify unhappy path
		//all non-login test cases
		while (itr.hasNext()) {
			Map.Entry<String,String[]> pair = (Map.Entry<String,String[]>)itr.next();
		    String[] value = pair.getValue();
		    Assert.assertEquals(true, switchPage.validateInput(value[0], value[1]));    
		    
		}
		////////////happy path for login //////////
		// testcaseID:tr_login_17
		Assert.assertEquals(false, switchPage.validateInput("vinod.sharma@limeroad.com", "limeroad@123"));
		sshot.captureScreenShot("logged in user");
		// testcaseID:tr_login_18
		// verify with happy path
		//Assert.assertEquals(false, switchPage.validateInput(" vinod.sharma@limeroad.com", "limeroad@123"));
        
		// testcaseID:tr_login_19
		// verify with happy path
		//Assert.assertEquals(false, switchPage.validateInput("vinod.sharma@limeroad.com ", "limeroad@123"));
    
        // testcaseID:tr_login_20
        // verify with happy path
    	//Assert.assertEquals(false, switchPage.validateInput("vinod.sharma@LIMEroad.com ", "limeroad@123"));
	}

}
