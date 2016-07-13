package com.selenium.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;



@DefaultUrl("http://172.22.4.88:9090/login")
public class LoginPage extends PageObject{

@FindBy(css="input[id*='_login']")
private WebElement inputUsername;

@FindBy(css="input[id*='_password']")
private WebElement inputPassword;


@FindBy(css="input[class*='aui-button-input']")
private WebElement clickSignIn;

public void inputUsername(String userName){
	inputUsername.sendKeys(userName);
}
 
public void inputPassword(String password){
	inputPassword.sendKeys(password);
}
public void clickSignIn() {
   clickSignIn.click();
}

}