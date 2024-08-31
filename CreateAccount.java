package week2.HomeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
    //Home Assignment
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Attribute based XPath
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//Partial Attribute Based XPath
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Text based XPath
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Demo Account");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.xpath("//input[@id='numberEmployees']")).sendKeys("7");
		driver.findElement(By.xpath("//input[@name='officeSiteName']")).sendKeys("“LeafTaps”");
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		System.out.println("The Title Is :" + driver.getTitle() );
		driver.close();

	}

}
