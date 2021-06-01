package Testing_Center;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_Test {
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

	 
	          if (ele.getAttribute("innerHTML").contains("Testing Center")) {
	 
	 
	             ele.click();
	 	
	  
	             break;
	 
	          }
	 
	       } 
	     
	   
	        
driver.findElement(By.xpath("//li[4]/ul/li[1]//span")).click();


Select businesstype = new Select(driver.findElement(By.id("business"))); //Select business
businesstype.selectByIndex(1); 
 
Select mark = new Select(driver.findElement(By.name("pass_marks"))); //Select pass mark
mark.selectByValue("60"); 

Select exam = new Select(driver.findElement(By.id("test_type"))); //Select Test type 
exam.selectByValue("2"); 

driver.findElement(By.name("testName")).sendKeys("New Test"); //test time

driver.findElement(By.id("testSuggestion")).sendKeys("Test");

driver.findElement(By.name("time")).sendKeys("5"); //test time

driver.findElement(By.name("marks")).sendKeys("50"); //Total mark

driver.findElement(By.id("ques")).sendKeys("Test Question"); //Question

driver.findElement(By.id("option1")).sendKeys("A"); //Option 1

driver.findElement(By.id("option2")).sendKeys("B"); //Option 2

driver.findElement(By.id("option3")).sendKeys("C"); //Option 3

driver.findElement(By.id("option4")).sendKeys("D"); //Option 4

Select optn = new Select(driver.findElement(By.id("answer"))); //Select answer
optn.selectByValue("c");
 
driver.findElement(By.xpath("//div[13]//a")).click(); //Add Question 


} 
}



