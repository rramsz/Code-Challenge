package com.prj.testscripts;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.listener.Reporter;
import com.prj.helpers.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
features = "src\\test\\java\\com\\prj\\features",
glue = "com.prj.stepdefinitions", 
tags = {"@SmokeTest"}, 
strict = false
)

// After test execution open test report (from folder target>cucumber-reports) with Web Browser

public class CodeTest_Testrunner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() throws Exception {
				
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe"); 
		  driver = new ChromeDriver();		
		  Thread.sleep(1000);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	
	

}
