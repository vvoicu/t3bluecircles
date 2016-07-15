
package com.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.DatePickerSteps;
import com.selenium.steps.LogInSteps;
import com.selenium.steps.NavigationBarSteps;
import com.selenium.steps.NewRequestSteps;
import com.selenium.steps.VacationMenuSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)

public class NewRequestTest {
	
	@Managed(uniqueSession = true)
    public WebDriver webdriver;
	@Steps
	public LogInSteps loginSteps;
	@Steps
	public VacationMenuSteps vacationMenuSteps;
	@Steps
	public NewRequestSteps newRequestSteps;
	@Steps
	public NavigationBarSteps navigationBarSteps;
	@Steps
	public DatePickerSteps datePickerSteps;
		
	String userName="ioana.craita";
	String password="test";
	String text = "VACATION";
	String text1 = "New Vacation Request";
	String year ="2016";
    String month="Aug";
    String day="16";
    String endYear="2016";
    String endMonth="Aug";
    String endDay="22";
	String vacationType = "Sick leave";
	String optionType = "Concediu Ingrijire Copil";
	
	
	@Test
	public void createNewRequest() {
		loginSteps.openPage();
		loginSteps.writeUsername(userName);
		loginSteps.writePassword(password);
		loginSteps.clickSignIn(); 
		//newRequestSteps.isTheHomePage();
		navigationBarSteps.clickOnTab(text);
		vacationMenuSteps.clickOnMenu(text1);
		datePickerSteps.clickStartDate();
		datePickerSteps.selectStartDate(year, month, day);
		datePickerSteps.clickEndDate();
		datePickerSteps.selectEndDate(endYear ,endMonth ,endDay);
		newRequestSteps.selectVacationType(vacationType,optionType);
		newRequestSteps.saveRequest();
		
	}

}
