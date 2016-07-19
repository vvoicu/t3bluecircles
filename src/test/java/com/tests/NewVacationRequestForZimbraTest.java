package com.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.DatePickerSteps;
import com.selenium.steps.LogInSteps;
import com.selenium.steps.MyRequestsSteps;
import com.selenium.steps.NewVacationRequestForZimbraSteps;
import com.selenium.steps.NavigationBarSteps;
import com.selenium.steps.VacationMenuSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class NewVacationRequestForZimbraTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	@Steps
	public LogInSteps loginSteps;
	@Steps
	public VacationMenuSteps vacationMenuSteps;
	@Steps
	public NavigationBarSteps navigationBarSteps;
	@Steps
	public DatePickerSteps datePickerSteps;
	@Steps
	public NewVacationRequestForZimbraSteps myNewVacationRequestForZimbraSteps;

	// EvoPortal Data.
	String userName = "daniel.nistreanu";
	String password = "test";
	String text = "VACATION";
	String text1 = "New Vacation Request";
	String year = "2016";
	String month = "Aug";
	String day = "22";
	String endYear = "2016";
	String endMonth = "Aug";
	String endDay = "24";

	@Test
	public void selectTab() {
		loginSteps.openPage();
		loginSteps.writeUsername(userName);
		loginSteps.writePassword(password);
		loginSteps.clickSignIn();
		navigationBarSteps.clickOnTab(text);
		vacationMenuSteps.clickOnMenu(text1);
		datePickerSteps.clickStartDate();
		datePickerSteps.selectStartDate(year, month, day);
		datePickerSteps.clickEndDate();
		datePickerSteps.selectEndDate(endYear, endMonth, endDay);
		myNewVacationRequestForZimbraSteps.clickSaveButton();

	}
}
