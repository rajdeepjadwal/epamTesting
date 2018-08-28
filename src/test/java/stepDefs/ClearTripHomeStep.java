package stepDefs;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.organization.epam.epamTesting.ClearTripHomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ClearTripHomeStep  {

	ClearTripHomePage clearTrpHomepage;
	

	
	@Given("^user navigate to clear trip URL$")
	public void openURL() {
		clearTrpHomepage.open();
	}
	
	
	@When("^user select multi-city radio button on clear trip home page$")
	public void selectMultipleCityRadioBtn() throws IOException {
		clearTrpHomepage.selectMultipleCityRadioBtn();
	}
	
	@When("^user enter value in \"([^\"]*)\" text box$")
	public void enterValueInFromAndToTextBoxes(String text) throws IOException {
		clearTrpHomepage.enterValueInFromAndToTextBoxes(text);
	}

	@When("^user select date from  \"([^\"]*)\" depart on calendar option$")
	public void selectDateFromCalendarOption(String num) throws IOException {
		clearTrpHomepage.selectDateFromCalendarOption(num);
	}
	
	
	@When("^user select adults from drop down$")
	public void selectAdultFromDropDown() throws IOException {
		clearTrpHomepage.selectAdultFromDropDown();
	}

	@When("^user select class of travel from drop down$")
	public void selectClassOfTravelFromDropDown() throws IOException {
		clearTrpHomepage.selectClassOfTravelFromDropDown();
	}
	@When("^user click on search flight button$")
	public void clickOnSearchFlightBtn() throws IOException {
		clearTrpHomepage.clickOnSearchFlightBtn();
	}	
}
