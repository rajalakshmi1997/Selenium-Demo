package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		String expectedtitle="Demo Web Shop. Login";
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
		if(actualtitle.equals(expectedtitle))
		{
		System.out.println("you are in correct page");	
		driver.findElement(By.id("Email")).sendKeys("g.rajlakshmi1997@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Raji@@19972103");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();		
		
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
		
		}
		else
		{
		System.out.println("you are in wrong page");
		driver.close();
			
		}
		
		
		
	
		// TODO Auto-generated method stub

	}

}
