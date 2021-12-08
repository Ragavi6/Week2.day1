package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignmenttestcase3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
	     
	    driver.findElement(By .id("username")).sendKeys("DemosalesManager");
	     
	    driver.findElement(By .id("password")).sendKeys("crmsfa");
	    
	    driver.findElement(By .className("decorativeSubmit")).click(); 
	     
	    driver.findElement(By .linkText("CRM/SFA")).click(); 
	    
	    driver.findElement(By .linkText("Leads")).click();
	     
	    driver.findElement(By .linkText("Create Lead")).click();
	    
	    driver.findElement(By .id("createLeadForm_companyName")).sendKeys("TCS");
	     
	     driver.findElement(By .id("createLeadForm_firstName")).sendKeys("Ragavi");
	     
	     driver.findElement(By .id("createLeadForm_lastName")).sendKeys("Natarajan");
	    
	    WebElement ele = driver.findElement(By.id("createLeadForm_dataSourceId"));		
		Select DD = new Select(ele);		
		DD.selectByVisibleText("Employee");
		
		WebElement ele2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select MC = new Select(ele2);
		MC.selectByValue("DEMO_MKTG_CAMP"); 
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ragavi");
		
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("N");
		
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Ms");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("310000");
		
		WebElement ele3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select PC = new Select(ele3);
		PC.selectByVisibleText("INR - Indian Rupee");
		
		WebElement ele4 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industry = new Select(ele4);
		industry.selectByVisibleText("Computer Software");
		
		WebElement ele5 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownership = new Select(ele5);
		ownership.selectByIndex(2);
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("160");
		
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("6");
		
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("N");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Create Lead");
		
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("important");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("641025");

		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("996292168");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("91");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("friend");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Ragavinatarajan6@gmail.com");
		
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.testleaf.com");
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Test Leaf");
		
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Babu");
		
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("karuparaiyan kovil street");
		
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Anuparpalaiyam pudhur");
		
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Tirupur");
		
		WebElement ele6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(ele6);			
		state.selectByValue("DC");
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("641025");
		
		WebElement ele7 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select country = new Select(ele7);			
		country.selectByValue("USA");
		
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("91");
				
		driver.findElement(By.name("submitButton")).click();		
		
		String text = driver.findElement(By.id("viewLead_dataSources_sp")).getText();
		System.out.println(text);
		
		
		//Get the title
		String actualtitle = driver.getTitle();
		String exptitle = "View Lead";
		
		if (actualtitle==exptitle) {
			System.out.println(actualtitle);
			
		} else {
			System.out.println(exptitle);

		}
		
		
		

	}

}
	    
	