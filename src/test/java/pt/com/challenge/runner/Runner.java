package pt.com.challenge.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import static pt.com.challenge.core.Driver.getDriver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "pt.com.challenge.steps" }, features = {
		"src/main/resources" },tags =  "@login-valid")
public class Runner {
	
	@AfterClass
	public static void encerraDriver() {
		getDriver().close();
	}

}
