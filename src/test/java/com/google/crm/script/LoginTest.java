package com.google.crm.script;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.crm.base.Testbase;
import com.google.crm.pages.Loginpage;

public class LoginTest extends Testbase {
	Loginpage log;

public LoginTest() {
	super();
}
	
	
@BeforeTest
public void open() {
	setup();
	log = new Loginpage();
}


@Test(priority=1)
public void validatetitle() {
	String title = log.VerifyTitle();
	Assert.assertEquals(title, "Cogmento CRM");
}


@Test(priority=2)
public void validatelogin() {
	log.VerifyLogin(prop.getProperty("username"), prop.getProperty("password"));
}


/*@AfterTest
public void teardown() {
	driver.close();
}
*/

}
