package com.bitm.SeleniumOnlineProject.DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.bitm.SeleniumOnlineProject.Utils.ExcelUtils;

public class AssignLeaveDataProvider {
	@DataProvider(name = "AssignLeaveData")
	public static Object [][] getAssignLeavedata() throws IOException{
		return new Object[][]{
				{
					ExcelUtils.getAssignLeavedata()
				},
			};	        
    }
}
