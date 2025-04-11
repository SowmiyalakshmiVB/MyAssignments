package AssignmentWeek2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Create_Lead_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
				// TODO Auto-generated method stub
				
				ChromeDriver driver =new ChromeDriver();
				
				driver.manage().window().maximize();

				driver.get("http://leaftaps.com/opentaps/");

				driver.findElement(By.id("username")).sendKeys("demosalesmanager"); 
				driver.findElement(By.id("password")).sendKeys("sowmiya");
				driver.findElement(By.className("decorativeSubmit")).click(); 
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("FIS");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sowmiya");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lakshmi");
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TestLeaf");
				
				driver.findElement(By.name("submitButton")).click();
				
				driver.close();
				
				
				
			}

		}



