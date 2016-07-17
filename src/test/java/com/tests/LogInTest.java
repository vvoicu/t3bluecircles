package com.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.LogInSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class LogInTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	@Steps
	public LogInSteps loginSteps;
	@Steps
	//public SiteHeaderSteps  siteHeaderSteps ;

    String userName="ioana.craita";
	String password="test";

	@Test
	public void logInTest() {
		loginSteps.openPage();
		loginSteps.writeUsername(userName);
		loginSteps.writePassword(password);
		loginSteps.clickSignIn();     
		//siteHeaderSteps.checkThatUserIsLoggedIn();
		
	}

}

