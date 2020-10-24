package com.bitm.SeleniumOnlineProject.Test;

import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.bitm.SeleniumOnlineProject.DTO.FromDateDTO;
import com.bitm.SeleniumOnlineProject.DTO.ToDateDTO;
import com.bitm.SeleniumOnlineProject.DataProvider.FromDateDataProvider;
import com.bitm.SeleniumOnlineProject.DataProvider.ToDateDataProvider;
import com.bitm.SeleniumOnlineProject.Utils.DriverManager;
import com.bitm.SeleniumOnlineProject.Utils.Xpath;

public class DateSelectTest {

	private WebDriver chromeDriver4 = null;

	@Test(dataProvider = "FromDateData", dataProviderClass = FromDateDataProvider.class)
	public void FromDate(List<FromDateDTO> FromDateData) {
		for (FromDateDTO fromDate : FromDateData) {
			chromeDriver4 = DriverManager.chromedriver;
			// Month
			chromeDriver4.findElement(By.xpath(Xpath.FromDateModule.ClickFromdate)).click();
			chromeDriver4.findElement(By.xpath(Xpath.FromDateModule.Month)).click();
			Select FromDate1 = new Select(chromeDriver4.findElement(By.xpath(Xpath.FromDateModule.Month)));
			FromDate1.selectByVisibleText(fromDate.getMonth());
			// Year
			chromeDriver4.findElement(By.xpath(Xpath.FromDateModule.Year)).click();

			Select FromDate2 = new Select(chromeDriver4.findElement(By.xpath(Xpath.FromDateModule.Year)));
			FromDate2.selectByVisibleText(fromDate.getYear());

			// Day
			WebElement dateWidget = chromeDriver4.findElement(By.xpath(Xpath.FromDateModule.DAY));
			List<WebElement> columns = dateWidget.findElements(By.tagName("td"));

			for (WebElement cell : columns) {
				if (cell.getText().equals(fromDate.getDate())) {
					cell.findElement(By.linkText(fromDate.getDate())).click();
					break;
				}
			}

		}

	}

	@Test(dataProvider = "ToDateData", dataProviderClass = ToDateDataProvider.class)
	public void ToDate(List<ToDateDTO> ToDateData) {

		for (ToDateDTO toDate : ToDateData) {

			// Month
			chromeDriver4.findElement(By.xpath(Xpath.ToDateModule.ClickToDate)).click();
			chromeDriver4.findElement(By.xpath(Xpath.ToDateModule.Month)).click();
			Select toDate1 = new Select(chromeDriver4.findElement(By.xpath(Xpath.ToDateModule.Month)));
			toDate1.selectByVisibleText(toDate.getMonth());
			// Year
			chromeDriver4.findElement(By.xpath(Xpath.ToDateModule.Year)).click();
			Select Year = new Select(chromeDriver4.findElement(By.xpath(Xpath.ToDateModule.Year)));
			Select ToDate2 = new Select(chromeDriver4.findElement(By.xpath(Xpath.ToDateModule.Year)));
			ToDate2.selectByVisibleText(toDate.getYear());

			// Day
			WebElement dateWidget = chromeDriver4.findElement(By.xpath(Xpath.ToDateModule.DAY));
			List<WebElement> columns = dateWidget.findElements(By.tagName("td"));

			for (WebElement cell : columns) {
				if (cell.getText().equals(toDate.getDate())) {
					cell.findElement(By.linkText(toDate.getDate())).click();
					break;
				}
			}

		}

	}

}
