package seleniumDemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class log4jDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger log =Logger.getLogger(log4jDemo.class);
        PropertyConfigurator.configure("log4j.properties");
		
		System.setProperty("webdriver.chrome.driver","C:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		log.info("Launch Browser");
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		log.info("opened application");
		String expectedtitle="Demo Web Shop. Login";
		String actualtitle=driver.getTitle();
		//System.out.println(actualtitle);
		log.info(actualtitle);
		
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
		log.error("wrong page");

	}
	}
}


