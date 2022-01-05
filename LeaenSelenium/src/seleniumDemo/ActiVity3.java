package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiVity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Rajalakshmi");
		driver.findElement(By.name("LastName")).sendKeys("Gnanavel");
		driver.findElement(By.id("Email")).sendKeys("g.rajlakshmi1998@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Raji@@19972103");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Raji@@19972103");
		driver.findElement(By.name("register-button")).click();
		
	}

}
