package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoDragDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E://JarFiles//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
				
		WebElement drag= driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		
		Actions act=new Actions(driver);
		
	//	act.dragAndDrop(drag, drop).perform();
	//	act.dragAndDropBy(drag, 160, 200).perform();
	
	/*
		act.clickAndHold(drag);
		act.moveToElement(drop);
		act.release();
		act.build().perform();	
	*/
	
	
		//Point Class - to identify the coordinates
		Point dropPoint = drop.getLocation();
		act.dragAndDropBy(drag, dropPoint.x, dropPoint.y);
		
		
		
		
		
	}

}
