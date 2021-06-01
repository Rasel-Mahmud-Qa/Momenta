package com.momenta;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Monthly_POA {
	public static void main(String[] args) throws InterruptedException {
		 
		 
	       // Start Chrome browser
	 
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	 
	 
	       // start the application
			driver.get("https://dev.appinionbd.com/momenta_web/login");

			//Input valid user name and password
					driver.findElement(By.name("userid")).sendKeys("admin");
				    driver.findElement(By.name("passwd")).sendKeys("Appinion2021"); 
					driver.findElement(By.className("fa-lock")).click();
				    System.out.println("Loging Successful");
	
	 
	       Thread.sleep(2000); 
	 
	       List<WebElement> list = driver.findElements(By.xpath("//ul/li[@class='has-sub']/a/span"));
	 
	 
	 
	       for (WebElement ele : list)
	 
	       {
	 	 
	          System.out.println("Values " + ele.getAttribute("innerHTML"));
	 
	 
	          if (ele.getAttribute("innerHTML").contains("Monthly POA")) {
	
	 
	             ele.click();
	  
	             break;
	 
	          }
	 
	       } 
	     
	   
	        
 driver.findElement(By.xpath("//li[2]/ul/li[1]//span")).click();
 
 Select programtype = new Select(driver.findElement(By.name("business")));   //Select 
  programtype.selectByValue("01"); 
 //programtype.selectByValue("02"); 
 //programtype.selectByValue("03"); 
// programtype.selectByValue("04"); 
	       
 Select month = new Select(driver.findElement(By.name("month")));   //Select 
 month.selectByValue("1"); 
 //month.selectByValue("2"); 
 //month.selectByValue("3"); 
 //month.selectByValue("4"); 
 //month.selectByValue("5"); 
 //month.selectByValue("7"); 
 //month.selectByValue("8"); 
 //month.selectByValue("9"); 
 //month.selectByValue("10"); 
 //month.selectByValue("11"); 
//month.selectByValue("12"); 

}
}