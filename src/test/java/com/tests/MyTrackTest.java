package com.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.LogInSteps;
import com.selenium.steps.NavigationBarSteps;

import junit.framework.TestCase;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class MyTrackTest extends TestCase {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	@Steps
	public LogInSteps loginSteps;
	public NavigationBarSteps navigationBarSteps;

	String userName = "daniel.nistreanu";
	String password = "test";
	String text = "VACATION";

	@Test
	public void trackPageTest() {

		loginSteps.openPage();
		loginSteps.writeUsername(userName);
		loginSteps.writePassword(password);
		loginSteps.clickSignIn();
		navigationBarSteps.clickOnTab(text);
		

	}

}
