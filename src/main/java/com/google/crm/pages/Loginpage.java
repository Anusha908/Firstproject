package com.google.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.crm.base.Testbase;

public class Loginpage extends Testbase{
@FindBy(xpath="//input[@name='email']")
WebElement un;

@FindBy(xpath="//input[@name='password']")
WebElement pwd
;

@FindBy(xpath="//div[text()='Login']")
WebElement sub;
	

public Loginpage()
{
PageFactory.initElements(driver, this);
}
	
	
public String VerifyTitle()
{
	return driver.getTitle();
	 
}
	

public void VerifyLogin(String uname, String password) {
	un.sendKeys(uname);
	pwd.sendKeys(password);
	sub.click();
}
	
	
}
