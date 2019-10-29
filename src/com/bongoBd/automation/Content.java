package com.bongoBd.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;


public class Content {
	WebDriver driver;
	JavaScriptExecutor jse;
	
	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ratul\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().deleteAllCoockies();
			driver.manage().windows().maximize();
			driver.get("https://www.bongobd.com/");
			contentTest();		
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	
	
	public void contentTest() {
		try {
			Thread.sleep(2000);
			jse = (JavaScriptExecutor)driver;
			jse.executeScript("scroll(0,1000)");
			driver.findElement(By.xpath("//a[@href='/bn/watch?v=38WyU8nj2vO']")).click();		
			driver.findElement(By.id("content_video_html5_api"));
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	

	public static void main(String[] args) {
		Content obj = new Content();
		obj.invokeBrowser();
		

	}

}
