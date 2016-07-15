package com.selenium.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class MyViewVacationSearchPage extends PageObject {

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_HOLIDAYCheckbox")
	private WebElement myHolidayCheckBox;
	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_FIFTHCheckbox")
	private WebElement myDaysNumberCheckBox;
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_WITHDRAWNCheckbox") //NU E BUN ID-UL
	private WebElement myVacationStatusCheckBox;
	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_viewVacationsFirstName")
	private WebElement myFirstName;
	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_viewVacationsLastName")
	private WebElement myLastName;
	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElement myApplyButton;

	public void goToViewVacations() {
		getDriver().get(
				"http://172.22.4.88:9090/vacation?p_p_id=evovacation_WAR_EvoVacationportlet&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_evovacation_WAR_EvoVacationportlet_backURL=%2Fvacation%3Fp_p_id%3Devovacation_WAR_EvoVacationportlet%26p_p_lifecycle%3D0%26p_p_state%3Dnormal%26p_p_mode%3Dview%26p_p_col_id%3Dcolumn-1%26p_p_col_count%3D1%26_evovacation_WAR_EvoVacationportlet_backURL%3D%252Fvacation%26_evovacation_WAR_EvoVacationportlet_menuItem%3Dview-vacations&_evovacation_WAR_EvoVacationportlet_menuItem=view-vacations");
	}

	public void clickHolidayCheckBox() {
		myHolidayCheckBox.click();
	}

	public void clickDaysNumberCheckBox() {
		myDaysNumberCheckBox.click();
	}

	public void clickVacationStatusCheckBox() {
		myVacationStatusCheckBox.click();
	}

	public void lastName(String inputLastNam) {
		myLastName.sendKeys(inputLastNam);
	}

	public void firstName(String inputFirstName) {
		myFirstName.sendKeys(inputFirstName);
	}

	public void clickApplyButton() {
		myApplyButton.click();
	}

}
