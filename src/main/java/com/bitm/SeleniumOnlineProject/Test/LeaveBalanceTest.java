package com.bitm.SeleniumOnlineProject.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.bitm.SeleniumOnlineProject.Utils.DriverManager;
import com.bitm.SeleniumOnlineProject.Utils.Xpath;

public class LeaveBalanceTest {

	private WebDriver ChromeDriver3 = null;

	@Test
	public void LeaveBalance() {
		ChromeDriver3 = DriverManager.chromedriver;
		WebDriverWait wait = new WebDriverWait(ChromeDriver3, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.LeaveBalanceModule.LeaveBalance))).click();

	}

	@Test(dependsOnMethods = "LeaveBalance")
	public void LeaveBalanceDetails() {
		ChromeDriver3.findElement(By.xpath(Xpath.LeaveBalanceDetails.ok)).click();
	}

}
