package com.bitm.SeleniumOnlineProject.Utils;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

public class DriverManager {
	
	static {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nayeem\\Desktop\\Selenium Files\\chrome driver\\chromedriver.exe");
	}
	
	public static WebDriver chromedriver = new ChromeDriver();
	
	 @org.testng.annotations.Test
	 public void DriveManagerTest() {
		
	}
}
