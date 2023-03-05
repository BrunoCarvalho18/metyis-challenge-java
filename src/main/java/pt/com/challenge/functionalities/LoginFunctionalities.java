package pt.com.challenge.functionalities;

import org.openqa.selenium.By;
import pt.com.challenge.pages.LoginPage;

public class LoginFunctionalities {

	private LoginPage loginPage;

	public LoginFunctionalities() {
		loginPage = new LoginPage();
	}

	public void clickCookies() {
		loginPage.getCookies().click();
	}

	public void clickButtonRegister() {
		loginPage.getButtonRegister().click();
	}

	public void clickNavBar() {
		loginPage.getNavBar().click();
	}

	public void writeEmail(String email) {
       loginPage.getFieldEmail().sendKeys(email);
	}
	
	public void writePassword(String password){
	   loginPage.getFieldPassword().sendKeys(password);
	}
	
	public void waitForElementVisible() {
		loginPage.waitForElementPresent(By.id("signin-email"));
	}
	
	public String returnLogoLogin() {
		return loginPage.getLogoLogin().getText();
		
	}
	

}
