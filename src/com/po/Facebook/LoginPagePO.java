package com.po.Facebook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.library.Facebook.BasePage;
public class LoginPagePO extends BasePage 
{
	public LoginPagePO(WebDriver driver) 
	{
		super(driver);
	}
	@FindBy(id="email")
	private WebElement unTxtBx;
	@FindBy(name="pass")
	private WebElement pwTxtBx;
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement loginBtn;
	public void login(String un, String pw)
	{
		unTxtBx.sendKeys(un);
		pwTxtBx.sendKeys(pw);
		loginBtn.click();	
	}
	@FindBy(xpath="//span[contains(text(),'Username or Password is invalid. Please try again.')]")
	private WebElement errorMsg;
	public String verifyerrorMsg()
	{
		return errorMsg.getText();
	}
}
