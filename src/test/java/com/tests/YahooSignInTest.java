package com.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.YahooSignInSteps;

import junit.framework.TestCase;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class YahooSignInTest extends TestCase {
	@Steps
	private YahooSignInSteps yahooSignInSteps;

	@Managed(uniqueSession = true)
	public WebDriver driver;
	
	private String userNameLocal = "testmailevozon@yahoo.com";
	private String userPasswordLocal = "testpassword";

	@Test
	public void SignInTest() {
		yahooSignInSteps.openPage();
		yahooSignInSteps.clickLanguageButton();
		yahooSignInSteps.clickUsLanguage();
		yahooSignInSteps.clickHomePageSignInButton();
		yahooSignInSteps.inputUserName(userNameLocal);
		System.out.println(userNameLocal);
		yahooSignInSteps.clickNextButton();
		yahooSignInSteps.inputUserPassword(userPasswordLocal);
		System.out.println(userPasswordLocal);
		yahooSignInSteps.clickSignInButton();
		
		
		
	}
	

}
