package DemoPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RediffTestExecution {
  @Test
  public void TestExecution() {
	  
	  	WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\JarFiles\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginPF loginTest=PageFactory.initElements(driver,RediffLoginPF.class);
		loginTest.signInWrong();
		
  }
  
  
  
}
