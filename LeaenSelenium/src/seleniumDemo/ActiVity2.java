package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActiVity2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement year=driver.findElement(By.xpath("//select[@placeholder='Year']"));
		Select year1=new Select(year);
		year1.selectByValue("1997");
		
		WebElement day=driver.findElement(By.xpath("//select[@placeholder='Day']"));
		Select day1=new Select(day);
		day1.selectByVisibleText("21");
		// TODO Auto-generated method stub

	}

}
