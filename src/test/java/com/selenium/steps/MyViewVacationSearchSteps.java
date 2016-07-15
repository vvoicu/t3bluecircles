package com.selenium.steps;

import com.selenium.pages.MyViewVacationSearchPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MyViewVacationSearchSteps extends ScenarioSteps {

	MyViewVacationSearchPage searchSteps;

	@Step
	public void goToViewVacations() {
		searchSteps.goToViewVacations();
	}

	@Step
	public void clickHolidayCheckBox(){
		searchSteps.clickHolidayCheckBox();
	}

	@Step
	public void clickDaysNumberCheckBox() {
		searchSteps.clickDaysNumberCheckBox();
	}

	@Step
	public void clickVacationStatusCheckBox() {
		searchSteps.clickVacationStatusCheckBox();
	}

	@Step
	public void inputLastName(String inputLastName) {
		searchSteps.lastName(inputLastName);
	}

	@Step
	public void inputFirstName(String inputFirstName) {
		searchSteps.firstName(inputFirstName);

	}

	@Step
	public void myApplyButton() {
		searchSteps.clickApplyButton();
	}
}
