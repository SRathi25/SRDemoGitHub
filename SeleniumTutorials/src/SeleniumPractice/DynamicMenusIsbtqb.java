package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicMenusIsbtqb {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E://JarFiles//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.istqb.org/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		WebElement menuAboutUs=driver.findElement(By.xpath("//span[contains(text(),'About Us')]"));
		act.click(menuAboutUs).perform();
		
		//a[@class='link__BaseLink-sc-1l6ktzb-0 link__Link-sc-1l6ktzb-1 SubMenuItemstyles__StyledLink-sc-rn6z98-0 dvqXod fnAwXM eepZFP']
		//li[@class='SubMenuItemstyles__StyledLi-sc-rn6z98-2 jubDzy']
		List<WebElement> subMenuAboutUs=(List<WebElement>) driver.findElements(By.xpath("//a[@class='link__BaseLink-sc-1l6ktzb-0 link__Link-sc-1l6ktzb-1 SubMenuItemstyles__StyledLink-sc-rn6z98-0 dvqXod fnAwXM eepZFP']"));
		System.out.println("Number of submenus of About Us = " + subMenuAboutUs.size());
		for(WebElement we:subMenuAboutUs)
			System.out.println(we.getText());
		
		
		
			
		

	}

}
