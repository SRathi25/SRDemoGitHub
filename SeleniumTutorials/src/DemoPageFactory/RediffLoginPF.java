package DemoPageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RediffLoginPF {

/*	
	@FindBy(xpath = "//input[@id='login1']")
	WebElement txtUsername;
*/	
	@FindBy(how=How.XPATH, using = "//input[@id='login1']")
	WebElement txtUsername;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@type='submit']")
	@CacheLookup	//it takes WebElement and stores it in Cache memory
	WebElement btnSign;
	
	
	public void signInWrong()
	{
		txtUsername.sendKeys("Seed");
		txtPassword.sendKeys("Seed123");
		btnSign.click();
	}

}
