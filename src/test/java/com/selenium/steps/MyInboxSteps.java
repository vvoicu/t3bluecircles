package com.selenium.steps;



import com.selenium.pages.MyInboxPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MyInboxSteps extends ScenarioSteps {

	MyInboxPage inboxPage;

	@Step
	public void InboxRequestCheckBox() {
		inboxPage.InboxRequestCheckBox();

	}

	@Step
	public void ApplyButton() {
		inboxPage.ApplyButton();
	}

}