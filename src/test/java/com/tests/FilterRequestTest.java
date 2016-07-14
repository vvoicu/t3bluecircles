package com.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.FilterRequestSteps;
import com.selenium.steps.LogInSteps;
import com.selenium.steps.NavigationBarSteps;
import com.selenium.steps.VacationMenuSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
@RunWith(SerenityRunner.class)

public class FilterRequestTest {
	@Managed(uniqueSession = true)
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
	String checkBox= "Sick Leave";

	@Test
	public void selectTab() {
		loginSteps.page();
		loginSteps.writeUsername(userName);
		loginSteps.writePassword(password);
		loginSteps.clickSignIn();
		navigationBarSteps.clickOnTab(text);
		vacationMenuSteps.clickOnMenu(text1);
		filterRequestSteps.clickOnCheckBox(checkBox);
		filterRequestSteps.apply();

	}
}
