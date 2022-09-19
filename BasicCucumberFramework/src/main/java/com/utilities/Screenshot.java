package com.utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	public static void take_the_screenshot(WebDriver driver, String filename) {
		TakesScreenshot scrshot = (TakesScreenshot)driver;
		File source = scrshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File("C:\\Users\\tsamudra\\git\\CucumberBasicFramework\\BasicCucumberFramework\\ScreenShots\\"+filename+".png"));
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
