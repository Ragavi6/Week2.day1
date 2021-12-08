package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createlead {

	public static void main(String[] args) {
		
		//setup the chrome driver
		
		WebDriverManager.chromedriver().setup();
		
		//launch the chrome browser
		
		ChromeDriver driver=new ChromeDriver();
		
		//load the url(get "http"
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximise the browser
		
		driver.manage().window().maximize();
		
		//get the title
		
		String title = driver.getTitle();
	     System.out.println(title);
	     
	     //find the user name
	     driver.findElement(By .id("username")).sendKeys("DemosalesManager");
	     
	     driver.findElement(By .id("password")).sendKeys("crmsfa");
	    
	     driver.findElement(By .className("decorativeSubmit")).click(); 
	     
	     driver.findElement(By .linkText("CRM/SFA")).click(); 
	     
	     driver.findElement(By .linkText("Leads")).click();
	     
	     driver.findElement(By .linkText("Create Lead")).click();
	     
	     driver.findElement(By .id("createLeadForm_companyName")).sendKeys("TCS");
	     
	     driver.findElement(By .id("createLeadForm_firstName")).sendKeys("Ragavi");
	     
	     driver.findElement(By .id("createLeadForm_lastName")).sendKeys("Natarajan");
	     
	     WebElement ele = driver.findElement(By .id("createLeadForm_dataSourceId"));
	     
	     Select dd = new Select(ele);
	     
	     dd.selectByVisibleText("Employee");
	     
	     String text = driver.findElement (By .id ("viewLead_dataSources_sp")).getText();
	     
	     System.out.println(text);
	     
	     driver.findElement(By .name ("submitButton")).click();
	     
	     String title1=driver.getTitle();
	     
	     System.out.println(title1);
	     
	     //close the browser
	     
	     driver.close();
	        
	     
	       
	     
}

}