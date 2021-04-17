package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test{
	
	public static void main(String[] args){
		
		
		System.setProperty("webdriver.chrome.driver", "C:/ChromeDriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Best Sellers")).click();
		
		driver.close();
		
		System.out.println("success ");
	}

}
