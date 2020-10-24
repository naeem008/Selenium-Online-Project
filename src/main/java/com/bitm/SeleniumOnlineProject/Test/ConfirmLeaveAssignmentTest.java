package com.bitm.SeleniumOnlineProject.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.bitm.SeleniumOnlineProject.Utils.DriverManager;
import com.bitm.SeleniumOnlineProject.Utils.Xpath;

public class ConfirmLeaveAssignmentTest {

	private WebDriver chroDriver8 = null;

	@Test
	public void Confirm() {
		chroDriver8 = DriverManager.chromedriver;

		WebDriverWait wait = new WebDriverWait(chroDriver8, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath.ConfirmLeaveAssignmentModule.Confirm)))
				.click();
	}
}
