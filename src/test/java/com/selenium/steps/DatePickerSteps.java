package com.selenium.steps;

import com.selenium.pages.DatePickerPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class DatePickerSteps extends ScenarioSteps {
	
	DatePickerPage datePickerPage;
	
	@Step
	public void selectYear(String year){
		datePickerPage.selectYear(year);
	}
	
	@Step
	public void selectMonth(String month){
		datePickerPage.selectMonth(month);
	}
	@Step
	public void selectDay(String day){
		datePickerPage.selectDay(day);
	}
	
	@StepGroup
  public void selectDate(String year, String month, String day){
		selectYear(year);
		selectMonth(month);
		selectDay(day);
		
	}
}
