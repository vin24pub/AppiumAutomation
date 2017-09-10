package com.infi.test.base;

import org.testng.annotations.BeforeMethod;

import com.appium.manager.AppiumDriverManager;
import com.infi.pages.LoginPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseTest {
	protected AppiumDriver<MobileElement> driver;
	public String url;
	public String protocol, domain, experiment, port;

	@BeforeMethod
	protected void setUp() throws Exception {
		driver = AppiumDriverManager.getDriver();
	}
	
	public BaseTest() {
		
		protocol = System.getenv("protocol");
		setProtocol(protocol);
		domain = System.getenv("domain");
		setDomain(domain);
		experiment = System.getenv("experiment");
		setExperiment(experiment);
		port = System.getenv("port");
		setPort(port);
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol != null ? protocol : "http";
	}

	public void setDomain(String domain) {
		this.domain = domain != null ? domain : "www";
	}

	public void setExperiment(String experiment) {
		this.experiment = experiment != null ? experiment : "";
	}

	public void setPort(String port) {
		this.port = port != null ? port : "";
	}

	public String createDomain() {
		url = "";
		url = protocol + "://" + domain + ".limeroad.com";
		return url;
	}

	public String addPort(String url) {
		if (!port.equals(""))
			return url + ":" + port;
		else
			return url;
	}

	public String addExperiment(String url) {
		if (!experiment.equals(""))
			return url + "?" + experiment;
		return url;
	}

	public String getURL() {

		createDomain();
		addPort(url);
		addExperiment(url);
		return url;
	}

	protected String getFeedURL() {
		createDomain();
		String feedurl = addPort(url) + "/feed";
		return addExperiment(feedurl);
	}

	protected String getCustomURL(String page) {
		createDomain();
		String feedurl = addPort(url) + "/" + page;
		return addExperiment(feedurl);
	}

	protected LoginPage getLoginPage() {
		AppiumDriverManager.getDriver().get(getCustomURL("signin"));
		return new LoginPage(AppiumDriverManager.getDriver());
	}
	

}
