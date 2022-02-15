package StepDefinitions;

import java.io.IOException;

import Pages.DriverFactory;
import Pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageStepDefinition {

	HomePage homepage = new HomePage();

	@Given("^I am on Jupiter Home Page$")
	public void navigate_To_Login_Page() {
		try {
			DriverFactory.initialization();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Given("^I navigate to \"([^\"]*)\" page from the navigation bar$")
	public void navigate_To_Other_Page_From_Navigation_Bar(String Option) {
		homepage.ClickOnOptionInNavigationBar(Option);
	}

	@Then("^I close the browser$")
	public void Close_The_Broswer() {
		homepage.CloseBroswer();
	}
}
