package DCR_CRF;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Add_Doctor {

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

	 
	          if (ele.getAttribute("innerHTML").contains("CRF")) {
	 
	 
	             ele.click();
	 	
	  
	             break;
	 
	          }
	 
	       } 
	     
	   
	        
driver.findElement(By.xpath("//li[8]/ul/li[1]//span")).click();


Select mark = new Select(driver.findElement(By.name("pass_marks"))); //Select pass mark
mark.selectByValue("60"); 

Select exam = new Select(driver.findElement(By.id("test_type"))); //Select Test type 
exam.selectByValue("2"); 

driver.findElement(By.name("doctor_name")).sendKeys("Dr Karim"); //Doctor Name

driver.findElement(By.id("doctor_designation")).sendKeys("Dentist"); //Designation

Select businesstype = new Select(driver.findElement(By.id("business_code"))); //Select business
businesstype.selectByValue("01");

driver.findElement(By.name("education_qualification")).sendKeys("MS"); //Education Qualification

Select sp = new Select(driver.findElement(By.id("doctor_speciality"))); //Select Speciality 
sp.selectByValue("7");

Select visittype = new Select(driver.findElement(By.id("doctor_type"))); //Select visit type
visittype .selectByValue("1");

Select ctg = new Select(driver.findElement(By.id("doctor_category"))); //Select Category
ctg.selectByValue("2");

Select gender = new Select(driver.findElement(By.id("gender"))); //Select gender 
gender.selectByValue("1");

driver.findElement(By.name("number_of_rx")).sendKeys("12"); //Rx Number


driver.findElement(By.id("expected_return_per_month")).sendKeys("30"); 

Select dctr = new Select(driver.findElement(By.id("select_pso"))); //Select gender 
dctr.selectByValue("0011");


driver.findElement(By.id("option2")).sendKeys("B"); //Option 2

driver.findElement(By.id("option3")).sendKeys("C"); //Option 3

driver.findElement(By.id("option4")).sendKeys("D"); //Option 4

Select optn = new Select(driver.findElement(By.id("answer"))); //Select answer
optn.selectByValue("c");

driver.findElement(By.xpath("//div[13]//a")).click(); //Add Question 


} 
}

