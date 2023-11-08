package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoMultiSelect {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\JarFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		//Relative XPath - //select[@id,'cars']
		//CSS - select#cars
		Select myCars = new Select(driver.findElement(By.cssSelector("select#cars")));
		
		//isMultiple()
		Boolean myCarsStatus=myCars.isMultiple();
		System.out.println("Cars (isMultiple) = " + myCarsStatus);
		
		myCars.selectByIndex(0);
		myCars.selectByValue("opel");
		myCars.selectByVisibleText("Audi");
		
		
		//getAllSelectedOptions()
		List<WebElement> myCarsList=myCars.getAllSelectedOptions();
		System.out.println("No. of selected items = " + myCarsList.size());
		
		System.out.println("List of selected items");
		for(WebElement we:myCarsList)
			System.out.println(we.getText());
		
		//getOptions()
		List<WebElement> myCarsList1=myCars.getOptions();
		System.out.println("No. of items = " + myCarsList1.size());
		System.out.println("List of all items");
		for(WebElement we:myCarsList1)
			System.out.println(we.getText());
		
		//getFirstSelectedOption()
		String carName = myCars.getFirstSelectedOption().getText();
		System.out.println("First Selected Option = " + carName);
		
		
		//deselectAll()
		myCars.deselectAll();
		
	}

}
