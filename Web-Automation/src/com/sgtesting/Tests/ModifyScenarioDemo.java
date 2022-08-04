package com.sgtesting.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyScenarioDemo {
	
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		modifyUser();
		logout();
		closeApplication();
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("pooja");
			oBrowser.findElement(By.name("lastName")).sendKeys("gs");
			oBrowser.findElement(By.name("email")).sendKeys("pooja@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("poojags");
			oBrowser.findElement(By.name("password")).sendKeys("pooja123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("pooja123");
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[2]")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.name("firstName")).clear();
		    oBrowser.findElement(By.name("firstName")).sendKeys("sunil");
		    oBrowser.findElement(By.name("lastName")).clear();
			oBrowser.findElement(By.name("lastName")).sendKeys("r");
			oBrowser.findElement(By.name("email")).clear();
			oBrowser.findElement(By.name("email")).sendKeys("sunil@gmail.com");
			oBrowser.findElement(By.name("username")).clear();
			oBrowser.findElement(By.name("username")).sendKeys("user");
			oBrowser.findElement(By.name("password")).clear();
			oBrowser.findElement(By.name("password")).sendKeys("welcome123");
			oBrowser.findElement(By.name("passwordCopy")).clear();
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome123");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	

}
