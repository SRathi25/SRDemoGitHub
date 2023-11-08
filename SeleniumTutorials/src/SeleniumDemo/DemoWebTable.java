package SeleniumDemo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoWebTable {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\JarFiles\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().window().maximize();
		
		
		//XPath - //table[@class='dataTable']/tbody/tr/td[1]
		List<WebElement> companyList = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));		
		System.out.println("No. of Companies = " + companyList.size());
		
		System.out.println("List of Companies");
		for(WebElement we:companyList)
			System.out.println(we.getText());
		

	
		
		
	}

}
