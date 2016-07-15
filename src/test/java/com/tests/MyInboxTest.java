package com.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.LogInSteps;
import com.selenium.steps.MyInboxSteps;
import com.selenium.steps.NavigationBarSteps;

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
	// public SiteHeaderSteps siteHeaderSteps ;
	@Steps
	public NavigationBarSteps navigationBarSteps;

	String userName = "daniel.nistreanu";
	String password = "test";

	@Test
	public void vacationApprove() {
		loginSteps.openPage();
		loginSteps.writeUsername(userName);
		loginSteps.writePassword(password);
		loginSteps.clickSignIn();
		myInboxSteps.InboxRequestCheckBox();
		myInboxSteps.ApplyButton();

	}
}
