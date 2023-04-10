package Utiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class AppUtiles
{
   public static WebDriver driver;
   public static String url = "http://Orangehrm.qedgetech.com";
   
   
   @BeforeSuite
	public static void LaunchApp()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
		
	}

	@AfterSuite 
	public static void closeapp()
	{
		driver.close();
		
	}
	
	
	
	
	
	
}
