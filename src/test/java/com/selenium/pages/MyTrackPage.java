package com.selenium.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class MyTrackPage extends PageObject {

	@FindBy(css = "li.active-menu a")
	private WebElement trackPageSelector;
	@FindBy(css = "input[name='trackerStartDate']")
	private WebElement startDateFieldSelector;
	@FindBy(css = "input[name = 'trackerEndDate']")
	private WebElement endDateFieldSelector;
	@FindBy(css = "div#buildings dl dt div.hida")
	private WebElement buildingsFieldSelector;
	@FindBy(css = "div#departments dl dt div.hida")
	private WebElement departmentsFieldSelector;
	@FindBy(css = "a[class='aui-paginator-link aui-paginator-next-link']")
	private WebElement nextPageSelector;
	@FindBy(css = "span[class*='aui-paginator-total']")
	private WebElement paginatorContainerSelector;
	@FindBy(css = "table.taglib-search-iterator tbody tr:nth-child(3) td.align-left.col-7")
	private WebElement collumnStatusSelector;

	public void myTrackPage() {
		trackPageSelector.click();

	}

	public void myStartDateField() {

	}

	public void myEndDateField() {

	}

	public void myBuildingsField() {

	}

	public void myDepartmentsField() {

	}

	public Integer getNumberOfPages() {
		String total = paginatorContainerSelector.getText();
		String[] parts = total.split("of ");
		String part1 = parts[1];
		String[] parts1 = part1.split("\\) \\(Total");
		String part2 = parts1[0];
		return Integer.parseInt(part2);
	}

	public void myCollumnStatus() {

	}
	
	// HERE GOES DATE TIME PICKER
	
	public void clickStartDate() {
		startDateFieldSelector.click();
	}
	
	public void clickEndDate() {
		endDateFieldSelector.click();
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
		WebElement monthContainer = getDriver().findElement(By.cssSelector("div[style*='block']  table.dp_monthpicker"));
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

}
	
	

