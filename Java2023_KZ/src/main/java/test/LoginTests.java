package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;


public class LoginTests extends  BaseTest {
	
	@Test
	public void loginWithInvalidEmailInvildPassword() {
		LoginPage loginPage = new LoginPage();
		loginPage.loginWithInvildEmailInvildPassword("admin","admin");
	}
	@Test
	public void selectMenuOptionTest() {
		HomePage homePage = new HomePage();
		
		homePage.selectMenuOption("Training");
		
		homePage.selectMenuOption("Contact us");
		
		
	}


}
