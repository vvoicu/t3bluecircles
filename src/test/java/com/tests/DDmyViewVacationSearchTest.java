package com.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.LogInSteps;
import com.selenium.steps.MyViewVacationSearchSteps;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import net.thucydides.junit.annotations.UseTestDataFrom;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/test/resources/TestViewVacation.csv", separator = ',')

public class DDmyViewVacationSearchTest {

	@Managed(uniqueSession = false)
	public WebDriver webdriver;

	@Steps
	public LogInSteps loginSteps;
	// @Steps
	// public SiteHeaderSteps siteHeaderSteps ;
	@Steps
	MyViewVacationSearchSteps myViewVacationSearchSteps;
	private String userName;
	private String userPassword;
	private String lastName;
	private String firstName;

	@Test
	public void requestWithdraw() {
		loginSteps.openPage();
		loginSteps.writeUsername(userName);
		loginSteps.writePassword(userPassword);
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
