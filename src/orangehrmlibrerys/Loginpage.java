package orangehrmlibrerys;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;

import Utiles.AppUtiles;

public class Loginpage extends AppUtiles
{
	
	public void AdminLogin(String uname,String uid)
	{
		
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(uid);
		driver.findElement(By.id("btnLogin")).click();
	
	}
public boolean isAdminModuledisplayed()
{
if (driver.findElement(By.linkText("Admin")).isDisplayed()) 

{
	return true ;
	
}else 
{
	return false;
	
}	
}
public void logout() 
{
driver.findElement(By.partialLinkText("Welcome")).click();
driver.findElement(By.linkText("Logout")).click();

}

}
