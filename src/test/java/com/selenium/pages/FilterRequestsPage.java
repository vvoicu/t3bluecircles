package com.selenium.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://172.22.4.88:9090/vacation")
public class FilterRequestsPage extends PageObject{
	@FindBy(css = "div[class='aui-column-content aui-column-content-first column-three-content ']")
	private WebElementFacade filterRequest;
	@FindBy(css = "input[class='aui-button-input']")
	private WebElementFacade apply;
	@FindBy(css = "input[class='aui-button-input']")
	private WebElementFacade type;
	@FindBy(css = "input[class='aui-button-input']")
	private WebElementFacade verifyType;
	
	public void clickOnCheckBox(String checkBox) {
		List<WebElement> results = filterRequest.findElements(By.cssSelector("span span label"));
		theFor:for (WebElement webElement : results) {
			System.out.println("aaa: " + webElement.getText());
			if (webElement.getText().contains(checkBox)) {
				webElement.click();
				break theFor;
				
			}
		}
		
			}
	
	
	public void apply() {
		   apply.click();
	}


		
	}

