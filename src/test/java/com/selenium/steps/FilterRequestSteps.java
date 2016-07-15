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
		public void clickOnCheckBox2(String checkBox2){
		filterRequestsPage.clickOnCheckBox2(checkBox2);
		   }
	 @Step
	    public void apply(){
		filterRequestsPage.apply();
	 }
	
	 @Step
	    public void verifyType(String type){
		filterRequestsPage.verifyType(type);
	}
	 @Step
	    public void selectNumber(){
		filterRequestsPage.selectNumber();
	 }

}
