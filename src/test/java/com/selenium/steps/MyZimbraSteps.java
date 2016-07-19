package com.selenium.steps;

import com.selenium.pages.MyZimbraPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class MyZimbraSteps extends ScenarioSteps {
	
	MyZimbraPage myZimbraPage;
	
	@Step
	public void selectYear(String year){
		myZimbraPage.selectYear(year);
	}
	
	@Step
	public void selectMonth(String month){
		myZimbraPage.selectMonth(month);
	}
	@Step
	public void selectDay(String day){
		myZimbraPage.selectDay(day);
	}
	@Step
	public void clickStartDate(){
		myZimbraPage.clickStartDate();
	}
	@Step
	public void clickEndDate(){
		myZimbraPage.clickEndDate();
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
	@Step
	public void clickSaveButton(){
		myZimbraPage.clickSaveButton();
	}
}
