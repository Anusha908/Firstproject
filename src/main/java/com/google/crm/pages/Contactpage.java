package com.google.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.crm.base.Testbase;



public class Contactpage extends Testbase {

	@FindBy(xpath="//*[@id='main-nav']//*[@class='item']//*[text()='Contacts']")
	WebElement contacts;

	@FindBy(xpath="//a[@href=\"/contacts/new\"]//button[@class=\"ui linkedin button\"]")
	WebElement New;

	@FindBy(name="first_name")
	WebElement fname;
		

	public Contactpage()
	{
	PageFactory.initElements(driver, this);
	}
	
	public String VerifyTitle()
	{
		return driver.getTitle();
		 
	}
	
	public void VerifyContacts()
	{
		contacts.click();
		 
	}
	
	public void VerifyNew()
	{
		New.click();
		 
	}
		


	
	
	
	
}
