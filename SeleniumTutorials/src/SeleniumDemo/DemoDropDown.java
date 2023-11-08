package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoDropDown {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\JarFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		//select[starts-with(@name,'DOB_Day')]
		//select[name^='DOB_Day']
		Select myday=new Select(driver.findElement(By.cssSelector("select[name^='DOB_Day']")));
		myday.selectByValue("10");
		
		
		//select[name^='DOB_Month']
		Select mymonth=new Select(driver.findElement(By.cssSelector("select[name^='DOB_Month']")));
		mymonth.selectByValue("05");
		
		
		//select[name^='DOB_Year']
		Select myyear=new Select(driver.findElement(By.cssSelector("select[name^='DOB_Year']")));
		myyear.selectByValue("2000");
		
		
		//select#country
		Select mycountry=new Select(driver.findElement(By.cssSelector("select#country")));
		mycountry.selectByIndex(4);
		mycountry.selectByValue("10");
		mycountry.selectByVisibleText("India");
		
		
		List<WebElement> mycountryweb = mycountry.getOptions();
		System.out.println("No. of countries = "+mycountryweb.size());
		for(WebElement we:mycountryweb)
		{
			System.out.println(we.getText());
		}
		
		
		
		//select[starts-with(name,'city')]
		//select[name^='city']
		Select mycity=new Select(driver.findElement(By.cssSelector("select[name^='city']")));
		mycity.selectByValue("Agra");
		
		
		List<WebElement> mycityweb=mycity.getOptions();
		System.out.println("No. of cities = " + mycityweb.size());
		for(WebElement we:mycityweb)
		{
			System.out.println(we.getText());
		}
		
		System.out.println(mycityweb);

	}

}
