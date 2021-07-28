package com.prj.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.prj.baseclass.CodeTest_BaseClass;
import com.prj.helpers.CodeTest_PageObjects;
import com.prj.testscripts.CodeTest_Testrunner;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CodeTest_Steps extends CodeTest_BaseClass{
	
	public WebDriver driver = CodeTest_Testrunner.driver;
	CodeTest_PageObjects tpo = new CodeTest_PageObjects(driver);
	
	@Given("^URL is launched in the chrome browser$")
	public void url_is_launched_in_the_chrome_browser() throws Throwable {
		try {
			driver.get("http://automationpractice.com/index.php?");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("URL is incorrect");
		}
	}
	
	@When("^user clicks SignIn button on the home page$")
	public void user_clicks_SignIn_button_on_the_home_page() throws Throwable {
	    try {
			elementClick(tpo.getCt_home().getSignInText());
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to click the Sign in button");
		}	 
	}

	@When("^user enters valid emailID '(.*)'$")
	public void user_enters_valid_email(String value) throws Throwable {
	    try {
			elementSendKeys(tpo.getCt_email().getEmailField(),value);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Unable to click the Sign in button");
		}	
	}

	@When("^user clicks Create an account button$")
	public void user_clicks_submit() throws Throwable {
	    try {
			elementClick(tpo.getCt_email().getSubmitEmailButton());
		} catch (Exception e) {
			e.printStackTrace();
		}	    
	}

	@Then("^user should be navigated to CREATE AN ACCOUNT screen$")
	public void user_should_be_navigated_to_CREATE_AN_ACCOUNT_screen() throws Throwable {
		try {
			waitUntilElementVisibility(tpo.getCt_reg().getCreateAccount_Hdr());
			isElementDisplayed(tpo.getCt_reg().getCreateAccount_Hdr());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^user selects title$")
	public void user_selects_Mr_and_Mrs() throws Throwable {
	    try {
			elementClick(tpo.getCt_reg().getGenderMrs());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^user enters first name as '(.*)'$")
	public void user_enters_first_name(String value) throws Throwable {
		try {
			elementSendKeys(tpo.getCt_reg().getFirstName(), value);
		} catch (Exception e) {
			e.printStackTrace();
		}	    
	}

	@When("^user enters last name$")
	public void user_enters_last_name() throws Throwable {
		try {
			elementSendKeys(tpo.getCt_reg().getLastName(), "Sharma");
		} catch (Exception e) {
			e.printStackTrace();
		}	    	    
	}

	@When("^user clicks on email field to confirm the entered email address$")
	public void user_clicks_on_email_field_to_confirm_the_entered_email_address() throws Throwable {
		try {
			elementClick(tpo.getCt_reg().getEmail());
		} catch (Exception e) {
			e.printStackTrace();
		}	    	    
	}

	@When("^user enters password$")
	public void user_enters_password() throws Throwable {
		try {
			elementSendKeys(tpo.getCt_reg().getPassword(), "abc123");
		} catch (Exception e) {
			e.printStackTrace();
		}	     
	}

	@When("^user enters DOB$")
	public void user_enters_DOB() throws Throwable {
		try {
			selectFromDropDown(tpo.getCt_reg().getDaysInDOB(), "value", "4");
			selectFromDropDown(tpo.getCt_reg().getMonthInDOB(), "value", "5");
			selectFromDropDown(tpo.getCt_reg().getYearInDOB(), "index", "20");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^user clicks checkbox to subscribe for newsletter$")
	public void user_clicks_checkbox_to_subscribe_for_newsletter() throws Throwable {
		try {
			Thread.sleep(2000);
			elementClick(tpo.getCt_reg().getSubscribeNewsletter());
		} catch (Exception e) {
			e.printStackTrace();
		}	    
	}

	@When("^user clicks checkbox to receive special offers from partners$")
	public void user_clicks_checkbox_to_receive_special_offers_from_partners() throws Throwable {
		try {
			elementClick(tpo.getCt_reg().getSubscribeOthers());
		} catch (Exception e) {
			e.printStackTrace();
		}	    
	}

	@When("^user enters address line1$")
	public void user_enters_address_line1() throws Throwable {
		try {
			elementSendKeys(tpo.getCt_reg().getAddress1Field(), "1 Rajaji street, Annanagar");
		} catch (Exception e) {
			e.printStackTrace();
		}	    
	}

	@When("^user enters the name of the city$")
	public void user_enters_the_name_of_the_city() throws Throwable {
		try {
			elementSendKeys(tpo.getCt_reg().getCityField(), "Chennai");
		} catch (Exception e) {
			e.printStackTrace();
		}	    
	}

	@When("^user selects a state from the dropdown$")
	public void user_selects_a_state_from_the_dropdown() throws Throwable {
		try {
			selectFromDropDown(tpo.getCt_reg().getStateField(), "visibletext", "California");
		} catch (Exception e) {
			e.printStackTrace();
		}	    
	}
	
	@When("^user enters the poscode$")
	public void user_enters_the_poscode() throws Throwable {
		try {
			elementSendKeys(tpo.getCt_reg().getPostcodeField(), "00004");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@When("^user enters mobile number$")
	public void user_enters_mobile_number() throws Throwable {
		try {
			elementSendKeys(tpo.getCt_reg().getMobileNoField(), "98765412360");
		} catch (Exception e) {
			e.printStackTrace();
		}	    
	}

	@When("^user enters alias information$")
	public void user_enters_alias_information() throws Throwable {
		try {
			elementClear(tpo.getCt_reg().getAliasField());
			elementSendKeys(tpo.getCt_reg().getAliasField(), "None");
		} catch (Exception e) {
			e.printStackTrace();
		}	    
	}

	@When("^user clicks submit in registration page$")
	public void user_clicks_submit_in_registration_page() throws Throwable {
		try {
			Thread.sleep(5000);
			elementClick(tpo.getCt_reg().getSubmitButton());
		} catch (Exception e) {
			e.printStackTrace();
		}	    
	}

	@Then("^user sees his name in the header on accounts page '(.*)'$")
	public void user_checks_his_name_in_the_header_on_accounts_page(String value) throws Throwable {
		try {
			Thread.sleep(3000);
			String text = getElementText(tpo.getCt_acc().getCustomerName());
			Assert.assertTrue(text.contains(value));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@When("^user enters user ID in email field2 '(.*)'$")
	public void user_enters_user_ID_in_email_field(String value) throws Throwable {
		try {
			elementSendKeys(tpo.getCt_email().getEmailfield2(), value);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	@When("^user enters password in the password field '(.*)'$")
	public void user_enters_password_in_the_password_field(String value) throws Throwable {
		try {
			Thread.sleep(1000);
			elementSendKeys(tpo.getCt_email().getPasswordField(), value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	}

	@When("^user clicks SignIn button$")
	public void user_clicks_SignIn_button() throws Throwable {
		try {
			elementClick(tpo.getCt_email().getSubmitLogin());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@When("^user navigates to Women menu$")
	public void user_navigates_to_Women_menu() throws Throwable {
		try {
			mouseHoverOnElement(tpo.getCt_items().getWomenApparel());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^user chooses Causal Dresses$")
	public void user_chooses_Causal_Dresses() throws Throwable {
		try {
			Thread.sleep(2000);
			elementClick(tpo.getCt_items().getCasualDressesOpt());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^user clicks Add to Cart$")
	public void user_clicks_Add_to_Cart() throws Throwable {
		try {
			Thread.sleep(2000);
			mouseHoverOnElement(tpo.getCt_items().getCasualDressImage());
			elementClick(tpo.getCt_items().getAddDressesToCart());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^user clicks continue shopping$")
	public void user_clicks_continue_shopping() throws Throwable {
		try {
			Thread.sleep(2000);
			elementClick(tpo.getCt_items().getContinueShopping());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^user navigates to Dresses$")
	public void user_navigates_to_Dresses() throws Throwable {
		try {
			Thread.sleep(2000);
			mouseHoverOnElement(tpo.getCt_items().getDressesMenu());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^user selects Evening dresses$")
	public void user_selects_Evening_dresses() throws Throwable {
		try {
			elementClick(tpo.getCt_items().getEveningDresses());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^user clicks Proceed to Checkout$")
	public void user_clicks_Proceed_to_Checkout() throws Throwable {
		try {
			elementClick(tpo.getCt_items().getProceedToCheckout());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@When("^user clicks Proceed to checkout on Cart page$")
	public void user_clicks_Proceed_to_checkout_on_Cart_page() throws Throwable {
		try {
			Thread.sleep(2000);
			elementClick(tpo.getCt_cart().getProceedToCheckoutFromCart());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^user clicks Proceed to checkout on Address page$")
	public void user_clicks_Proceed_to_checkout_on_Address_page() throws Throwable {
		try {
			elementClick(tpo.getCt_cart().getProcessAddButton());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@When("^user checks the Terms and conditions checkbox$")
	public void user_checks_the_Terms_and_conditions_checkbox() throws Throwable {
		try {
			elementClick(tpo.getCt_cart().getTermsConditionsCheckbox());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^user Clicks Proceed to checkout on Shipping\\(career\\) page$")
	public void user_Clicks_Proceed_to_checkout_on_Shipping_career_page() throws Throwable {
		try {
			elementClick(tpo.getCt_cart().getProcessCarrierButton());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@When("^user choses pay by check option$")
	public void user_choses_pay_by_check_option() throws Throwable {
		try {
			elementClick(tpo.getCt_cart().getPayByCheckOption());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^user clicks I confirm my order button$")
	public void user_clicks_I_confirm_my_order_button() throws Throwable {
		try {
			elementClick(tpo.getCt_cart().getConfirmOrderButton());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("^user verifies price of his order$")
	public void user_verifies_price_of_his_order() throws Throwable {
		try {
			String text = getElementText(tpo.getCt_cart().getPrice());
			System.out.println(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@When("^user choses pay by bank wire option$")
	public void user_choses_pay_by_bank_wire_option() throws Throwable {
		try {
			elementClick(tpo.getCt_cart().getPayByBankWireOption());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@After("@End")
	public void end() throws Throwable {
		elementClick(tpo.getCt_acc().getSignOut());
	}

	@Then("^user logs off$")
	public void user_logs_off() throws Throwable {
		try {
			elementClick(tpo.getCt_acc().getSignOut());
		} catch (Exception e) {
			e.printStackTrace();
		}	    
	}
	
}
