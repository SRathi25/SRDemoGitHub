package SeleniumDemo;

import java.awt.event.ActionEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoDynamicMenus {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\JarFiles\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.americangolf.co.uk/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	

	
		//a[@class='a-level-1'][contains(text(),'Golf Clubs')]
		Actions act=new Actions(driver);	//select Actions(WebDriver)
		WebElement menuGolf=driver.findElement(By.xpath("//a[@class='a-level-1'][contains(text(),'Golf Clubs')]"));
		act.moveToElement(menuGolf).perform();

	/*	
		
		//for all tabs - //ul[@class='menu-category ul-level-1']//ul[@class='category-group-block ul-level-2 toggle-content expanded']//li[@class='li-level-2']//a[@class='a-level-2']//span[@class='name']
		List<WebElement> subMenulist=driver.findElements(By.xpath("//ul[@class='menu-category ul-level-1']//ul[@class='category-group-block ul-level-2 toggle-content expanded']//li[@class='li-level-2']//a[@class='a-level-2']//span[@class='name']"));
		System.out.println("No. of sub-menus = " +subMenulist.size());
		for(WebElement we:subMenulist)
			System.out.println(we.getText());
	
		

		

	
*/
		Thread.sleep(2000);
		
		//a[@class='a-level-1'][contains(text(),'Golf Balls')]
		WebElement menuGolfBalls=driver.findElement(By.xpath("//a[@class='a-level-1'][contains(text(),'Golf Balls')]"));
		act.moveToElement(menuGolfBalls).perform();
		Thread.sleep(2000);
		
		
		//for tab 'Golf Balls - //ul[@class='menu-category ul-level-1']/li[7]/div/div/div/div/ul[@class='category-groups']/li[@class='category-group']/ul[@class='category-group-block ul-level-2 toggle-content expanded']/li[@class='li-level-2']/a[@class='a-level-2']
		List<WebElement> subMenuListGolfBall = driver.findElements(By.xpath("//ul[@class='menu-category ul-level-1']/li[7]/div/div/div/div/ul[@class='category-groups']/li[@class='category-group']/ul[@class='category-group-block ul-level-2 toggle-content expanded']/li[@class='li-level-2']/a[@class='a-level-2']"));
		System.out.println("No. of sub menus in Gold Clubs = " + subMenuListGolfBall.size());
		for(WebElement we:subMenuListGolfBall)
			System.out.println(we.getText());

	
		
		//a[@class='a-level-1'][contains(text(),'Golf Clothing')]
		WebElement menuGolfClothing = driver.findElement(By.xpath("//a[@class='a-level-1'][contains(text(),'Golf Clothing')]"));
		act.moveToElement(menuGolfClothing).perform();
		Thread.sleep(3000);
		
		//ul[@class='menu-category ul-level-1']/li[5]/div/div/div/div/ul[@class='category-groups']/li[@class='category-group']/ul[@class='category-group-block ul-level-2 toggle-content expanded']/li[@class='li-level-2']/a[@class='a-level-2']
		List<WebElement> subMenuListGolfClothing=driver.findElements(By.xpath("//ul[@class='menu-category ul-level-1']/li[5]/div/div/div/div/ul[@class='category-groups']/li[@class='category-group']/ul[@class='category-group-block ul-level-2 toggle-content expanded']/li[@class='li-level-2']/a[@class='a-level-2']"));
		System.out.println("No. of sub-menus in Golf Clothing = " + subMenuListGolfClothing.size());
		for(WebElement we:subMenuListGolfClothing)
			System.out.println(we.getText());
	
	}

}
