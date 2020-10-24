package com.bitm.SeleniumOnlineProject.DataProvider;

import org.testng.annotations.DataProvider;

import com.bitm.SeleniumOnlineProject.Utils.ExcelUtils;

public class ToDateDataProvider {
	@DataProvider (name = "ToDateData")
	public static Object [][] getToDateData()
	{
		try {
			return new Object[][]{
				{
					ExcelUtils.getToDateData()
				},
			};
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
} 
