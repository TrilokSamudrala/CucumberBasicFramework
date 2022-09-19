package com.sampl.steps;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utilities.Screenshot;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	public WebDriver driver;

	@Given("login to freecrm app")
	public void login_to_freecrm_app() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://freecrm.com/");
		Screenshot.take_the_screenshot(driver,"urllaunch");

	}

	@Then("verify freecrm homepage")
	public void verify_freecrm_homepage() {
		String ExpectedTitle = "Free CRM Features";
		String ActualTitle = driver.getTitle();
		if (ActualTitle.equals(ExpectedTitle)) {
			System.out.println("We are on Free CRM Homepage page");
		} else {
			System.err.println("We are not on CRM Homepage page");
		}
	}

	@Then("click on login button")
	public void click_on_login_button() throws InterruptedException {
		WebElement loginbtn = driver.findElement(By.xpath("//a[text()='Login']"));
		Javascriptclick(loginbtn);
		Thread.sleep(10000);
		Screenshot.take_the_screenshot(driver,"login");
	}

	@Then("^enter \"(.*)\" and \"(.*)\" and click on signin button$")
	public void enter_username_and_password(String Uname, String Pword) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Pword);
		WebElement ele = driver.findElement(By.xpath("//div[text()='Login']"));
		Javascriptclick(ele);
		Thread.sleep(5000);
		Screenshot.take_the_screenshot(driver,"singin");
	}
	
	@Then("^enter (.*) and (.*) and click on freecrm signin button$")
	public void enter_username_and_password_and_click_on_freecrm_signin(String Uname, String Pword) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Pword);
		WebElement ele = driver.findElement(By.xpath("//div[text()='Login']"));
		Javascriptclick(ele);
		Thread.sleep(5000);
		Screenshot.take_the_screenshot(driver,"signin");
	}
	
	@Then("enter username and password using datatable")
	public void enter_username_and_password_using_datatable(DataTable dataTable) throws InterruptedException {
	   List<List<String>> DT = dataTable.cells();
	   driver.findElement(By.xpath("//input[@name='email']")).sendKeys(DT.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(DT.get(0).get(1));
		WebElement ele = driver.findElement(By.xpath("//div[text()='Login']"));
		Javascriptclick(ele);
		Thread.sleep(5000);
		Screenshot.take_the_screenshot(driver,"signin");
	}
	


	@Then("close browser")
	public void close_browser() {
		driver.quit();
	}

	public void Javascriptclick(WebElement ele) {
		((JavascriptExecutor) this.driver).executeScript("arguments[0].click()", ele);

	}
	
	
	public void TakeScreenShot() {
		TakesScreenshot scrshot = (TakesScreenshot)driver;
		File source = scrshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File("C:\\Users\\tsamudra\\git\\CucumberBasicFramework\\BasicCucumberFramework\\ScreenShots\\scrshot1"));
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
