package com.stepdefinition;


import java.io.FileNotFoundException;
import java.io.IOException;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass extends BaseClass{

	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {
		
		getDriver(getpropertyFileValue("browser"));
		maximizeWindow();
		url(getpropertyFileValue("url"));
		implicitWait(5);
		
	}
	
	@After
	public void afterScenario() {
		
//		quitBrowser();
	}
	
}
