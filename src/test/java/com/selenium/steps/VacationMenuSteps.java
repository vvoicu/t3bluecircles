package com.selenium.steps;

import com.selenium.pages.VacationMenuPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class VacationMenuSteps extends ScenarioSteps {
	VacationMenuPage vacationMenuPage;
	
	@Step
	public void clickOnMenu(String text1) {
		vacationMenuPage.clickOnMenu(text1);
	}
}
