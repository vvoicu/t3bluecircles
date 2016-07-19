package com.selenium.steps;

import com.selenium.pages.MyTrackPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MyTrackSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	MyTrackPage trackPage;

	@Step
	public void myTrackPage() {
		trackPage.myTrackPage();
	}

	@Step
	public void clickStartDate() {
		trackPage.clickStartDate();
	}

	@Step
	public void clickYear() {
		trackPage.clickYear();
	}

	@Step
	public void selectYear(String year) {
		trackPage.selectYear(year);
	}

	@Step
	public void selectMonth(String month) {
		trackPage.selectMonth(month);
	}

	@Step
	public void selectDay(String day) {
		trackPage.selectDay(day);
	}

	@Step
	public void myBuildingsField() {
		trackPage.myBuildingsField();
	}

	@Step
	public void myDepartmentsField() {
		trackPage.myDepartmentsField();
	}
}
