package com.selenium.steps;

import com.selenium.pages.MyRequestsWithdrawPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MyRequestsWithdrawSteps extends ScenarioSteps {
	MyRequestsWithdrawPage withdrawPage;

	@Step
	public void goToInboxTab() {
		withdrawPage.goToInboxTab();
	}

	@Step
	public void clickDropList(String itemsPerPage) {
		withdrawPage.clickDropList(itemsPerPage);
	}

	@Step
	public void vacationStatusNameClick(String vacationStatusName) {
		withdrawPage.requestsField(vacationStatusName);
	}

	@Step
	public void clickOnWithdrawButton() {
		withdrawPage.clickOnWithdrawButton();
	}

}
