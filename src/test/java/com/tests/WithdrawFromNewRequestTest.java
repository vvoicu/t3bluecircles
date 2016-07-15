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

public class WithdrawFromNewRequestTest {
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
		
	String userName="ioana.craita";
	String password="test";
	String text = "VACATION";
	String text1 = "New Vacation Request";
	String vacationType = "Maternity Leave";
	String optionType = "Concediu Ingrijire Copil";
	
	
	@Test
	public void withdrawNewRequest() {
		loginSteps.openPage();
		loginSteps.writeUsername(userName);
		loginSteps.writePassword(password);
		loginSteps.clickSignIn(); 
		navigationBarSteps.clickOnTab(text);
		vacationMenuSteps.clickOnMenu(text1);
		newRequestSteps.selectVacationType(vacationType,optionType);
		newRequestSteps.saveRequest();
		newRequestSteps.withdrawRequest();
		
	}

}



