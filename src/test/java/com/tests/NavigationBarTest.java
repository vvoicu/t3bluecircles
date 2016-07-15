package com.tests;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.LogInSteps;
import com.selenium.steps.NavigationBarSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class NavigationBarTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	@Steps
	public LogInSteps loginSteps;
	@Steps
	public NavigationBarSteps navigationBarSteps;
	
	
	 String userName="ioana.craita";
	 String password="test";
	 String text="VACATION";
		

		@Test
		public void selectTab() {
			loginSteps.openPage();
			loginSteps.writeUsername(userName);
			loginSteps.writePassword(password);
			loginSteps.clickSignIn();
			navigationBarSteps.clickOnTab(text);
			
			

}
}