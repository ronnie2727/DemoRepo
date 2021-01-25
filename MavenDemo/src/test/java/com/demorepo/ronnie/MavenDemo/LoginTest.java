package com.demorepo.ronnie.MavenDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;

	@BeforeTest
	public void launchApplication() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rutvi\\Documents\\DemoRepo\\MavenDemo\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com");
	}

	@Test
	public void verifyLogin() {
		HomePage hp = new HomePage(driver);
		hp.login("rutvijupadhyay@gmail.com", "harshida31,");
		boolean logoutButton = driver.findElement(By.xpath("//a[@class='logout']")).isDisplayed();
		Assert.assertTrue(logoutButton);
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
