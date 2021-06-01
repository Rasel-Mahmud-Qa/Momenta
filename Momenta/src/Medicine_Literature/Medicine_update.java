package Medicine_Literature;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Medicine_update {
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

	 
	          if (ele.getAttribute("innerHTML").contains("Medicine Literature")) {
	 
	 
	             ele.click();
	 	
	  
	             break;
	 
	          }
	 
	       } 
	     
	   
	        
driver.findElement(By.xpath("//li[3]/ul/li[1]//span")).click();

Select businesstype = new Select(driver.findElement(By.id("business"))); //Select business
businesstype.selectByValue("1");

Select generic = new Select(driver.findElement(By.id("generic_name1"))); //Select generic name 
generic.selectByValue("80");

Select drug = new Select(driver.findElement(By.id("drug1"))); //Select drug name 
drug.selectByValue("81");

Select file = new Select(driver.findElement(By.id("type"))); //Select Upload type
file.selectByValue("1");

driver.findElement(By.xpath("//div[7]/button")).click();  //Save 

} 
}



