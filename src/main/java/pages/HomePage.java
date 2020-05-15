package pages;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import mobileWrapper.AppSpecificMethods;

public class HomePage extends AppSpecificMethods{
	
	public HomePage(AppiumDriver<WebElement> driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	@Then("Home related page opened")
	public HomePage fetchParName() {
		if(verifyText("babu manickam", "xpath", "//label[text()=' PARTICIPANT NAME ']/preceding-sibling::label")) {
			reportStep("the ele babu manickam verified Successfully", "PASS");
		}else
			reportStep("the ele not return the text", "FAIL");
		return this;
	}
}
