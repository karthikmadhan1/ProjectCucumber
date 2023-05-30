package org.yahoo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.yahoo.utils.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "(//input[@id='email'])[1]")
	private WebElement username ;
	@FindBy(xpath = "(//input[@id='pass'])[1]")
	private WebElement password;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	

}
