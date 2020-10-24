package com.bitm.SeleniumOnlineProject.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.bitm.SeleniumOnlineProject.Utils.DriverManager;
import com.bitm.SeleniumOnlineProject.Utils.Xpath;

public class ClickAssignTest {

	private WebDriver chromeDriver7 = null;

	@Test
	public void Assign() {

		chromeDriver7 = DriverManager.chromedriver;
		WebDriverWait wait = new WebDriverWait(chromeDriver7, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.ClickAssign.Assign))).click();

	}
}
