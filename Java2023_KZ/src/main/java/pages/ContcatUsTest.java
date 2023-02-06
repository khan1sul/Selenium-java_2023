package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import test.BaseTest;
import utility.UtilityMethods;

public class ContcatUsTest {
	
	@FindBy(xpath="//input[@id='swpm_user_name']")
	public WebElement username;
	@FindBy(xpath="//input[@id='swpm_password']")
	public WebElement password;
	@FindBy(xpath="//input[@name='swpm-login']")
	public WebElement loginButton;
	
	//Constructor
	public ContcatUsTest(){
		PageFactory.initElements(BaseTest.driver,this);
	}
	//Actions
	
	public void loginWithInvildEmailInvildPassword(String uname, String pword) {
		
		BaseTest.wait.until(ExpectedConditions.visibilityOf(username));
		UtilityMethods.sendKeysEle(username,uname);
		UtilityMethods.sendKeysEle(password,pword);
		
		
//		password.clear();
//		password.sendKeys("admin");
		
		loginButton.click();
	

	
	
	}
}
	//System.out.println(driver.findElement(username).getAttribute("class"));
	//Assert.assertTrue( BaseTest.driver.getCurrentUrl().equals(  BaseTest.baseURL));
	 	
	


