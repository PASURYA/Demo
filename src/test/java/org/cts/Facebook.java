package org.cts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Facebook extends Baseclass {
	
	public Facebook() {
	  PageFactory.initElements(driver,this);
		}

 @FindBy(xpath = "//*[@type='text']")
 private WebElement username;
 
 @FindBy(xpath = "//*[@name='pass']")
 private WebElement password;
 
 @FindBy(xpath = "//*[@name='login']")
 private  WebElement login;

public WebElement getLogin() {
	return login;
}

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}
 
	
	
	
	
	

}
