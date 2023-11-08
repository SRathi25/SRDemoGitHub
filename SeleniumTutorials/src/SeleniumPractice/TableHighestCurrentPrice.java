package SeleniumPractice;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableHighestCurrentPrice {

	public static void main(String[] args) throws ParseException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\JarFiles\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().window().maximize();

		
		
		List<WebElement> currentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Number of Elements = " + currentPrice.size());
		for(WebElement we:currentPrice)
		{
			System.out.println(we.getText());
		}
		
		String max;
		double n=0,p=0;
		
		//No. of columns
		List<WebElement> columns=driver.findElements(By.xpath("//div[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("No. of columns = " + columns.size());
		
		//No. of rows
		List<WebElement> rows=driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("No. of rows = " + rows.size());
		
		
		for(int i=1;i<(rows.size());i++)
		{
			max=driver.findElement(By.xpath("/html/body/div[1]/div[5]/table/tbody/tr["+(i+1)+"]/td[4]")).getText();
			NumberFormat f=NumberFormat.getNumberInstance();
			Number num=f.parse(max);
			max=num.toString();
			n=Double.parseDouble(max);
			if(n>p)
			{
				p=n;
			}
			
		}
		
		System.out.println("The web table current price = " + p);
		
	/*	
		String firstPart="//table[@class='dataTable']/tbody/tr[";
		String secondPart="]/td[4]";
		ArrayList<Integer> array=new ArrayList<Integer>();
		for(int i=1;i<currentPrice.size();i++)
		{
			String finalPart=firstPart+i+secondPart;
			String price=driver.findElement(By.xpath(finalPart)).getText();
			
			NumberFormat numberFormat=NumberFormat.getNumberInstance();
			Number num=numberFormat.parse(price);
			price=num.toString();
			Double dPrice = Double.parseDouble(price);
			int intPrice=dPrice.intValue();
			array.add(intPrice);
		
		}
		
		Collections.sort(array);
		System.out.println(array.get(0));
		System.out.println(array.get(array.size()-1));
				
		
		
		*/	
		
		
	/*
		List<String> currentPriceStr=new ArrayList<>();
		
		
		for(int i=0;i<currentPrice.size();i++)
		{
			currentPriceStr.add(currentPrice.get(i).getText());
		}
		
		System.out.println(currentPriceStr);
		
		

		
		Object obj=Collections.max(currentPriceStr);
		System.out.println(obj);
	
	
	*/
	/*	Double max=Double.parseDouble(currentPrice.get(0).getText());
	
		
		Iterator currentPriceIterator=currentPrice.iterator();
		
		
		while(currentPriceIterator.hasNext())
		{
			Double num=(Double) currentPriceIterator.next();
			
			if(num > max)
				max=num;
		}
		
		System.out.println("Maximum = " + max);
		
	*/
		
		//Current Price
		//display highest current price
		
		
		
		
	}


}
