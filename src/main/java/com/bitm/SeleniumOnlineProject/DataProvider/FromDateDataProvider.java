package com.bitm.SeleniumOnlineProject.DataProvider;

import org.testng.annotations.DataProvider;

import com.bitm.SeleniumOnlineProject.Utils.ExcelUtils;

public class FromDateDataProvider {
	@DataProvider (name = "FromDateData")
	public static Object [][] getFromDateData()
	{
		try {
			return new Object[][]{
				{
					ExcelUtils.getFromDateData()
				},
			};
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
