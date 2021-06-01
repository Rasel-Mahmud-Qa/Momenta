package RX_Calculator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Manage_RX {

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
	     
	   
	        
driver.findElement(By.xpath("//li[10]/ul/li[1]/a")).click();

Select businesstype = new Select(driver.findElement(By.id("business_code"))); //Select business
businesstype.selectByValue("01");

Select psotype = new Select(driver.findElement(By.id("pso_type"))); //Select PSO Type
psotype.selectByValue("1");

Select rsm = new Select(driver.findElement(By.id("rsm_list"))); //Select RSM
rsm.selectByValue("R01");

Select dsm = new Select(driver.findElement(By.id("dsm_list"))); //Select DSM
dsm.selectByValue("D01"); 

Select pso = new Select(driver.findElement(By.id("pso_list"))); //Select PSO
pso.selectByValue("RF11117");

driver.findElement(By.xpath("//div[7]//button")).click(); //Filter

driver.close();

} 
}

