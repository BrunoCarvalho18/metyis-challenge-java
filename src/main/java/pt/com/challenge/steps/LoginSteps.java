package pt.com.challenge.steps;

import static pt.com.challenge.core.Driver.getDriver;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pt.com.challenge.functionalities.LoginFunctionalities;

public class LoginSteps {

	String url = "https://nl.tommy.com/";
	String validation;
	LoginFunctionalities loginFunctionalities = new LoginFunctionalities();

	@Given("I am on the home page")
	public void i_am_on_the_home_page() {
		getDriver().get(url);

	}

	@When("I would like to do a login")
	public void i_would_like_to_do_a_login() throws InterruptedException {
		loginFunctionalities.clickCookies();
		loginFunctionalities.clickNavBar();
		loginFunctionalities.waitForElementVisibleSiginEmail();
		loginFunctionalities.writeEmail("brunocarvalhodesa@gmail.com");
		loginFunctionalities.writePassword("Yeovah@123");
		loginFunctionalities.clickButtonRegister();

	}

	@Then("It was successfully logged")
	public void it_was_successfully_logged() {
		try {
			validation = loginFunctionalities.returnLogoLogin();
		} catch (NoSuchElementException e) {
			Assert.assertEquals(validation, "hoi!");
		}
		

		
	}

}
