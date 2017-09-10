package com.infi.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.appium.manager.CommonAppiumTest;
import com.infi.annotation.values.PageName;
import com.infi.page.objects.ChooseGenderPageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;

@PageName("Gender Page")
public class ChooseGenderPage extends CommonAppiumTest {

    ChooseGenderPageObject cgPage = new ChooseGenderPageObject();

    public ChooseGenderPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        waitForGivenTime(2);
        PageFactory.initElements(new AppiumFieldDecorator(driver, new TimeOutDuration(15, TimeUnit.SECONDS)), cgPage);
    }

    public ChooseCategoryPage selectMen() {
    	waitForElement(cgPage.MEN);
        cgPage.MEN.click();
        return new ChooseCategoryPage(driver);
    }

}
