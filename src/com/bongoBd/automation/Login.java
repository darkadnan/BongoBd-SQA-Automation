package com.bongoBd.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

public class Login {
	WebDriver driver;
	JavaScriptExecutor jse;
	
	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ratul\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().deleteAllCoockies();
			driver.manage().windows().maximize();
			driver.get("https://www.bongobd.com/");
			bongoBdLogin();
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	
	public void bongoBdLogin() {
		try {
			//driver.findElement(By.linkText("লগ-ইন")).click()
			
			driver.findElement(By.xpath("//a[@href='/bn/login?type=login\']")).click();
			driver.findElement(By.id("regNext")).click();
			driver.findElement(By.id("u_0_3")).click();
			Thread.sleep(2000);
			jse = (JavaScriptExecutor)driver;
			jse.executeScript("scroll(0,500)");
			driver.findElement(By.name("Country")).click();
			driver.findElement(By.id("u_0_6q")).sendKeys("1791801682");
			driver.findElement(By.id("u_0_6r")).click();
			driver.findElement(By.id("u_0_2")).sendKeys("670321");
			driver.findElement(By.id("u_0_3")).click();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}	
		
	}

	public static void main(String[] args) {
		Login myObj = new Login();
		myObj.invokeBrowser();
		

	}

}
