package alllinks.facebooktest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
	public static WebDriver driver;
    public static void main( String[] args ) throws InterruptedException
    {
       
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\seleniumprject1\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();  // opening browser	
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
	List<WebElement> Links=	driver.findElements(By.tagName("a"));
	
	// How to print all values of an array or list
    	
  for (int i=0; i<Links.size()-1;i++) {
	  System.out.println(Links.get(i).getAttribute("href"));
  }
    	
    }
}
