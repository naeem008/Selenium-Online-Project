package com.bitm.SeleniumOnlineProject.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bitm.SeleniumOnlineProject.DTO.LoginDTO;
import com.bitm.SeleniumOnlineProject.DataProvider.LoginDataProvider;
import com.bitm.SeleniumOnlineProject.Utils.DriverManager;
import com.bitm.SeleniumOnlineProject.Utils.UrlTextUtils;
import com.bitm.SeleniumOnlineProject.Utils.Xpath;

public class LoginTest {

	private WebDriver chromeDriver = null;

	@Test
	public void checkLoginPageTitle() {
		chromeDriver = DriverManager.chromedriver;
		chromeDriver.get(UrlTextUtils.Url.Base_URL);
		Assert.assertEquals(chromeDriver.getTitle(), UrlTextUtils.Title.Base_Title);
		System.out.println("Login path title verified");

	}
 
	@Test(dependsOnMethods = "checkLoginPageTitle", dataProvider = "loginData", dataProviderClass = LoginDataProvider.class)

	public void Logintest(List<LoginDTO> logdata) {

		for (LoginDTO login : logdata) {
			chromeDriver.findElement(By.xpath(Xpath.LoginModule.Username)).sendKeys(login.getUsername());
			chromeDriver.findElement(By.xpath(Xpath.LoginModule.password)).sendKeys(login.getPassword());
			chromeDriver.findElement(By.id("btnLogin")).click();
		}

		System.out.println("Successfully Logged in");
	}

}
