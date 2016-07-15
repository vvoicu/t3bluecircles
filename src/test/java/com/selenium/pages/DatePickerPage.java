package com.selenium.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DatePickerPage extends PageObject {

	@FindBy(css = "input[id*='start']")
	private WebElementFacade startDate;

	public void selectStartDate() {
		startDate.click();
	}

	public void clickYear() {
		WebElement dateContainer = getDriver().findElement(By.cssSelector("div[style*='block']"));
		WebElement year = dateContainer.findElement(By.cssSelector("td.dp_caption"));
		year.click();
	}

	public void selectYear(String year) {
		WebElement dateContainer = getDriver().findElement(By.cssSelector("div[style*='block']"));
		while (!dateContainer.findElement(By.cssSelector("div[style*='block']")).getText().contains(year)) {
			WebElement next = dateContainer.findElement(By.cssSelector("td.dp_next"));
			next.click();
		}
	}

	public void selectMonth(String month) {
		WebElement dateContainer = getDriver().findElement(By.cssSelector("div[style*='block']"));
		WebElement monthContainer = dateContainer.findElement(By.cssSelector("table.dp_monthpicker"));
		List<WebElement> monthElement = monthContainer.findElements(By.cssSelector("table.dp_monthpicker tr td"));
		for (WebElement element : monthElement) {
			if (element.getText().contains(month)) {
				element.click();
			}
		}
	}

	public void selectDay(String day) {
		WebElement dateContainer = getDriver().findElement(By.cssSelector("div[style*='block']"));
		WebElement dayContainer = dateContainer.findElement(By.cssSelector("table.dp_daypicker"));
		List<WebElement> dayElement = dayContainer.findElements(
				By.cssSelector("table.dp_daypicker tr td:not(.dp_not_in_month):not(.dp_weekend_disabled)"));
		for (WebElement element : dayElement) {
			if (element.getText().contains(day)) {
				element.click();
			}
		}
	}
	
	

}
