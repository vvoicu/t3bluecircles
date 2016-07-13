package com.selenium.steps;



import com.selenium.pages.LoginPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LogInSteps extends ScenarioSteps{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	LoginPage loginPage;
	 
	@Step
	    public void writeUsername(String userName) {
		loginPage.inputUsername(userName);
	        
	    }
	
	@Step
	     public void writePassword(String password){
		loginPage.inputPassword(password);
	}
	
	@Step
	     public void clickSignIn(){
		loginPage.clickSignIn();
	}
	
	@Step
    public void page() {
        loginPage.open();
    }
}

