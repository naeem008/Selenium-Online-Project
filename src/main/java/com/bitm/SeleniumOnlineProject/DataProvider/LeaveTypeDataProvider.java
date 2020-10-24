package com.bitm.SeleniumOnlineProject.DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.bitm.SeleniumOnlineProject.Utils.ExcelUtils;

public class LeaveTypeDataProvider {
	
	@DataProvider(name = "LeaveTypedata")
	public static Object [][] getLeaveTypedata() throws IOException{
		return new Object[][]{
				{
					ExcelUtils.getLeaveTypedata()
				},
			};	        
    }
}
