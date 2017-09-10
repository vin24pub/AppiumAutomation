package com.infi.webtest;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.appium.utils.ScreenShotManager;
import com.infi.pages.LoginPage;
import com.infi.test.base.BaseTest;
import com.infi.testdata.loginTestData;

public class MsiteLoginTest extends BaseTest {
	ScreenShotManager sshot;
	public MsiteLoginTest() {
	}
	

	@Test(priority = 1, description = "Login-in to limeroad")
	public void loginLimeroad() throws InterruptedException, IOException {
       LoginPage loginPage = getLoginPage();
       Map<String,String[]> testdata;
		//Assert.assertNotEquals(null, loginPage);
       sshot=new ScreenShotManager();
       
    // verify unhappy path
    		// testcaseID:tr_login_01
       testdata=new loginTestData().getloginData();
		Iterator itr=testdata.entrySet().iterator();
		// verify unhappy path
		//all non-login test cases
		while (itr.hasNext()) {
			Map.Entry<String,String[]> pair = (Map.Entry<String,String[]>)itr.next();
		    String[] value = pair.getValue();
		    Assert.assertEquals(null, loginPage.validateInput(value[0],value[1]));
        	// testcaseID:tr_login_16
    		
		}
    		////////////happy path for login //////////
    		// testcaseID:tr_login_17
    		Assert.assertNotEquals(null, loginPage.validateInput("vinod.sharma@limeroad.com", "limeroad@123"));
    		sshot.captureScreenShot("logged in user");
    		// testcaseID:tr_login_18
    		// verify with happy path
    		//Assert.assertNotEquals(null, loginPage.validateInput(" vinod.sharma@limeroad.com", "limeroad@123"));
            
    		// testcaseID:tr_login_19
    		// verify with happy path
    		//Assert.assertNotEquals(null, loginPage.validateInput("vinod.sharma@limeroad.com ", "limeroad@123"));
        
            // testcaseID:tr_login_20
            // verify with happy path
        	//Assert.assertNotEquals(null, loginPage.validateInput("vinod.sharma@LIMEroad.com ", "limeroad@123"));

		
	}	
	

}
