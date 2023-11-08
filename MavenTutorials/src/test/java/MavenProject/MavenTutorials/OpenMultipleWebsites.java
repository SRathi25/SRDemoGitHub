package MavenProject.MavenTutorials;

/*
1. @ Test -- Google
2.@Test -- Yahoo
3. @ Test -- live.com"
and print there title
 */

//For 3 different browsers - @BeforeMethod
//For 3 different tabs - @BeforeTest


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class OpenMultipleWebsites {
	
	//annotations provide metadat of methods
	//means what it(annotation) tells browser driver which to execute when
	
	WebDriver driver;
	
  @Test (priority=1)
  public void websiteGoogle() {
	  //this is called test method
	  //the method which is marked with @test annotation is called test method
	  //it should contain test cases
	  driver.get("https://www.google.com/");
//	  System.out.println("Page Source = " + driver.getPageSource());
	  System.out.println("Title = " + driver.getTitle());
	  assertEquals(driver.getTitle(),"Google");
  }
  @Test (priority=2)
  public void websiteYahoo() {
	  //this is called test method
	  //the method which is marked with @test annotation is called test method
	  //it should contain test cases
	  driver.get("https://www.yahoo.com");
	//  System.out.println("Page Source = " + driver.getPageSource());
	  System.out.println("Page Source = " + driver.getPageSource());
	  System.out.println("Title = " + driver.getTitle());
	  websiteRediff();
  }
  @Test (priority=3,groups= {"Smoke Test"})
  public void websiteLive() {
	  //this is called test method
	  //the method which is marked with @test annotation is called test method
	  //it should contain test cases
	  driver.get("https://www.live.com");
	  System.out.println("Title = " + driver.getTitle());
  }
  
  public void websiteRediff()
  {
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  System.out.println("Title = " +driver.getTitle());
  }
  
  @BeforeMethod(groups= {"Smoke Test"})
  public void launchBrowser() {
	  //the method which is marked with @BeforeMethod gets executed before every test method
	  //the method which is marked with @BeforeMethod will get executed before f,before f1, before f2
	  //this will not get executed if method if not marked with @test gets called
	//  System.setProperty("webdriver.gecko.driver", "E:\\JarFiles\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void closeBrowser() {
	//this will execute after every test method
//	  driver.quit();
  }

  @BeforeTest(groups= {"Smoke Test"})
  public void setBrowser() {
	  System.setProperty("webdriver.gecko.driver", "E:\\JarFiles\\geckodriver.exe");
	  
  }
  

  @AfterTest
  public void closeBrowserAfterTest() {
  //this will execute after every test method
//	  driver.quit();
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  //this method will be called before any class gets executed
//	  System.setProperty("webdriver.gecko.driver", "E:\\JarFiles\\geckodriver.exe");
  }

  @AfterClass
  public void afterClass() {
	  //this will execute after all class execution is complete
  }
  
}
