package seleniumDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		

		driver.findElement(By.linkText("Alert with OK")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]")).click();
		
		Alert alt1=driver.switchTo().alert();
		String altmessage=driver.switchTo().alert().getText();		
		System.out.println(altmessage);	
		
		alt1.accept();
		Thread.sleep(3000);
	
		
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
		Alert alt2=driver.switchTo().alert();
		String altcnclmesg=driver.switchTo().alert().getText();		
		System.out.println(altcnclmesg);
			
		alt2.dismiss();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Alert with Textbox")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
		
		Alert alt3=driver.switchTo().alert();
		alt3.sendKeys("selenium"); 
			
		alt3.accept();
		Thread.sleep(3000);
		driver.close();
		
		System.out.println("Alert runned success");
	
		
		// TODO Auto-generated method stub

	}

}
