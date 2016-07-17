package com.selenium.steps;

import com.selenium.pages.YahooSignInPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class YahooSignInSteps extends ScenarioSteps {
	private static final long serialVersionUID = 1L;
	YahooSignInPage yahooSignInPage;
	
	@Step
	public void clickLanguageButton(){
		yahooSignInPage.clickLanguageButton();
	}
	
	@Step
	public void clickUsLanguage(){
		yahooSignInPage.clickUsLanguage();
	}
	
	@Step
	public void clickHomePageSignInButton() {
		yahooSignInPage.clickHomePageSignInButton();
	}

	@Step
	public void inputUserName(String userName) {
		yahooSignInPage.inputUserName(userName);
	}
	
	@Step
	public void clickNextButton(){
		yahooSignInPage.clickNextButton();
	}
	
	@Step
	public void inputUserPassword(String userPassword){
		yahooSignInPage.inputUserPassword(userPassword);
	}

	@Step
	public void clickSignInButton(){
		waitABit(2000);
		yahooSignInPage.clickSignInButton();
	}

	public void openPage() {
		getDriver().manage().window().maximize();
		yahooSignInPage.open();	
	}
		
}
