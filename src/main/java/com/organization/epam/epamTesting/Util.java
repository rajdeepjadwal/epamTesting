package com.organization.epam.epamTesting;



import static org.hamcrest.MatcherAssert.assertThat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Util {
	static DataHandleClass dataHandle;
	public static String getXpath(String className, String key) throws IOException {	
		FileInputStream fs = null;
		String xpath=null;
		String finalClassName=className+".properties";
		
		File file=new File("src/main/resources/"+finalClassName+"");
		try {
		 fs=new FileInputStream(file);
		}
		catch(FileNotFoundException e) {
			assertThat(e.toString(),false);
		}
		Properties pro=new Properties();
		pro.load(fs);
		xpath=pro.getProperty(key);
		return xpath;
		
	}
	
	public static void selectDropDown(WebElement selectEle,String value) {
		Select sle=new Select(selectEle);
		sle.selectByValue(value);
	}
	
	public static void waitForElementClickable(WebDriver driver,By xpath) {
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(xpath));
		
	}
	
	public static void waitForElementVisible(WebDriver driver,By xpath) {
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
		
	}
	
	//read json file
	public static void jsonToPojo() throws JsonParseException, JsonMappingException, IOException {
		
		String file=System.getProperty("user.dir")+"\\src\\main\\resources\\data.json";
		File jsonFile=new File(file);			
		ObjectMapper mapper = new ObjectMapper();	
		dataHandle=mapper.readValue(jsonFile, DataHandleClass.class);	
	System.out.println(Util.dataHandle.getPune());	
	}
}
