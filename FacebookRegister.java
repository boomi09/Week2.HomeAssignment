package week2.HomeAssignment;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class FacebookRegister {
        //Home Assignment
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("DemoAccount");
		driver.findElement(By.name("lastname")).sendKeys("Test");
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Qwer@1234");
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Select Birthdate=new Select(day);
		Birthdate.selectByValue("14");
		WebElement month=driver.findElement(By.id("month"));
		Select Birthmonth=new Select(month);
		Birthmonth.selectByIndex(4);
		WebElement year=driver.findElement(By.id("year"));
		Select Birthyear=new Select(year);
		Birthyear.selectByVisibleText("1993");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.quit();
		
	}

}
