package com.selenium.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class NewVacationRequestForZimbraPage extends PageObject {

	@FindBy(css = "input[id*='start']")
	private WebElementFacade startDate;
	@FindBy(css = "input[id*='end']")
	private WebElementFacade endDate;
	@FindBy(css = "input.aui-button-input.aui-button-input-submit")
	private WebElement saveButton;

	public void clickStartDate() {
		startDate.click();
	}

	public void clickEndDate() {
		endDate.click();
	}

	public void clickYear() {
		WebElement dateContainer = getDriver().findElement(By.cssSelector("div[style*='block']"));
		WebElement year = dateContainer.findElement(By.cssSelector("td.dp_caption"));
		year.click();
	}

	public void selectYear(String year) {
		WebElement dateContainer = getDriver().findElement(By.cssSelector("div[style*='block']"));
		clickYear();
		while (!dateContainer.findElement(By.cssSelector("td.dp_caption")).getText().contains(year)) {
			WebElement next = dateContainer.findElement(By.cssSelector("td.dp_next"));
			next.click();
		}
	}

	public void selectMonth(String month) {
		boolean monthFound = false;
		WebElement monthContainer = getDriver()
				.findElement(By.cssSelector("div[style*='block']  table.dp_monthpicker"));
		List<WebElement> monthElement = monthContainer
				.findElements(By.cssSelector("tr td:not([class$='dp_disabled'])"));
		for (WebElement element : monthElement) {
			if (element.getText().contains(month)) {
				monthFound = true;
				element.click();
				break;
			}
		}
		if (!(monthFound)) {
			System.out.println("The month was not found");
		}
	}

	public void selectDay(String day) {
		boolean dayFound = false;
		WebElement dayContainer = getDriver().findElement(By.cssSelector("div[style*='block']  table.dp_daypicker"));
		List<WebElement> dayElement = dayContainer.findElements(
				By.cssSelector("tr td:not(.dp_not_in_month):not(.dp_weekend_disabled):not(.dp_disabled)"));
		for (WebElement element : dayElement) {
			if (element.getText().contentEquals(day)) {
				System.out.println("DAY " + element.getText());
				dayFound = true;
				element.click();
				break;
			}
		}
		if (!(dayFound)) {
			System.out.println("The day was not found");
		}
		waitABit(2500);
	}

	public void clickSaveButton() {
		saveButton.click();
	}

	public static String monthsToInt(String month) {
		String[] str = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

		if (month.equals(str[0])) {
			return "01";
		}

		if (month.equals(str[1])) {
			return "02";
		}
		if (month.equals(str[2])) {
			return "03";
		}
		if (month.equals(str[3])) {
			return "04";
		}
		if (month.equals(str[4])) {
			return "05";
		}
		if (month.equals(str[5])) {
			return "06";
		}
		if (month.equals(str[6])) {
			return "07";
		}
		if (month.equals(str[7])) {
			return "08";
		}
		if (month.equals(str[8])) {
			return "09";
		}
		if (month.equals(str[9])) {
			return "10";
		}
		if (month.equals(str[10])) {
			return "11";
		}
		if (month.equals(str[11])) {
			return "12";
		}

		return "Invalid input data.";

	}
}
