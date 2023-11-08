package DemoGrid;

import org.testng.annotations.Test;
import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
 
public class SeleniumGridTest 
{
 
@Test
public void runFirefox() throws MalformedURLException
{

/*
Config hub  >java -jar java -jar E:\JarFiles\selenium-server-standalone-3.141.59.jar -role hub -role hub
config node  >java -Dwebdriver.gecko.driver="c:\\jarfiles\\geckodriver.exe" -jar c:\\jarfiles\\selenium-server-standalone-3.5.3.jar 
              -role node -hub http://192.168.43.130:4444/grid/register -port 5555

to free port if busy   >netstat  -ano  |  findstr  4444   // this command will give info of which process is currently running on the port

                       >taskkill /pid 13788 /f  // use this command to free the port. replace the number with pid number given in the info of above command




*/
 
// We have to mention browser which we want to use for test execution
DesiredCapabilities cap=DesiredCapabilities.firefox();
 
// Set the platform where we want to run our test- we can use MAC and Linux and other platforms as well
cap.setPlatform(Platform.WINDOWS);
 
// Here you can use hub address, hub will take the responsibility to execute the test on respective node
URL url=new URL("http://localhost:4444/wd/hub");
 
// Create driver with hub address and capability
WebDriver driver=new RemoteWebDriver(url, cap);
 
// start application
driver.get("https://opensource-demo.orangehrmlive.com/");
 
// get the title and print the same
System.out.println("Blog title is "+driver.getTitle());
 
driver.close();
 
}
 
}