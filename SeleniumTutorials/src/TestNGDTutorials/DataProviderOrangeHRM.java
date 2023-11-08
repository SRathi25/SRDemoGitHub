package TestNGDTutorials;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DataProviderOrangeHRM {
  
	WebDriver driver;
	//WebDriverWait wait = new WebDriverWait(driver, 30);
	
	@Test(dataProvider = "login")
  public void validLogin(String un, String passwd) {
		System.out.println("Login Id = " + un + "\nPassword = " + passwd);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys(un);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys(passwd);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']"))).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(passwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
  
  }
	@BeforeMethod
	  public void launchBrowser() {
		  
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
	  }

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void setBrowser() {
	  System.setProperty("webdriver.gecko.driver", "E:\\JarFiles\\geckodriver.exe");
	}


  @DataProvider(name="login")
  public Object[][] login() {
    return new Object[][] {
      new Object[] { "Seed", "Seed123" },
      new Object[] { "Manager", "Manager123" },
    };
  }
  

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
