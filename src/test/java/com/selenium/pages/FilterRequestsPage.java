package com.selenium.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://172.22.4.88:9090/vacation")
public class FilterRequestsPage extends PageObject {

	@FindBy(css = "div[class='aui-column-content aui-column-content-first column-three-content ']")
	private WebElementFacade filterRequest;

	@FindBy(css = "input[class='aui-button-input']")
	private WebElementFacade apply;

	@FindBy(css = "div[class='lfr-search-container ']")
	private WebElementFacade verifyType;
	
	@FindBy(css = "option[value='75']")
	private WebElementFacade selectNumber;

	public void clickOnCheckBox(String checkBox) {
		List<WebElement> results = filterRequest.findElements(By.cssSelector("span span label"));
		for (WebElement webElement : results) {
			// System.out.println("aaa: " + webElement.getText());
			if (webElement.getText().contains(checkBox)) {
				webElement.click();
			}
		}
	}

	public void verifyType(String type) {
		boolean equal = true;
		List<WebElement> results = verifyType
				.findElements(By.cssSelector(".align-left col-4 col-my.request.column.header.type valign-middle"));
		for (WebElement webElement : results) {
			if (!webElement.getText().contains(type)) {
				equal = false;

			}
		}
		Assert.assertTrue("Vacation Type is not sorted corectly", equal);
	}

	public void apply() {
		apply.click();
	}
	
	public void selectNumber() {
		selectNumber.click();
	}
}
