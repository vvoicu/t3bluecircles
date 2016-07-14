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
	public void save_request(){
		newVacationRequestPage.save_request();
	}
	
	//@Step
    //public void is_the_home_page() {
		//newVacationRequestPage.open();
	//}
}
