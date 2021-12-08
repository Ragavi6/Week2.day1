package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learndropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Dropdown.html");
		
         driver.manage().window().maximize();
         
         // i wanted to choose one of the dropdown value
         
         //step 1- find the dropdown element(select tag)
		
         WebElement eleDropDown = driver.findElement(By .id("dropdown1"));
         
		// step 2- convert that as select class (dropdown)
		
         Select select = new  Select (eleDropDown);
		
		// step 3- choose the value based n option
		
         
		select.selectByVisibleText("Appium");
		
		
		// step 3- choose by the index
		
		select.selectByIndex(2);//o,1,2,3
		
		// select the last dropdown
		
		//total count(size)-1
		
		//how many option tag
		
		int size = select.getOptions().size();
		
		select.selectByIndex(size-1);
		
		//another way to find the 
		
	}
}
