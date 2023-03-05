package pt.com.challenge.functionalities;

import org.openqa.selenium.By;
import pt.com.challenge.pages.LoginPage;

//Actions and Functionalities
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
	
	public void waitForElementVisibleSiginEmail() {
		loginPage.waitForElementPresent(By.id("signin-email"));
	}

	public void writeEmail(String email) {
       loginPage.getFieldEmail().sendKeys(email);
	}
	
	public void writePassword(String password){
	   loginPage.getFieldPassword().sendKeys(password);
	}
	
	public void waitForElementVisibleNavBar() {
		loginPage.waitForElementPresent(By.xpath("//*[contains(text(),'Aanmelden / Registreren')]"));
	}
	
	public String returnLogoLogin() {
		return loginPage.getLogoLogin().getText();
		
	}
	
	public String returnTxtHelperEmail() {
		return loginPage.getTxtHelperLogin().getText();
	}
	

}
