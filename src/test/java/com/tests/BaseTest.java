package com.tests;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;

import gherkin.deps.net.iharder.Base64.OutputStream;

public class BaseTest {

	private Properties prop = new Properties();
	private FileInputStream input;

	protected String userName, userPassword, startDate, endDate, daysNumber, type, lastUpdatedBy, pending;

	@Before
	public void dataSetup() throws IOException {
		input = new FileInputStream("src/test/resources/MyRequestsConfig.properties");
		prop.load(input);

		userName = prop.getProperty("userName");
		userPassword = prop.getProperty("userPassword");
		startDate = prop.getProperty("startDate");
		endDate = prop.getProperty("endDate");
	}

	@After
	public void dataWrite() throws IOException {
		Properties prop = new Properties();
		FileOutputStream output = null;
		output = new FileOutputStream("src/test/resources/MyRequestsConfigOutput.properties");

		prop.setProperty("userName", "daniel.nistreanu");
		prop.setProperty("userPassword", "test");
		prop.setProperty("startDate", "4 july");
		prop.setProperty("endDate", "15 august");

		prop.store(output, "OutputFile");

	}

}
