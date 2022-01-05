package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeActivity {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.id("welcome")).click();
		WebDriverWait mywait=new WebDriverWait(driver, 10);
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
		
		//driver.findElement(By.id("welcome-menu")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		driver.close();
		System.out.println("Run Sucessfully");
	
		
		// TODO Auto-generated method stub

	}

}
