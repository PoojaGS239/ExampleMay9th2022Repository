package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUserModifyPOM {

		public static WebDriver oBrowser=null;
		public static ActiTimePage oPage=null;
		
		public static void main(String[] args)
		{
			launchBrowser();
			navigate();
			login();
			minimizeFlyOutWindow();
			createUser();
			modifyUser();
			deleteUser();
			logout();
			closeApp();
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
		
		private static void modifyUser()
		{
			try
			{
				oPage.getmodifytext().click();
			    Thread.sleep(2000);
			    oBrowser.findElement(By.name("firstName")).clear();
			    oPage.getuserDataLightBox_firstNameField().sendKeys("pooja");
			    //oBrowser.findElement(By.name("lastName")).clear();
				//oBrowser.findElement(By.name("lastName")).sendKeys("r");
				//oBrowser.findElement(By.name("email")).clear();
				//oBrowser.findElement(By.name("email")).sendKeys("sunil@gmail.com");
				//oBrowser.findElement(By.name("username")).clear();
				//oBrowser.findElement(By.name("username")).sendKeys("user");
				//oBrowser.findElement(By.name("password")).clear();
				//oBrowser.findElement(By.name("password")).sendKeys("welcome123");
				//oBrowser.findElement(By.name("passwordCopy")).clear();
				//oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome123");
				Thread.sleep(2000);
				oPage.getoSavechanges().click();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		
		private static void deleteUser()
		{
			try
			{
				oPage.getOdeleteuser().click();
				Thread.sleep(2000);
				oPage.getOdelbutton().click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();
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
				oPage.getoLogout().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
		
		private static void closeApp()
		{
			try
			{
				oBrowser.quit();
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
	}

