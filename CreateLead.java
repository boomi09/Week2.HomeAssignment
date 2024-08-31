package week2.HomeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
    //Home Assignment
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Attribute based XPath
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//Partial Attribute Based XPath
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[contains(@id,'Form_firstName')]")).sendKeys("Boomi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Raja");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("HomeAssignment");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		System.out.println("Profile Title Is:" + driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText());
		System.out.println("--------------------");
		System.out.println("Company Name Is:" + driver.findElement(By.id("viewLead_companyName_sp")).getText());
		System.out.println("--------------------");
		System.out.println(driver.getTitle());
		driver.close();

	}

}
