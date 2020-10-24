package com.bitm.SeleniumOnlineProject.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.bitm.SeleniumOnlineProject.DTO.CommentDTO;
import com.bitm.SeleniumOnlineProject.DataProvider.CommentDataProvider;
import com.bitm.SeleniumOnlineProject.Utils.DriverManager;
import com.bitm.SeleniumOnlineProject.Utils.Xpath;

public class CommentTest {

	private WebDriver chromeDriver6 = null;

	@Test(dataProvider = "CommentData", dataProviderClass = CommentDataProvider.class)
	public void Comment(List<CommentDTO> CommentData) {

		for (CommentDTO comment : CommentData) {

			chromeDriver6 = DriverManager.chromedriver;
			chromeDriver6.findElement(By.xpath(Xpath.CommentModule.Comments)).click();

			chromeDriver6.findElement(By.xpath(Xpath.CommentModule.Comments)).sendKeys(comment.getCom());

		}

	}
}
