package RX_Calculator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Manage_Working_Days {
	
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
	      
	   
driver.findElement(By.xpath("//li[10]/ul/li[2]//span")).click();

Select year = new Select(driver.findElement(By.id("year"))); //Select Year
year.selectByValue("2020");

Select month = new Select(driver.findElement(By.id("month"))); //Select Year
month.selectByValue("4");

driver.findElement(By.xpath("//div[3]/div/a")).click(); //Download

driver.findElement(By.xpath("//tr[1]//input")).sendKeys("2");

driver.findElement(By.xpath("//tr[2]//input")).sendKeys("1");

driver.findElement(By.xpath("//tr[3]//input")).sendKeys("1");

driver.findElement(By.xpath("//tr[4]//input")).sendKeys("1");

driver.findElement(By.xpath("//tr[5]//input")).sendKeys("1");

driver.findElement(By.xpath("//tr[6]//input")).sendKeys("0.5");

driver.findElement(By.xpath("//tr[7]//input")).sendKeys("1");

driver.findElement(By.xpath("//tr[8]//input")).sendKeys("1");

driver.findElement(By.xpath("//tr[9]//input")).sendKeys("1");

driver.findElement(By.xpath("//tr[10]//input")).sendKeys("1");

driver.findElement(By.xpath("//tr[11]//input")).sendKeys("0.5");

driver.findElement(By.xpath("//tr[12]//input")).sendKeys("2");

driver.findElement(By.xpath("//tr[13]//input")).sendKeys("1");

driver.findElement(By.xpath("//tr[14]//input")).sendKeys("1");

driver.findElement(By.xpath("//tr[15]//input")).sendKeys("1");

driver.findElement(By.xpath("//tr[16]//input")).sendKeys("1");

driver.findElement(By.xpath("//tr[17]//input")).sendKeys("0.5");

driver.findElement(By.xpath("//tr[18]//input")).sendKeys("1");

driver.findElement(By.xpath("//tr[19]//input")).sendKeys("1");

driver.findElement(By.xpath("//tr[20]//input")).sendKeys("1");

driver.findElement(By.xpath("//tr[21]//input")).sendKeys("1");

driver.findElement(By.xpath("//tr[22]//input")).sendKeys("0.5");

driver.findElement(By.xpath("//tr[23]//input")).sendKeys("1");

driver.findElement(By.xpath("//tr[24]//input")).sendKeys("1");

driver.findElement(By.xpath("//tr[25]//input")).sendKeys("0.5");

driver.findElement(By.xpath("//tr[26]//input")).sendKeys("1");

driver.findElement(By.xpath("//tr[27]//input")).sendKeys("0.5");

driver.findElement(By.xpath("//tr[28]//input")).sendKeys("1");

driver.findElement(By.xpath("//tr[29]//input")).sendKeys("1");

driver.findElement(By.xpath("//tr[30]//input")).sendKeys("0.5");

driver.findElement(By.xpath("//div[2]/div/div/a")).click();

driver.close();

}  
}
