package com.selenium.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.yahoo.com")
public class YahooSignInPage extends PageObject {

	@FindBy(css = "div.D-ib.Va-t.Grid-U-1-4.Ov-h.revdir ul:nth-child(4) li:nth-child(3) a")
	private WebElement usLanguage;
	@FindBy(css = ".Icon.Fz-m.Va-m.Lh-1.W-a.C-1")
	private WebElement languageButton;
	@FindBy(css = ".search-default-label")
	private WebElement searchWebButton;
	@FindBy(id = "uh-signin")
	private WebElement homePageSignInButton;
	@FindBy(css = "input#login-username.login-input.pure-u-1")
	private WebElement userNameField;
	@FindBy(css = "div.mbr-login-username input#login-username.login-input.pure-u-1")
	private WebElement nextButton;
	@FindBy(css = "div.passwd-field input.login-input.pure-u-1")
	private WebElement userPasswordField;
	
	@FindBy(css = "div.mbr-login-submit button.pure-u-1.pure-button.mbr-button-primary")
	private WebElement signInButton;

	public void clickLanguageButton() {
		languageButton.click();
	}

	public void clickUsLanguage() {
		usLanguage.click();
	}

	public void clickHomePageSignInButton() {
		homePageSignInButton.click();
	}

	public void inputUserName(String userName) {
		userNameField.sendKeys(userName);
	}

	public void clickNextButton() {
		nextButton.click();
	}

	public void inputUserPassword(String userPassword) {
		element(userPasswordField).waitUntilVisible();
		userPasswordField.sendKeys(userPassword);
	}

	public void clickSignInButton() {
		element(signInButton).waitUntilVisible();
		signInButton.click();
	}

}
