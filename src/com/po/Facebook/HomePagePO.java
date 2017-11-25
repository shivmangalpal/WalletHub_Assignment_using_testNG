package com.po.Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.library.Facebook.BasePage;

public class HomePagePO  extends BasePage
{
	public HomePagePO(WebDriver driver) 
	{
		super(driver);		
	}
	@FindBy(id="userNavigationLabel")
	private WebElement logoutBtn;
	public void logout()
	{
		logoutBtn.click();
	}
}
