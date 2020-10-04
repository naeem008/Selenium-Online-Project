package com.bitm.SeleniumOnlineProject.Test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.bitm.SeleniumOnlineProject.Utils.DriverManager;
import com.bitm.SeleniumOnlineProject.Utils.UrlTextUtils;

public class LoginTest {
	
	private WebDriver chromeDriver = null;
	
	@Test
	public void checkLoginPageTitle()
	{
		chromeDriver = DriverManager.chromedriver;
		chromeDriver.get(UrlTextUtils.Url.Base_URL);
	
	}
	public void LoginTest() {
		
	}
}
