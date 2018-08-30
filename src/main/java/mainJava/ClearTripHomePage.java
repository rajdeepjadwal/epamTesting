package mainJava;



import java.io.IOException;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ClearTripHomePage extends PageObject{
	DataHandleClass dataHandle;
	
public void selectMultipleCityRadioBtn() throws IOException {
	try {
	WebDriver driver=getDriver();	
	WebElement ele=driver.findElement(By.xpath(Util.getXpath(getClass().getSimpleName(), "MultiCityRadioBtn")));
	ele.click();
	}
	catch(Exception e){
		assertThat("selectMultipleCityRadioBtn",false);
	}
	}

public void enterValueInFromAndToTextBoxes(String FromTo) throws IOException {
	WebElement ele;
	String selectValue;
	try {
	WebDriver driver=getDriver();	
	Actions action=new Actions(driver);
	Util util = null;
	util.jsonToPojo();
	switch (FromTo){
	case "From1" :
		ele=driver.findElement(By.xpath(Util.getXpath(getClass().getSimpleName(), "From1CityTextBox")));
		ele.clear();
		selectValue=Util.dataHandle.getPune();
		action.moveToElement(ele).sendKeys(selectValue).click().build().perform();
		//selectCityFromDisplayed(selectValue);
		break;
	case "To1" :
		ele=driver.findElement(By.xpath(Util.getXpath(getClass().getSimpleName(), "To1CityTextBox")));
		ele.clear();
		selectValue=Util.dataHandle.getBlr();
		System.out.println("Blr--"+dataHandle.getBlr());
		ele.sendKeys(selectValue);
		selectCityFromDisplayed(selectValue);
		selectDateFromCalendarOption(FromTo);
		
		//select date
		break;
	case "From2" :
		ele=driver.findElement(By.xpath(Util.getXpath(getClass().getSimpleName(), "From2CityTextBox")));
		action.moveToElement(ele).click().build().perform();
		break;
	case "To2" :
		ele=driver.findElement(By.xpath(Util.getXpath(getClass().getSimpleName(), "To2CityTextBox")));
		ele.clear();
		selectValue=Util.dataHandle.getDelhi();
		action.moveToElement(ele).sendKeys(selectValue).click().build().perform();
		selectCityFromDisplayed(selectValue);
		selectDateFromCalendarOption(FromTo);
		break;
	case "From3" :
		ele=driver.findElement(By.xpath(Util.getXpath(getClass().getSimpleName(), "From3CityTextBox")));
		action.moveToElement(ele).click().build().perform();
		break;
	case "To3" :
		ele=driver.findElement(By.xpath(Util.getXpath(getClass().getSimpleName(), "To3CityTextBox")));
		ele.clear();
		selectValue=Util.dataHandle.getPhuket();
		action.moveToElement(ele).sendKeys(selectValue).click().build().perform();
		selectCityFromDisplayed(selectValue);
		selectDateFromCalendarOption(FromTo);
		break;		
	
}
	
	}
	catch(Exception e){
		assertThat("enterValueInFromAndToTextBoxes -"+e.toString(),false);
	}
	}

public void selectCityFromDisplayed(String name) {
	WebDriver driver=getDriver();
	String selFromTo;
	Actions action=new Actions(driver);
	WebElement eleFromTo;
	try {
		Thread.sleep(5000);	 
	 selFromTo=Util.getXpath(getClass().getSimpleName(), "SelectCityFromTextBox").replaceAll("variable", name);	
	 Util.waitForElementVisible(driver, By.xpath(selFromTo));
	 eleFromTo=driver.findElement(By.xpath(selFromTo));
	 action.moveToElement(eleFromTo).click().build().perform();
	 }
	catch(Exception e) {
		assertThat("selectCityFromDisplayed()"+e.toString(),false);
	}
	
}

public void selectDateFromCalendarOption(String toNum) throws IOException {
	WebElementFacade ele;
	String xpath=null;
	WebDriver driver=getDriver();
	String calIconXpath;
	WebElement calIconEle;
	try {		
	switch(toNum) {
	case "To1":
		xpath=Util.getXpath(getClass().getSimpleName(),"TodayDateFromCal");
		Util.waitForElementVisible(driver, By.xpath(xpath));
		ele=$(xpath);
		ele.click();
		break;
		
	case "To2" :
		xpath=Util.getXpath(getClass().getSimpleName(),"TodayDateFromCal");
		calIconXpath=Util.getXpath(getClass().getSimpleName(),"From2To2CalendarIcon");
		calIconEle=driver.findElement(By.xpath(calIconXpath));
		calIconEle.click();
		calIconEle.click();
		Util.waitForElementVisible(driver, By.xpath(xpath));
		ele=$(xpath);
		ele.click();
		break;
		
	case "To3":
		xpath=Util.getXpath(getClass().getSimpleName(),"TodayDateFromCal");
		calIconXpath=Util.getXpath(getClass().getSimpleName(),"From3To3CalendarIcon");
		calIconEle=driver.findElement(By.xpath(calIconXpath));
		calIconEle.click();
		calIconEle.click();
		Util.waitForElementVisible(driver, By.xpath(xpath));		
		ele=$(xpath);
		ele.click();
		break;
	}			
	}
	catch(Exception e){
		assertThat("selectDateFromCalendarOption"+e.toString(),false);
	}
	}


public void selectAdultFromDropDown() throws IOException {
	WebDriver driver=getDriver();
	WebElement ele;
	try {	
	String xpath=Util.getXpath(getClass().getSimpleName(), "SelectTagAdultFromDropDown");
	ele=driver.findElement(By.xpath(xpath));
	Util.selectDropDown(ele, "4");
	
	}
	catch(Exception e){
		assertThat("selectAdultFromDropDown",false);
	}
	}
	

public void selectClassOfTravelFromDropDown() throws IOException {
	WebDriver driver=getDriver();
	WebElement ele;
	try {	
	String xpath=Util.getXpath(getClass().getSimpleName(), "SelectClassOfTravel");
	ele=driver.findElement(By.xpath(xpath));
	Util.selectDropDown(ele, Util.dataHandle.getClassFlight());
	}
	catch(Exception e){
		assertThat("selectAdultFromDropDown",false);
	}
	}
	

public void clickOnSearchFlightBtn() throws IOException {
	WebDriver driver=getDriver();
	WebElementFacade ele;
	try {	
	String xpath=Util.getXpath(getClass().getSimpleName(), "ButtonSearchFlight");
	ele=$(xpath);
	ele.click();
	
	}
	catch(Exception e){
		assertThat("clickOnSearchFlightBtn",false);
	}
	}
	
	
	
}
