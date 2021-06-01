package Renata_Shop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Incentive {

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

	 
	          if (ele.getAttribute("innerHTML").contains("Renata Shop")) {
	 
	 
	             ele.click();
	 	
	  
	             break;
	 
	          }
	 
	       } 
	     
	   
	        
driver.findElement(By.xpath("//li[5]/ul/li[1]/a")).click();
/*
Select businesstype = new Select(driver.findElement(By.id("business"))); //Select business
businesstype.selectByValue("01");
*/
driver.findElement(By.name("title")).sendKeys("Shampoo"); // title

driver.findElement(By.id("description")).sendKeys("Test"); //description

driver.findElement(By.name("point")).sendKeys("10"); //Point

driver.findElement(By.name("quantity")).sendKeys("100"); //

// driver.findElement(By.name("//button[1]")).click(); //Save

driver.findElement(By.xpath("//button[2]")).click(); //Reset
 
Thread.sleep(3000);
driver.close();

} 
}
