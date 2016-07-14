package com.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.LogInSteps;
import com.selenium.steps.MyRequestsSteps;

import net.serenitybdd.junit.runners.SerenityRunner;


import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class MyRequestsTest {

	@Managed(uniqueSession = true)
	
	public WebDriver webdriver;
	@Steps
	public LogInSteps loginSteps;
	@Steps
	public MyRequestsSteps myRequestsSteps;
	//public SiteHeaderSteps  siteHeaderSteps ;

    String userName="ioana.craita";
	String password="test";

	@Test
	public void vacationStatus() {
		loginSteps.page();
		loginSteps.writeUsername(userName);
		loginSteps.writePassword(password);
		loginSteps.clickSignIn(); 
		myRequestsSteps.grabTextVacationStatus();
		myRequestsSteps.grabTextDaysNumber();
		myRequestsSteps.grabTextVacationType();
		
		/*
		myRequestsSteps.verifyLabelExists("Days Number");
		myRequestsSteps.verifyLabelExists("Vacation Type");
		myRequestsSteps.verifyLabelExists("Vacation Status");
		myRequestsSteps.verifyLabelExists("somesoma");
		*/
		
		
	
		/*
	@Test
	public void daysNumber(){
		loginSteps.page();
		loginSteps.writeUsername(userName);
		loginSteps.writePassword(password);
		loginSteps.clickSignIn(); 
		myRequestsSteps.grabText();
	}
		
//		WebElement element = getDriver().findElement(By.name("Vacation Title"));
//		//siteHeaderSteps.checkThatUserIsLoggedIn();
//		
 * 
 */
	}

}

