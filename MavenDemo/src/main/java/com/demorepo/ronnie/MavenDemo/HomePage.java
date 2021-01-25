package com.demorepo.ronnie.MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//a[@class='login']")
	private WebElement loginButton;
	
	@FindBy(name = "email")
	private WebElement emailbox;

	@FindBy(xpath = "//i[@class='icon-lock left']")
	private WebElement signinButton;

	@FindBy(name = "passwd")
	private WebElement passwordbox;
	
	public HomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void login(String email, String password) {
		loginButton.click();
		emailbox.clear();
		emailbox.sendKeys(email);
		passwordbox.clear();
		passwordbox.sendKeys(password);
		signinButton.click();
	}

}
