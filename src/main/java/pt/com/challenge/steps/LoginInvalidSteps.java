package pt.com.challenge.steps;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pt.com.challenge.functionalities.LoginFunctionalities;

public class LoginInvalidSteps {
	
	LoginFunctionalities loginFunctionalities = new LoginFunctionalities();
	
	@When("I would like to do a login with {string} and {string}")
	public void i_would_like_to_do_a_login_with_and(String email, String password) {
		try {
			loginFunctionalities.clickCookies();
		} catch (NoSuchElementException e) {
		  //I put the sysout, but the correct is put logger
		  System.out.println("Element does not appear");
		}
		loginFunctionalities.waitForElementVisibleNavBar();
		loginFunctionalities.clickNavBar();
		loginFunctionalities.waitForElementVisibleSiginEmail();
		loginFunctionalities.writeEmail(email);
		loginFunctionalities.writePassword(password);
		loginFunctionalities.clickButtonRegister();
	    
	}
	@Then("It was not a successfully logged {string}")
	public void it_was_not_a_successfully_logged(String messageEmail) {
		String validation = loginFunctionalities.returnTxtHelperEmail();
		Assert.assertEquals(validation, messageEmail);
	}

}
