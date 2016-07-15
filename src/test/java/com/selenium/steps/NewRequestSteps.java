package com.selenium.steps;

import com.selenium.pages.NewVacationRequestPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class NewRequestSteps extends ScenarioSteps{
	
	NewVacationRequestPage newVacationRequestPage;
	
	// @Step
	 //public void selectHolidayRadioButton(){
		// newVacationRequestPage.selectHolidayRadioButton();
	//}
	
	@Step
	public void clickOnMenu(String vacationType, String optionType) {
		newVacationRequestPage.selectVacationType(vacationType,optionType);
	}
	
	@Step
	public void saveRequest(){
		newVacationRequestPage.saveRequest();
	}
	
	@Step
	public void selectVacationType (String vacationType,String optionType){
		newVacationRequestPage.selectVacationType(vacationType,optionType);
	}
	
	@Step
	public void withdrawRequest(){
		newVacationRequestPage.withdrawRequest();
	}
	
	//@Step
    //public void isTheHomePage() {
		//newVacationRequestPage.open();
	//}
	
	
}

	