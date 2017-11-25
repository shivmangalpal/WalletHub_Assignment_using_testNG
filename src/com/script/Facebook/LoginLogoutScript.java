package com.script.Facebook;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.library.Facebook.BaseTest;
import com.po.Facebook.HomePagePO;
import com.po.Facebook.LoginPagePO;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class LoginLogoutScript  extends BaseTest
{
	@Test
	public void validLoginLogout()
	{
		try 
		{
			driver.get("https://www.facebook.com/");
			LoginPagePO login=new LoginPagePO(driver);
			login.login("shivmangal1987@gmail.com", "shiv@1234");
			driver.findElement(By.xpath("//div[@class='_nh6 _3qd3']")).click();
			
			Actions actions = new Actions(driver);
	        actions.moveToElement(driver.findElement(By.xpath("//div[@class='_1p1v']")));
	        actions.click();
	        actions.sendKeys(" i love my India ");
	        actions.build().perform();
			driver.findElement(By.xpath("//button[@class='_1mf7 _4jy0 _4jy3 _4jy1 _51sy selected _42ft']")).click();
			
			HomePagePO home=new HomePagePO(driver);
			home.verifyTitle("Facebook");
			home.logout();
			String expected = "Facebook";
			String actual = driver.getTitle();
			AssertJUnit.assertEquals(actual, expected);
			Reporter.log("Valid LoginLogout Pass",true);
		}
		catch (Exception e) 
		{
			Reporter.log("Valid LoginLogout Fail",true);
			AssertJUnit.fail();
		}
	}	
	}
	


