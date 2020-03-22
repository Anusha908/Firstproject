package com.google.crm.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.crm.util.Testutil;

public class Testbase {

public File f;
public java.io.FileInputStream fis;
public Properties prop;
public static WebDriver driver;

public Testbase()
{
	try {
		f = new File("C:\\Users\\GOOD\\eclipse-workspace\\pageobjectmodel\\src\\main\\java\\crm\\google\\crm\\config\\config.properties");
		fis = new FileInputStream(f);
		prop = new Properties();
		prop.load(fis);
	}
	
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e) {
	e.printStackTrace();
	}
}


public void setup()
{
	String bname= prop.getProperty("browser");
	if(bname.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOOD\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	}
	else if(bname.equals("FF")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOOD\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new FirefoxDriver();
	}
driver.get(prop.getProperty("url"));
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Testutil.impwait,TimeUnit.SECONDS);
}
}
