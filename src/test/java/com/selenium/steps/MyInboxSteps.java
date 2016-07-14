package com.selenium.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import javax.validation.constraints.AssertTrue;

import com.selenium.pages.LoginPage;
import com.selenium.pages.MyInboxPage;
import com.selenium.pages.MyRequestsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MyInboxSteps extends ScenarioSteps {

	MyInboxPage inboxPage;
	
	
	@Step
    public void InboxRequestCheckBox() {
		inboxPage.InboxRequestCheckBox();
        
    }

	@Step
     public void ApplyButton(){
		inboxPage.ApplyButton();
}



	
	
	
	
	
	
}