package com.selenium.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://172.22.4.88:9090/vacation?p_p_id=evovacation_WAR_EvoVacationportlet&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_evovacation_WAR_EvoVacationportlet_backURL=%2Fvacation%3Fp_p_id%3Devovacation_WAR_EvoVacationportlet%26p_p_lifecycle%3D0%26p_p_state%3Dnormal%26p_p_mode%3Dview%26p_p_col_id%3Dcolumn-1%26p_p_col_count%3D1%26_evovacation_WAR_EvoVacationportlet_backURL%3D%252Fvacation%253Fp_p_id%253Devovacation_WAR_EvoVacationportlet%2526p_p_lifecycle%253D0%2526p_p_state%253Dnormal%2526p_p_mode%253Dview%2526p_p_col_id%253Dcolumn-1%2526p_p_col_count%253D1%2526_evovacation_WAR_EvoVacationportlet_menuItem%253Dnew-request%26_evovacation_WAR_EvoVacationportlet_menuItem%3Dmy-requests&_evovacation_WAR_EvoVacationportlet_menuItem=new-request")

public class NewVacationRequestPage extends PageObject {

	// @FindBy(css="input[id*='type_CO']")
	// private WebElement radioButtonHoliday;

	@FindBy(css = "div[id*='vacationTypeContainer']")
	private WebElement vacationTypeList;

	@FindBy(css = "select[name=specialReason]")
	private WebElement specialVacationList;

	@FindBy(css = "select[name=maternityLeave]")
	private WebElement maternityLeaveList;

	@FindBy(css = "input[id*='_saveButton']")
	private WebElement saveButton;

	@FindBy(css = "input[id*='_cancelButton']")
	private WebElement cancelButton;

	// public void selectHolidayRadioButton(){
	// radioButtonHoliday.click();
	// }

	public void selectSpecialVacation(String specialVacationType) {
		List<WebElement> results = specialVacationList.findElements(By.cssSelector("option"));
		for (WebElement webElement : results) {
			if (webElement.getText().contains(specialVacationType)) {
				webElement.click();
				break;
			}
		}
	}

	public void selectMaternityLeave(String maternityLeaveType) {
		List<WebElement> results = maternityLeaveList.findElements(By.cssSelector("option"));
		for (WebElement webElement : results) {
			if (webElement.getText().contains(maternityLeaveType)) {
				webElement.click();
				break;
			}
		}
	}

	public void selectVacationType(String type, String optionType) {
		// WebElement typeList =
		// find(By.cssSelector("div[id*='vacationTypeContainer']"));
		List<WebElement> results = vacationTypeList.findElements(By.cssSelector("div label"));
		for (WebElement webElement : results) {
			// String name = webElement.getText();
			if (webElement.getText().contains(type)) {
				webElement.click();
				break;
			}
		}
		if (type.equals("Special vacation")) {
			selectSpecialVacation(optionType);
		}
		if (type.equals("Maternity Leave")) {
			selectMaternityLeave(optionType);
		}
	}

	public void saveRequest() {
		saveButton.click();
	}

	public void cancel_request() {
		cancelButton.click();
	}

}
