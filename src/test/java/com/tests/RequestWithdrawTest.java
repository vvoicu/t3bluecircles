package com.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.pages.MyRequestsPage;
import com.selenium.steps.LogInSteps;
import com.selenium.steps.MyRequestsSteps;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;

@UseTestDataFrom(value = "src/test/resources/requestWidhdrawTest.csv", separator = ',')
@RunWith(SerenityParameterizedRunner.class)
public class RequestWithdrawTest {

	@Managed(uniqueSession = false)
	public WebDriver webdriver;
	@Steps
	public LogInSteps loginSteps;
	// @Steps
	// public SiteHeaderSteps siteHeaderSteps ;
	@Steps
	MyRequestsSteps myRequestsSteps;

	String userName;
	String userPassword;
	String startDate;
	String endDate;
	String daysNumber;
	String type;
	String lastUpdatedBy;
	String pending;
	
	@Test
	public void requestWithdraw() {
		loginSteps.openPage();
		loginSteps.writeUsername(userName);
		loginSteps.writePassword(userPassword);
		loginSteps.clickSignIn();

		webdriver.get(
				"http://172.22.4.88:9090/vacation?p_p_auth=gn0bFJny&p_p_id=evovacation_WAR_EvoVacationportlet&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_evovacation_WAR_EvoVacationportlet_backURL=%2Fvacation%3Fp_p_auth%3Dgn0bFJny%26p_p_id%3Devovacation_WAR_EvoVacationportlet%26p_p_lifecycle%3D0%26_evovacation_WAR_EvoVacationportlet_menuItem%3Dmy-requests%26_evovacation_WAR_EvoVacationportlet_myRequestState%3Dview-vacation%26_evovacation_WAR_EvoVacationportlet_backMenuItem%3Dnew-request%26_evovacation_WAR_EvoVacationportlet_vacationId%3D27927&_evovacation_WAR_EvoVacationportlet_menuItem=my-requests");
		myRequestsSteps.clickOnAVacationRequestStatusCollumn(startDate, endDate, daysNumber, type, lastUpdatedBy,
				pending);
		myRequestsSteps.clickWithdrawButton();
		// myRequestsSteps.checkWithdrawStatus();

	}

}
