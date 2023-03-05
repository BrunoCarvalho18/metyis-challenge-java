package pt.com.challenge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pt.com.challenge.core.BasePage;
import pt.com.challenge.core.Driver;

public class LoginPage extends BasePage {

	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(css = "button[class='Button Button__primary cookie-notice__agree-button_lAIob']")
	WebElement cookies;
	
	@FindBy(xpath = "//button[@type='submit']/div")
	WebElement buttonRegister;
	
	@FindBy(xpath = "//*[contains(text(),'Aanmelden / Registreren')]")
	WebElement navBar;
	
	@FindBy(id = "signin-email")
	WebElement fieldEmail;
	
	@FindBy(id = "signin-password")
	WebElement fieldPassword;
	
	@FindBy(css = "p[class='MuiFormHelperText-root MuiFormHelperText-contained Mui-error MuiFormHelperText-filled']")
	WebElement txtHelperLogin;
	
	public WebElement getTxtHelperLogin() {
		return txtHelperLogin;
	}

	public void setTxtHelperLogin(WebElement txtHelperLogin) {
		this.txtHelperLogin = txtHelperLogin;
	}

	public WebElement getLogoLogin() {
		return logoLogin;
	}

	public void setLogoLogin(WebElement logoLogin) {
		this.logoLogin = logoLogin;
	}

	@FindBy(css = "span[class='header__link_NElNw account__icon_2qLVr header__link--name_21Pi_']")
	WebElement logoLogin;


	public WebElement getFieldEmail() {
		return fieldEmail;
	}

	public void setFieldEmail(WebElement fieldEmail) {
		this.fieldEmail = fieldEmail;
	}

	public WebElement getFieldPassword() {
		return fieldPassword;
	}

	public void setFieldPassword(WebElement fieldPassword) {
		this.fieldPassword = fieldPassword;
	}


	public WebElement getNavBar() {
		return navBar;
	}

	public void setNavBar(WebElement navBar) {
		this.navBar = navBar;
	}

	public WebElement getButtonRegister() {
		return buttonRegister;
	}

	public void setButtonRegister(WebElement buttonRegister) {
		this.buttonRegister = buttonRegister;
	}

	public WebElement getCookies() {
		return cookies;
	}

	public void setCookies(WebElement cookies) {
		this.cookies = cookies;
	}

}
