package com.selenium.pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.pages.NavigationBarPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


@DefaultUrl("http://172.22.4.88:9090/vacation")
public class VacationMenuPage extends PageObject{

	@FindBy(css="li[class*='inactive-menu']")
	private WebElementFacade vacationMenu;

	
	public void clickOnMenu(String text1) {
       WebElementFacade menuList = find(By.cssSelector(".inactive-menu"));
	//getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> results =menuList.findElements(By.tagName("a"));
        for(WebElement webElement : results) {
        	if(webElement.getText().contains(text1)){
        		//System.out.println(webElement.getText());
        		webElement.click();
        		break;
        		
        	}
        }
        } 
	}