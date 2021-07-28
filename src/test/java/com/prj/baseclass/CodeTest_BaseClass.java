package com.prj.baseclass;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.prj.testscripts.CodeTest_Testrunner;



public class CodeTest_BaseClass {
	public static WebDriver driver = CodeTest_Testrunner.driver;
	
	
	public static void elementClick(WebElement element) throws Exception {
		try {
				element.click();		
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Element is not clickable");
		}
	}

	public static void elementClear(WebElement element) throws Exception {
		try {
			waitUntilElementVisibility(element);
			if(isElementDisplayed(element) && isElementEnabled(element)) {
			element.clear();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to clear the text in the webelement");
		}
	}

	public static void elementSendKeys(WebElement element, String value) throws Exception {
		try {
			waitUntilElementVisibility(element);
			if(isElementDisplayed(element) && isElementEnabled(element)) {
			element.sendKeys(value);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to send keys to the webelement");
		}
	}

	
	public static void launchURL(String url) throws Exception {
		try {
			Thread.sleep(6000);
			driver.get(url);
			driver.manage().window().maximize();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("URL is incorrect");
		}
	}

	 public boolean isAlertPresent()
	    {
	        try
	        {
	            driver.switchTo().alert();
	            System.out.println("Alert");
	            return true;
	        }
	        catch (NoAlertPresentException Ex)
	        {
	        	System.out.println("No alert");
	            return false;
	        } 
	    }  


	public static boolean isElementDisplayed(WebElement element) throws Exception {
		try {
			boolean displayed = element.isDisplayed();
			return displayed;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Element is not displayed");
		}
	}
	
	public static boolean isElementEnabled(WebElement element) throws Exception {
		try {
			boolean enabled = element.isEnabled();
			return enabled;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Element is not enabled");
		}
	}

	public static boolean isElementSelected(WebElement element) throws Exception {
		try {
			boolean selected = element.isSelected();
			return selected;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Element is not selected");
		}
	}
	
	public static void waitUntilElementVisibility(WebElement element) throws Exception {
		try {
			WebDriverWait w = new WebDriverWait(driver, 70);
			w.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Element is not visible");
		}
	}
	

	public static String getElementText(WebElement element) throws Exception {
		try {
			String text = element.getText();
			return text;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to get the text from the webelement");
		}
	}

	public static String getElementAttribute(WebElement element, String value) throws Exception {
		try {
			String attribute = element.getAttribute(value);
			return attribute;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to get the text from the webelement");
		}
	}

	public static void selectFromDropDown(WebElement element, String options, String value) throws Exception {

		try {
			Select sc = new Select(element);
			if (options.equals("value")) {
				sc.selectByValue(value);
			} else if (options.equals("index")) {
				sc.selectByIndex(Integer.parseInt(value));
			} else if (options.equals("visibletext")) {
				sc.selectByVisibleText(value);
			}
		} catch (NumberFormatException e) {

			e.printStackTrace();
			throw new Exception("Unable to select from dropdown");
		}

	}
	
	
	public static WebElement getSelectedValue(WebElement element) {
		Select sc = new Select(element);
		WebElement selected = sc.getFirstSelectedOption();
		System.out.println(selected);
		return selected;
	}

	
	public static void mouseHoverOnElement(WebElement element) throws Exception {
		try {
			waitUntilElementVisibility(element);
			if(isElementDisplayed(element) && isElementEnabled(element)) {
			Actions a = new Actions(driver);
			a.moveToElement(element).build().perform();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to move to the webelement");
		}
	}


	public static void performDragAndDrop(WebElement source, WebElement target) throws Exception {
		try {
			Actions a = new Actions(driver);
			a.dragAndDrop(source, target).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to send text to the webelement");
		}
	}

	public static void performDoubleClickElement(WebElement element) throws Exception {
		try {
			waitUntilElementVisibility(element);
			if(isElementDisplayed(element) && isElementEnabled(element)) {
			Actions a = new Actions(driver);
			a.doubleClick(element).build().perform();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to move to the webelement");
		}
	}

	public static void performRightClickElement(WebElement element) throws Exception {
		try {
			waitUntilElementVisibility(element);
			if(isElementDisplayed(element) && isElementEnabled(element)) {
			Actions a = new Actions(driver);
			a.contextClick(element).build().perform();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to move to the webelement");
		}
	}

	public static void waitUntilAlertPresent() throws Exception {
		try {
			WebDriverWait w = new WebDriverWait(driver, 20);
			w.until(ExpectedConditions.alertIsPresent());
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Alert is not present");
		}
	}

	public static void acceptAlert() throws Exception {
		try {
			Alert a = driver.switchTo().alert();
			a.accept();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to accept the alert");
		}
	}

	public static void dismissAlert() throws Exception {
		try {
			Alert a = driver.switchTo().alert();
			a.dismiss();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to dismiss the alert");
		}
	}

	public static void sendKeysToAlert(String value) throws Exception {
		try {
			Alert a = driver.switchTo().alert();
			a.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to send keys to the alert");
		}
	}
	
	
	public static void refreshWebPage() throws Exception {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void navigateToUrl(String url) throws Exception {
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void navigateBack() throws Exception {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void navigateForward() throws Exception {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}
		
}
