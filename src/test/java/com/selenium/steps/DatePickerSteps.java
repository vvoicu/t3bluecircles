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
	@Step
	public void clickStartDate(){
	datePickerPage.clickStartDate();
	}
	@Step
	public void clickEndDate(){
	datePickerPage.clickEndDate();
	}
	
	@StepGroup
  public void selectStartDate(String year, String month, String day){
		selectYear(year);
		selectMonth(month);
		selectDay(day);
		
	}
	@StepGroup
	  public void selectEndDate(String endYear, String endMonth, String endDay){
			selectYear(endYear);
			selectMonth(endMonth);
			selectDay(endDay);
			
}
}
