package com.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.LogInSteps;
import com.selenium.steps.NewRequestSteps;

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
	public NewRequestSteps newRequestSteps;
		
	String userName="monica.popovici";
	String password="test";
	
	
	@Test
	public void createNewRequest() {
		loginSteps.page();
		loginSteps.writeUsername(userName);
		loginSteps.writePassword(password);
		loginSteps.clickSignIn(); 
		newRequestSteps.is_the_home_page();
		newRequestSteps.save_request();
		
	}

}
