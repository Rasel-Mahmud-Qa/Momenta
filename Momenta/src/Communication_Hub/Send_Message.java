package Communication_Hub;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Send_Message {
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

	 
	          if (ele.getAttribute("innerHTML").contains("Communication Hub")) {
	 
	 
	             ele.click();
	 	
	  
	             break;
	 
	          }
	 
	       } 
	     
	   
	        
driver.findElement(By.xpath("//li[7]/ul/li[1]/a")).click();

driver.findElement(By.name("message_title")).sendKeys("Covid Notice"); //Message Titile

driver.findElement(By.name("message_body")).sendKeys("The new and ongoing coronavirus (COVID-19) pandemic,"
		+ "caused by a new strain of coronavirus, has resulted in extraordinary "
		+ "measures around the world to contain, slow the pace, or reduce the impact of the virus."); 


driver.findElement(By.name("sent_by")).sendKeys("Mr. Kamrul Hasan"); //Select Sender Name


Select businesstype = new Select(driver.findElement(By.id("universal_business"))); //Select business
businesstype.selectByValue("03"); 

Select regn = new Select(driver.findElement(By.id("business_wise_region"))); //Select region
regn.selectByValue("11"); 
regn.selectByValue("12"); 
regn.selectByValue("13"); 
regn.selectByValue("14"); 
regn.selectByValue("15"); 


driver.findElement(By.xpath("//div[1]/div[2]/div/div[3]//button")).click(); //Send Message


driver.findElement(By.xpath("//div[3]/div/div/div[2]/div[1]//a")).click();  //Assign


Select usr = new Select(driver.findElement(By.id("user_type"))); //Select Users
usr.selectByValue("2");
 


} 
	
	
}
