package com.Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTest {
public static WebDriver driver;

	@BeforeClass
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup(); // Automatically sets up the ChromeDriver
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
	}

	@Test
	public void Test1() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test 1 title is: "+ driver.getTitle());
	}
	
	@Test
	public void Test2() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test 1 title is: "+ driver.getTitle());
	}
	
	@Test
	public void Test3() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test 1 title is: "+ driver.getTitle());
	}
	
	@Test
	public void quit() {
		driver.quit();
	}
}
