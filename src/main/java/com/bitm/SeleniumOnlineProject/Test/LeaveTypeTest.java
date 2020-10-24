package com.bitm.SeleniumOnlineProject.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.bitm.SeleniumOnlineProject.DTO.LeaveTypeDTO;

import com.bitm.SeleniumOnlineProject.DataProvider.LeaveTypeDataProvider;
import com.bitm.SeleniumOnlineProject.Utils.DriverManager;
import com.bitm.SeleniumOnlineProject.Utils.Xpath;

public class LeaveTypeTest {

	private WebDriver ChromeDriver2 = null;

	@Test(dataProvider = "LeaveTypedata", dataProviderClass = LeaveTypeDataProvider.class)
	public void ClickLeavetest(List<LeaveTypeDTO> LeaveTypedata) {

		for (LeaveTypeDTO LeaveType : LeaveTypedata) {
			ChromeDriver2 = DriverManager.chromedriver;

			Select LeaveType1 = new Select(ChromeDriver2.findElement(By.xpath(Xpath.LeaveTypeModule.LeaveType)));

			LeaveType1.selectByVisibleText(LeaveType.getLeaveType());
			System.out.println("Leavetype working");
		}

	}

}
