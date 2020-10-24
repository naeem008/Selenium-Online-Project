package com.bitm.SeleniumOnlineProject.Test;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.bitm.SeleniumOnlineProject.DTO.AssignLeaveDTO;
import com.bitm.SeleniumOnlineProject.DataProvider.AssignLeaveDataProvider;
import com.bitm.SeleniumOnlineProject.Utils.DriverManager;
import com.bitm.SeleniumOnlineProject.Utils.UrlTextUtils;
import com.bitm.SeleniumOnlineProject.Utils.Xpath;

public class AssignLeaveTest {

	private WebDriver chromeDriver1 = null;

	@Test
	public void ClickAssignLeavetest() {
		chromeDriver1 = DriverManager.chromedriver;
		chromeDriver1.get(UrlTextUtils.Url.Base_URL1);
		chromeDriver1.findElement(By.className(Xpath.ClickAssignLeaveModule.AssignLeaveBTN)).click();

	}

	@Test(dependsOnMethods = "ClickAssignLeavetest", dataProvider = "AssignLeaveData", dataProviderClass = AssignLeaveDataProvider.class)
	public void Assignleavetest(List<AssignLeaveDTO> AssignData) {
		chromeDriver1 = DriverManager.chromedriver;
		for (AssignLeaveDTO Assign : AssignData) {
			chromeDriver1.findElement(By.xpath(Xpath.AssignleaveModule.EmployeeName))
					.sendKeys(Assign.getEmployeeName());
			System.out.println("AssignLeave working");
		} 
	}

}
