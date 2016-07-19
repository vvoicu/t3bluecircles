package com.selenium.steps;

import com.selenium.pages.NewVacationRequestForZimbraPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class NewVacationRequestForZimbraSteps extends ScenarioSteps {

	NewVacationRequestForZimbraPage myVacationPageForZimbra;

	@Step
	public void selectYear(String year) {
		myVacationPageForZimbra.selectYear(year);
	}

	@Step
	public void selectMonth(String month) {
		myVacationPageForZimbra.selectMonth(month);
	}

	@Step
	public void selectDay(String day) {
		myVacationPageForZimbra.selectDay(day);
	}

	@Step
	public void clickStartDate() {
		myVacationPageForZimbra.clickStartDate();
	}

	@Step
	public void clickEndDate() {
		myVacationPageForZimbra.clickEndDate();
	}

	@StepGroup
	public void selectStartDate(String year, String month, String day) {
		selectYear(year);
		selectMonth(month);
		selectDay(day);

	}

	@StepGroup
	public void selectEndDate(String endYear, String endMonth, String endDay) {
		selectYear(endYear);
		selectMonth(endMonth);
		selectDay(endDay);

	}

	@Step
	public void clickSaveButton() {
		myVacationPageForZimbra.clickSaveButton();
	}

}
