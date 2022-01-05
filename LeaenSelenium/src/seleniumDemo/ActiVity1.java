package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiVity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		String tit=driver.getTitle();
		int tit1=driver.getTitle().length();
		System.out.println(tit);
		System.out.println(tit1);
					
		
		String expectedurl="http://demowebshop.tricentis.com/";
		String actualurl=driver.getCurrentUrl();
		if(actualurl.equals(expectedurl))
		{
		System.out.println("you are in correct page");
		}
		else
		{
			System.out.println("You are in wrong page");
		}
		
		String pagesrc=driver.getPageSource();
		int pagesrc1=driver.getPageSource().length();
		System.out.println(pagesrc1);
		driver.close();
	
	}

}
