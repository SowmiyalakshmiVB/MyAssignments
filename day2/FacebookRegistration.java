package AssignmentWeek2.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.time.Duration;



public class FacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click(); 
		driver.findElement(By.name("firstname")).sendKeys("sowmiya"); 
		driver.findElement(By.name("lastname")).sendKeys("vb");
		WebElement sourceElement = driver.findElement(By.id("day")); 
		Select dropdown1 = new Select(sourceElement);
		dropdown1.selectByValue("15");

		WebElement sourceElement1 = driver.findElement(By.id("month")); 
		Select dropdown2 = new Select(sourceElement1);
		dropdown2.selectByVisibleText("Oct");
		
		WebElement sourceElement2 = driver.findElement(By.id("year"));
		Select dropdown3 = new Select(sourceElement2);
		dropdown3.selectByValue("1994");
		
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click(); 
		driver.findElement(By.name("reg_email__")).sendKeys("sowmiya15@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("sowmiya@123"); 
		driver.findElement(By.linkText("Sign Up")).click();  
		
	}

}
