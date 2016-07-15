package com.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.FilterRequestSteps;
import com.selenium.steps.LogInSteps;
import com.selenium.steps.NavigationBarSteps;
import com.selenium.steps.VacationMenuSteps;

import junit.framework.TestCase;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import utils.Constants;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = Constants.CSV_PATH + "FilterRequest.csv", separator = Constants.CSV_SEPARATOR)

public class FilterRequestTest extends TestCase {
	@Managed(uniqueSession = false)
	public WebDriver webdriver;
	@Steps
	public LogInSteps loginSteps;
	@Steps
	public VacationMenuSteps vacationMenuSteps;
	@Steps
	public NavigationBarSteps navigationBarSteps;
	@Steps
	public FilterRequestSteps filterRequestSteps;

	String userName = "ioana.craita";
	String password = "test";
	String text = "VACATION";
	String text1 = "My Request";
	String checkBox;
	String checkBox2;
	// String type="ALL";

	@Test
	public void selectTab() {
		loginSteps.openPage();
		loginSteps.writeUsername(userName);
		loginSteps.writePassword(password);
		loginSteps.clickSignIn();
		navigationBarSteps.clickOnTab(text);
		vacationMenuSteps.clickOnMenu(text1);
		filterRequestSteps.clickOnCheckBox(checkBox);
		filterRequestSteps.clickOnCheckBox2(checkBox2);
		filterRequestSteps.apply();
		filterRequestSteps.selectNumber();
		// filterRequestSteps.verifyType(type);

	}
}
