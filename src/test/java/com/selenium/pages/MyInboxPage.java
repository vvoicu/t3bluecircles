package com.selenium.pages;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("http://172.22.4.88:9090/vacation?p_p_id=evovacation_WAR_EvoVacationportlet&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_evovacation_WAR_EvoVacationportlet_backURL=%2Fvacation&_evovacation_WAR_EvoVacationportlet_menuItem=inbox")
public class MyInboxPage extends PageObject {

	/*
	@FindBy(css = "div[class*='aui-column-content column-three-content column-center-content'] div.column-title")
	private WebElementFacade myDaysNumber;

	@FindBy(css = "div[class*='aui-column-last'] div.aui-column-last div.column-title")
	private WebElementFacade myVacationStatus;

	@FindBy(css = "input[id*='HOLIDAYCheckbox']")
	private WebElementFacade myHolidayCheckBox;

	@FindBy(css = "span[applyButton]")
	private WebElementFacade myApplyButton;
	

	public void verifyColumnTitleExists(String label){
		boolean isPresent = false;
		List<WebElement> columnsList = getDriver().findElements(By.cssSelector(".filter-content .aui-column"));
		for (WebElement webElement : columnsList) {
			if(webElement.getText().contains(label)){
				isPresent = true;
				
			}
		}
		Assert.assertTrue("Failure: element was not found - " + label, isPresent);
	}
	*/
	
	@FindBy(css = "input[name = '_evovacation_WAR_EvoVacationportlet_rowIds']")
	private WebElementFacade myInboxRequestCheckBox;
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_multipleApproveButton")
	private WebElementFacade myApplyButton;
	
	public void InboxRequestCheckBox() {
		getDriver().get("http://172.22.4.88:9090/vacation?p_p_id=evovacation_WAR_EvoVacationportlet&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_evovacation_WAR_EvoVacationportlet_backURL=%2Fvacation&_evovacation_WAR_EvoVacationportlet_menuItem=inbox");
		myInboxRequestCheckBox.click();
	}

	public void ApplyButton() {
		myApplyButton.click();
	}



}
