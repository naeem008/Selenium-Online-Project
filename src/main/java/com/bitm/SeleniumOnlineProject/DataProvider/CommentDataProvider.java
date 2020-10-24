package com.bitm.SeleniumOnlineProject.DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.bitm.SeleniumOnlineProject.Utils.ExcelUtils;

public class CommentDataProvider {
	
	@DataProvider(name = "CommentData")
	public static Object [][] getCommentData() throws IOException{
		return new Object[][]{
				{
					ExcelUtils.getCommentData()
				},
			};	        
    }
}
