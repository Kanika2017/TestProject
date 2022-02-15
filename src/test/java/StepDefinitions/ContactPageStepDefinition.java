package StepDefinitions;

import Pages.ContactPage;
import Pages.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import org.junit.Assert;
import org.openqa.selenium.By;

public class ContactPageStepDefinition extends DriverFactory {

	ContactPage contactPage = new ContactPage();

	@Given("^I click on submit button on contact page$")
	public void click_On_Submit_Button() {
		contactPage.clickOnSubmitButton();
	}

	@Then("^I validate the forename error is displayed \"([^\"]*)\"$")
	public void validate_forname_error(Boolean isDisplayed) {
		if (isDisplayed) {
			Assert.assertTrue(contactPage.validateForenameError());
		} else {
			Assert.assertFalse(contactPage.validateForenameError());

		}

	}

	@Then("^I validate the email error is displayed \"([^\"]*)\"$")
	public void validate_email_error(Boolean isDisplayed) {

		if (isDisplayed) {
			Assert.assertTrue(contactPage.validateEmailError());
		} else {
			Assert.assertFalse(contactPage.validateEmailError());
		}

	}

	@Then("^I validate the message error is displayed \"([^\"]*)\"$")
	public void validate_message_error(Boolean isDisplayed) {
		if (isDisplayed) {
			Assert.assertTrue(contactPage.validateMessageError());
		} else {
			Assert.assertFalse(contactPage.validateMessageError());

		}

	}

	@Then("^I enter data into field \"([^\"]*)\"$")
	public void enter_valid_data(String field) {
		contactPage.enterDataIntoField(field);
	}

	@Then("^I validate the success message is displayed \"([^\"]*)\"$")
	public void validate_Success_Message(Boolean isDisplayed) {
		if (isDisplayed) {
			Assert.assertTrue(contactPage.validateSuccessMessage());
		} else {
			Assert.assertFalse(contactPage.validateSuccessMessage());

		}
	}
	
	@Then("^I enter incorrect data into email field$")
	public void enter_Invalid_data() {
		contactPage.enterIncorrectDataIntoEmailField();
	}
}
