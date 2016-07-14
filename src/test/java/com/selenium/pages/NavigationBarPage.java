package com.selenium.pages;

import static ch.lambdaj.Lambda.convert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://172.22.4.88:9090/home")
public class NavigationBarPage extends PageObject{

	@FindBy(css="ul[class*=main-menu']")
	private WebElementFacade navigationbar;
	
	
	
	public void clickOnTab(String text) {
       WebElementFacade barList = find(By.cssSelector(".main-menu"));
	//getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> results =barList.findElements(By.tagName("a"));
        for(WebElement webElement : results) {
        	if(webElement.getText().contains(text)){
        		//System.out.println(webElement.getText());
        		webElement.click();
        		break;
        		
        	}
        }
       
    }
	
	
}
