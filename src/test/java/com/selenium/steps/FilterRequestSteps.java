package com.selenium.steps;

import com.selenium.pages.FilterRequestsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class FilterRequestSteps extends ScenarioSteps {
	FilterRequestsPage filterRequestsPage;
	 
	 @Step
	public void clickOnCheckBox(String checkBox){
	filterRequestsPage.clickOnCheckBox(checkBox);
	   }
	 @Step
	    public void apply(){
		filterRequestsPage.apply();
	}
	

}
