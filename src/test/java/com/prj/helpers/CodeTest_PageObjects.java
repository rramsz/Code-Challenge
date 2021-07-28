package com.prj.helpers;

import org.openqa.selenium.WebDriver;

import com.prj.pom.CodeTest_CartPage;
import com.prj.pom.CodeTest_EnterEmailAndSignIn;
import com.prj.pom.CodeTest_HomePage;
import com.prj.pom.CodeTest_MyAccountPage;
import com.prj.pom.CodeTest_RegistrationDetails;
import com.prj.pom.CodeTest_SelectItems;

public class CodeTest_PageObjects {

	private WebDriver driver;
	
	private CodeTest_HomePage ct_home;
	private CodeTest_CartPage ct_cart;
	private CodeTest_SelectItems ct_items;
	private CodeTest_MyAccountPage ct_acc;
	private CodeTest_RegistrationDetails ct_reg;
	private CodeTest_EnterEmailAndSignIn ct_email;
	
	public CodeTest_HomePage getCt_home() {
		return (ct_home == null) ? ct_home = new CodeTest_HomePage(driver) : ct_home;
	}
	
	public CodeTest_CartPage getCt_cart() {
		return (ct_cart == null) ? ct_cart = new CodeTest_CartPage(driver) : ct_cart;
	}
	
	public CodeTest_SelectItems getCt_items() {
		return (ct_items == null) ? ct_items = new CodeTest_SelectItems(driver) : ct_items;
	}
	
	public CodeTest_MyAccountPage getCt_acc() {
		return (ct_acc == null) ? ct_acc = new CodeTest_MyAccountPage(driver) : ct_acc;
	}
	
	public CodeTest_RegistrationDetails getCt_reg() {
		return (ct_reg == null) ? ct_reg = new CodeTest_RegistrationDetails(driver) : ct_reg;
	}
	
	public CodeTest_EnterEmailAndSignIn getCt_email() {
		return (ct_email == null) ? ct_email = new CodeTest_EnterEmailAndSignIn(driver) : ct_email;
	}
	
	
	public CodeTest_PageObjects(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	
}
