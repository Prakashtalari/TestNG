package orangehrmlibrerys;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utiles.AppUtiles;

public class NewEmploye extends AppUtiles
{
	public boolean addEmployee(String empname,String emplname)
	{
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		
		driver.findElement(By.id("firstName")).sendKeys(empname);
		driver.findElement(By.id("lastName")).sendKeys(emplname);
	String empid = 	driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(empid);
		driver.findElement(By.id("searchBtn")).click();
		
		WebElement emptable = driver.findElement(By.id("resultTable"));
		List<WebElement> rows,cols;
		
		rows = emptable.findElements(By.tagName("tr"));
		boolean flag = false;
		for(int i=1;i<rows.size();i++)
		{
			cols=rows.get(i).findElements(By.tagName("td"));
		if	(cols.get(1).getText().equalsIgnoreCase(empid))
		{
			flag= true ;
		}
			
			
		}
		return flag;
	}	
     
}
