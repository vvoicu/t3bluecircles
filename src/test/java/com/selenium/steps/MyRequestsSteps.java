package com.selenium.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import javax.validation.constraints.AssertTrue;

import org.openqa.selenium.WebElement;

import com.selenium.pages.LoginPage;
import com.selenium.pages.MyRequestsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MyRequestsSteps extends ScenarioSteps {

	MyRequestsPage requestsPage;
	private String keyword = "Vacation Title";

//	@Step
//	    public void vacationType(String keyword) {
//		requestsPage.vacationType(keyword);
//		assertThat(myVacationTitle.getDefinitions(), hasItem(containsString(keyword)));
//		
//	
//	    }
	/*
	@Step
	public void verifyLabelExists(String label){
		requestsPage.verifyColumnTitleExists(label);
	}
	*/
	@Step
	public Integer getNumberOfPages(){
		return requestsPage.getNumberOfPages();
	}
	@Step
	public WebElement getVacationRequest(String... details){
		return requestsPage.getVacationRequest(details);
	}
	
	@Step
	public void clickOnAVacationRequestStatusCollumn(String... details){
		requestsPage.clickOnAVacationRequestStatusCollumn(details);
	}
	
	@Step
	public void grabTextVacationStatus(){
		requestsPage.grabTextVacationStatus();
	}
	
	@Step
	public void grabTextDaysNumber(){
		requestsPage.grabTextDaysNumber();
	}
	
	@Step
	public void grabTextVacationType(){
		requestsPage.grabTextVacationType();
	}
	
	@Step
	public void clickWithdrawButton(){
		requestsPage.clickWithdrawButton();
	}
	
}
