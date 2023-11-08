package TestNGDTutorials;

/*
In @Before Test -- Launch FF, Open Google
@ Test - Get Title and Print Title
@ After Test - Close Browser"
 */
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class DemoGoogle {
	WebDriver driver;
	
  @Test
  public void googleTitle() {
	  System.out.println("Title = " + driver.getTitle());
  }
  
  @BeforeMethod
  @Parameters("brow")
  public void launchBrowser(String browname) {
	  
	//  System.setProperty("webdriver.gecko.driver", "E:\\JarFiles\\geckodriver.exe");
	//  driver=new FirefoxDriver();
	
	  if(browname.equalsIgnoreCase("firefox"))
	  {
		  driver=new FirefoxDriver();
	  }
	  if(browname.equalsIgnoreCase("chrome"))
	  {
		  driver=new ChromeDriver();
	  }
	  
	  
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");  
  }

  @BeforeTest
  @Parameters("brow")
  public void setBrowser(String browname)
  {
	  if(browname.equalsIgnoreCase("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "E:\\JarFiles\\geckodriver.exe");
	  }
	  if(browname.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "E:\\JarFiles\\chromedriver.exe");
	  }
  }
  
  @AfterTest
  public void closeBrowser() {
	  driver.close();
  }
  
  

}
