package com.selenium.steps;

import com.selenium.pages.NavigationBarPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class NavigationBarSteps extends ScenarioSteps {
   NavigationBarPage navigationBarPage;
   
   @Step
   public void clickOnTab(String text){
	   navigationBarPage.clickOnTab(text);
   }
  
}
