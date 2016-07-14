
package com.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.LogInSteps;
import com.selenium.steps.NavigationBarSteps;
import com.selenium.steps.NewRequestSteps;
import com.selenium.steps.VacationMenuSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)

public class NewRequestTest {
	
	@Managed(uniqueSession = true)
    public WebDriver webdriver;
	@Steps
	public LogInSteps loginSteps;
	@Steps
	public VacationMenuSteps vacationMenuSteps;
	@Steps
	public NewRequestSteps newRequestSteps;
	@Steps
	public NavigationBarSteps navigationBarSteps;
		
	String userName="monica.popovici";
	String password="test";
	String text = "VACATION";
	String text1 = "New Vacation Request";
	String type = "Vacation without payment";
	String optionType = "Concediu Ingrijire Copil";
	
	
	@Test
	public void createNewRequest() {
		loginSteps.page();
		loginSteps.writeUsername(userName);
		loginSteps.writePassword(password);
		loginSteps.clickSignIn(); 
		//newRequestSteps.isTheHomePage();
		navigationBarSteps.clickOnTab(text);
		vacationMenuSteps.clickOnMenu(text1);
		newRequestSteps.selectVacationType(type,optionType);
		newRequestSteps.saveRequest();
		
	}

}
