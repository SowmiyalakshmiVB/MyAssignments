package AssignmentWeek2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_Account_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");  
		driver.findElement(By.id("password")).sendKeys("sowmiya");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Test");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement sourceElement1=driver.findElement(By.name("industryEnumId"));
		Select dropdown1 = new Select(sourceElement1);
		dropdown1.selectByVisibleText("Computer Software");
		
		WebElement sourceElement2=driver.findElement(By.name("ownershipEnumId"));
		Select dropdown2 = new Select(sourceElement2);
		dropdown2.selectByVisibleText("Sole Proprietorship");
		
		WebElement sourceElement3=driver.findElement(By.name("dataSourceId"));
		Select dropdown3 = new Select(sourceElement3);
		dropdown3.selectByVisibleText("Direct Mail");
		
		WebElement sourceElement4=driver.findElement(By.name("marketingCampaignId"));
		Select dropdown4 = new Select(sourceElement4);
		dropdown4.deselectByVisibleText("Automobile");
		
		WebElement sourceElement5=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dropdown5 = new Select(sourceElement5);
		dropdown5.selectByValue("Alabama");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.close();
	
		
		
	}


	}
