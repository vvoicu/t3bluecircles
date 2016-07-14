package com.selenium.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import net.thucydides.core.pages.PageObject;

public class MyRequestsWithdrawPage extends PageObject {

	@FindBy(css = "div[class='lfr-search-container']")
	private WebElementFacade myRequestsField;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_evozonVacationsSearchContainerPageIteratorBottom_itemsPerPage")
	private WebElementFacade myDropList;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_withdrawnVacationRequest")
	private WebElementFacade myWithdraw;

	public void goToInboxTab() {
		getDriver().get(
				"http://172.22.4.88:9090/vacation?p_p_auth=u2rZK0ot&p_p_id=evovacation_WAR_EvoVacationportlet&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_evovacation_WAR_EvoVacationportlet_backURL=%2Fvacation%3Fp_p_auth%3Du2rZK0ot%26p_p_id%3Devovacation_WAR_EvoVacationportlet%26p_p_lifecycle%3D0%26p_p_state%3Dnormal%26p_p_mode%3Dview%26p_p_col_id%3Dcolumn-1%26p_p_col_count%3D1%26_evovacation_WAR_EvoVacationportlet_backURL%3D%252Fvacation%253Fp_p_auth%253Du2rZK0ot%2526p_p_id%253Devovacation_WAR_EvoVacationportlet%2526p_p_lifecycle%253D0%2526p_p_state%253Dnormal%2526p_p_mode%253Dview%2526p_p_col_id%253Dcolumn-1%2526p_p_col_count%253D1%2526_evovacation_WAR_EvoVacationportlet_backURL%253D%25252Fvacation%25253Fp_p_auth%25253Du2rZK0ot%252526p_p_id%25253Devovacation_WAR_EvoVacationportlet%252526p_p_lifecycle%25253D0%252526_evovacation_WAR_EvoVacationportlet_menuItem%25253Dmy-requests%252526_evovacation_WAR_EvoVacationportlet_myRequestState%25253Dview-vacation%252526_evovacation_WAR_EvoVacationportlet_backMenuItem%25253Dnew-request%252526_evovacation_WAR_EvoVacationportlet_vacationId%25253D27934%2526_evovacation_WAR_EvoVacationportlet_menuItem%253Dmy-requests%26_evovacation_WAR_EvoVacationportlet_menuItem%3Dmy-requests&_evovacation_WAR_EvoVacationportlet_menuItem=my-requests");

	}

	public void clickOnWithdrawButton() {
		myWithdraw.click();
	}

	public void requestsField(String vacationStatusName) {
		Boolean found = false;
		List<WebElement> typeList = myRequestsField.findElements(By.cssSelector("div[class*='lfr-search-container']"));
		for (WebElement listItem : typeList) {
			if (listItem.getText().toLowerCase().contentEquals(vacationStatusName.toLowerCase())) {
				if (!listItem.isSelected())
					listItem.click();
				found = true;
			}
		}
		Assert.assertTrue("The 'Vacation Status Name' " + vacationStatusName + " was found", found);
	}

	public void clickDropList(String itemsPerPage) {
		Boolean found = false;
		List<WebElement> typeList = myDropList.findElements(By.cssSelector(
				"_evovacation_WAR_EvoVacationportlet_evozonVacationsSearchContainerPageIteratorBottom_itemsPerPage"));
		for (WebElement listItem : typeList) {
			if (listItem.getText().toLowerCase().contentEquals(itemsPerPage.toLowerCase())) {
				if (!listItem.isSelected())
					listItem.click();
				found = true;
			}
		}
		Assert.assertTrue("Items per page' " + itemsPerPage, found);
	}
	
}
