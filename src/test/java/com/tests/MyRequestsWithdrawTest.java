package com.tests;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.LogInSteps;
import com.selenium.steps.MyRequestsWithdrawSteps;
import com.selenium.steps.NavigationBarSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class MyRequestsWithdrawTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	@Steps
	public LogInSteps loginSteps;
	@Steps
	public NavigationBarSteps navigationBarSteps;
	@Steps
	public MyRequestsWithdrawSteps myRequestsWithdrawSteps;

	String userName = "ioana.craita";
	String password = "test";
	String text = "VACATION";
	String vacationStatusName = "Pending";
	String itemsPerPage = "5";

	@Test
	public void requestsSheet() {
		loginSteps.page();
		loginSteps.writeUsername(userName);
		loginSteps.writePassword(password);
		loginSteps.clickSignIn();
		myRequestsWithdrawSteps.goToInboxTab();
		myRequestsWithdrawSteps.clickDropList(itemsPerPage);
		myRequestsWithdrawSteps.vacationStatusNameClick(vacationStatusName);
		myRequestsWithdrawSteps.clickOnWithdrawButton();

	}
}