package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateCustomerPOM {
	
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		
		//deleteUser();
		//logout();
		//closeApp();
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	private static void login()
	{
		try
		{
			oPage.getUsername().sendKeys("admin");
			oPage.getPwd().sendKeys("manager");
			oPage.getoLogin().click();
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
			oPage.getGettingStartedShortcutsPanelId().click();
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
			oPage.getCreateuser().click();
			Thread.sleep(2000);
			oPage.getAdduserbutton().click();
			Thread.sleep(2000);
			oPage.getFirstName().sendKeys("demo");
			oPage.getLastName().sendKeys("user");
			oPage.getEmail().sendKeys("demo@gmail.com");
			oPage.getUserDataLightBox_usernameField().sendKeys("demouser");
			oPage.getPassword().sendKeys("Welcome123");
			oPage.getPasswordCopy().sendKeys("Welcome123");
			Thread.sleep(4000);
			oPage.getoCreateuser().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@Test(priority=6)
	private static void deleteCustomer()
	{
		try
		{
		    oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
		    Thread.sleep(2000);
		    oBrowser.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitBtn\']/div")).click();
		    Thread.sleep(2000);
		    
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
