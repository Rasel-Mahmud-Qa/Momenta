package RX_Calculator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rx_Budget {
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

	 
	          if (ele.getAttribute("innerHTML").contains("Rx Calculator")) {
	 
	 
	             ele.click();
	 	
	  
	             break;
	 
	          }
	 
	       } 
	     
	   
	        
driver.findElement(By.xpath("//li[10]/ul/li[3]/a")).click();

Select businesstype = new Select(driver.findElement(By.id("business_code"))); //Select business
businesstype.selectByValue("01");

Select PG = new Select(driver.findElement(By.id("product_group_list"))); //Select PG
PG.selectByValue("147");

driver.findElement(By.xpath("//tr[1]//input")).sendKeys("100");

driver.findElement(By.xpath("//tr[2]//input")).sendKeys("90");

driver.findElement(By.xpath("//tr[3]//input")).sendKeys("40");

driver.findElement(By.xpath("//tr[4]//input")).sendKeys("80");

driver.findElement(By.xpath("//tr[5]//input")).sendKeys("60");

driver.findElement(By.xpath("//tr[6]//input")).sendKeys("70");

driver.findElement(By.xpath("//button")).click();



} 
}

