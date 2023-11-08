package TestNGDTutorials;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

//DataProvider

public class RedffLoginReg {
	WebDriver driver;
	
  @Test
  public void loginValid() {
	  System.out.println("In Rediff loginValid");
	  
  }
  
  @Test(dataProvider="login")
  public void loginInvalid(String un,String passwd) {
	  System.out.println("In Rediff loginInvalid");
	  System.out.println("Login Id = " + un + "\nPassword = " + passwd);
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  driver.findElement(By.id("login1")).sendKeys(un);
	  driver.findElement(By.id("password")).sendKeys(passwd);
	  driver.findElement(By.name("proceed")).click();
  }
  
  @Test(groups= {"Smoke Test"})
  public void regNew() {
	  System.out.println("In Rediff regNew");
  }
  @Test(groups= {"Smoke Test"})
  public void regOld() {
	  System.out.println("In Rediff regOld");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
  }
  
  @BeforeTest
  public void setBrowser()
  {
	  System.setProperty("webdriver.gecko.driver", "E:\\JarFiles\\geckodriver.exe");
  }

  @AfterMethod
  public void afterMethod() {
	
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }
  
  @DataProvider(name="login")
  public Object[][] login(){
	  Object[][] obj=new Object[3][2];
	  obj[0][0]="seed";
	  obj[1][0]="manager";
	  obj[2][0]="admin";
	  obj[0][1]="seed123";
	  obj[1][1]="manager123";
	  obj[2][1]="admin123+";
	
	  return obj;
  	}
  }
  
  

