package com.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.LogInSteps;
import com.selenium.steps.MyInboxSteps;
import com.selenium.steps.MyRequestsSteps;

import net.serenitybdd.junit.runners.SerenityRunner;


import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class MyInboxTest {

	@Managed(uniqueSession = true)
	
	public WebDriver webdriver;
	@Steps
	public LogInSteps loginSteps;
	@Steps
	public MyInboxSteps myInboxSteps;
	//public SiteHeaderSteps  siteHeaderSteps ;

    String userName="daniel.nistreanu";
	String password="test";

	@Test
	public void vacationApprove() {
		loginSteps.page();
		loginSteps.writeUsername(userName);
		loginSteps.writePassword(password);
		loginSteps.clickSignIn(); 
		myInboxSteps.InboxRequestCheckBox();
		myInboxSteps.ApplyButton();
		
}
}