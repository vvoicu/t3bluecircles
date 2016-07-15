package com.selenium.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.22.4.88:9090/vacation?p_p_id=evovacation_WAR_EvoVacationportlet&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_evovacation_WAR_EvoVacationportlet_backURL=%2Fvacation&_evovacation_WAR_EvoVacationportlet_menuItem=my-requests")
public class MyRequestsPage extends PageObject {

	@FindBy(css = "div.filter-content div.aui-column-first div.column-title")
	private WebElementFacade myVacationType;

	@FindBy(css = "div[class*='aui-column-content column-three-content column-center-content'] div.column-title")
	private WebElementFacade myDaysNumber;

	@FindBy(css = "div[class*='aui-column-last'] div.aui-column-last div.column-title")
	private WebElementFacade myVacationStatus;

	@FindBy(css = "input[id*='HOLIDAYCheckbox']")
	private WebElementFacade myHolidayCheckBox;

	@FindBy(css = "span[applyButton]")
	private WebElementFacade myApplyButton;
	@FindBy(css = "span[class*='aui-paginator-total']")
	private WebElement paginatorContainer;
	@FindBy(css = "a[class='aui-paginator-link aui-paginator-next-link']")
	private WebElement nextPageCssSelector;
	@FindBy(css = ".taglib-search-iterator tr:not([class*='lfr-template'])")
	private List<WebElement> resultsList;
	private String requestStatusColumnCssSelector = "td:last-child";
	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_withdrawnVacationRequest")
	private WebElement withdrawButton;
	@FindBy(css = "div.horizontal-center-alignment")
	private WebElement successfulWithdrawMessage;
	/*
	 * public void verifyColumnTitleExists(String label){ boolean isPresent =
	 * false; List<WebElement> columnsList =
	 * getDriver().findElements(By.cssSelector(".filter-content .aui-column"));
	 * for (WebElement webElement : columnsList) {
	 * if(webElement.getText().contains(label)){ isPresent = true;
	 * 
	 * } } Assert.assertTrue("Failure: element was not found - " + label,
	 * isPresent);
	 * 
	 * }
	 */
	private String successfulWithdraw = "There are no actions for a Withdrawn vacation.";

	public void clickWithdrawButton() {
		withdrawButton.click();
	}
	// public void checkWithdrawStatus(){
	// boolean withDraw = True;
	// if (successfulWithdrawMessage.getText().contains(successfulWithdraw){
	// System.out.println("Your Withdraw request was Succesful!");
	//
	//
	// }
	// else {
	// assert.AssertTrue("Error was occured during Withdraw!", withDraw =
	// false);
	// }
	// }

	public void checkStatus(String status) {
		Assert.assertTrue("The message is not the expected one", successfulWithdrawMessage.getText().contains(status));
	}

	public Integer getNumberOfPages() {
		String total = paginatorContainer.getText();
		String[] parts = total.split("of ");
		String part1 = parts[1];
		String[] parts1 = part1.split("\\) \\(Total");
		String part2 = parts1[0];
		return Integer.parseInt(part2);
	}

	public WebElement getVacationRequest(String... details) {
		boolean isItemfound = false;
		int numberOfPages = getNumberOfPages();
		for (int i = 0; i < numberOfPages; i++) {
			for (WebElement resultItem : resultsList) {
				for (String detail : details) {
					if (resultItem.getText().toLowerCase().contains(detail.toLowerCase())) {
						isItemfound = true;
					} else {
						isItemfound = false;
						break;
					}
				}
				if (isItemfound)
					return resultItem;
			}
			nextPageCssSelector.click();
			waitABit(1000);
		}
		Assert.assertTrue("The result was not found!", isItemfound);
		return null;
	}

	public void clickOnAVacationRequestStatusCollumn(String... details) {
		getVacationRequest(details).findElement(By.cssSelector(requestStatusColumnCssSelector)).click();
	}

	public void vacationType(String keyword) {
		myVacationType.type(keyword);
	}

	public void holidayCheckBox() {
		myHolidayCheckBox.click();
	}

	public void daysNumber() {
		myDaysNumber.click();
	}

	public void vacationStatus() {
		myVacationStatus.click();
	}

	public void applyButton() {
		myApplyButton.click();
	}

	public void grabTextVacationStatus() {
		getDriver().get(
				"http://172.22.4.88:9090/vacation?p_p_id=evovacation_WAR_EvoVacationportlet&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_evovacation_WAR_EvoVacationportlet_backURL=%2Fvacation&_evovacation_WAR_EvoVacationportlet_menuItem=my-requests");
		String textVacationStatus = myVacationStatus.getText();
		System.out.println("grabbed text:" + textVacationStatus);
		Assert.assertTrue("Same Title", textVacationStatus.contains("Vacation Status"));
	}

	public void grabTextDaysNumber() {
		getDriver().get(
				"http://172.22.4.88:9090/vacation?p_p_id=evovacation_WAR_EvoVacationportlet&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_evovacation_WAR_EvoVacationportlet_backURL=%2Fvacation&_evovacation_WAR_EvoVacationportlet_menuItem=my-requests");
		String textDaysNumber = myDaysNumber.getText();
		System.out.println("grabbed text:" + textDaysNumber);
		Assert.assertTrue("Same Title", textDaysNumber.contains("Days Number"));
	}

	public void grabTextVacationType() {
		getDriver().get(
				"http://172.22.4.88:9090/vacation?p_p_id=evovacation_WAR_EvoVacationportlet&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_evovacation_WAR_EvoVacationportlet_backURL=%2Fvacation&_evovacation_WAR_EvoVacationportlet_menuItem=my-requests");
		String textVacationType = myVacationType.getText();
		System.out.println("grabbed text:" + textVacationType);
		Assert.assertTrue("Same Title", textVacationType.contains("Vacation Type"));
	}

}
