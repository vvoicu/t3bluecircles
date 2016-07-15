package com.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.LogInSteps;
import com.selenium.steps.MyViewVacationSearchSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class MyViewVacationSearchTest {
	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	@Steps
	public LogInSteps loginSteps;
//	@Steps
	//public SiteHeaderSteps  siteHeaderSteps ;
	@Steps
	MyViewVacationSearchSteps myViewVacationSearchSteps;

    String userName="gabi.kis";
	String password="test";
	String lastName = "Craita";
	String firstName = "Ioana";


	@Test
	public void requestWithdraw() {
		loginSteps.openPage();
		loginSteps.writeUsername(userName);
		loginSteps.writePassword(password);
		loginSteps.clickSignIn();  
		myViewVacationSearchSteps.goToViewVacations();
		myViewVacationSearchSteps.clickHolidayCheckBox();
		myViewVacationSearchSteps.clickDaysNumberCheckBox();
		myViewVacationSearchSteps.clickVacationStatusCheckBox();
		myViewVacationSearchSteps.inputLastName(lastName);
		myViewVacationSearchSteps.inputFirstName(firstName);
		myViewVacationSearchSteps.myApplyButton();
		
		
}
}
