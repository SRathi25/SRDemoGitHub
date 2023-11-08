package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationTestingXpath {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\JarFiles\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		//Relative Xpath
		//first name
		driver.findElement(By.xpath("//input[starts-with(@ng-model,'FirstName')]")).sendKeys("Snehal");
		//last name
		driver.findElement(By.xpath("//input[contains(@placeholder,'Last Name')]")).sendKeys("Rathi");
		//address
		driver.findElement(By.xpath("//textarea[starts-with(@ng-model,'Adress')]")).sendKeys("Aswani Chambers, Viman Nagar Rd, near Chaietanya Parhata, In front of BSNL-Exchange office, Sainik Nagar, Clover Park, Viman Nagar, Pune, Maharashtra 411014");
		//email address
		driver.findElement(By.xpath("//input[contains(@ng-model,'EmailAdress')]")).sendKeys("snehal@gmail.com");
		//phone
		driver.findElement(By.xpath("//input[contains(@ng-model,'Phone')]")).sendKeys("9922342121");
		//password
		driver.findElement(By.xpath("//input[contains(@id,'firstpassword')]")).sendKeys("Password123");
		//confirm password
		driver.findElement(By.xpath("//input[contains(@id,'secondpassword')]")).sendKeys("Password123");
		
		
	}

}
