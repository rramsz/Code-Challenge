package com.prj.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CodeTest_CartPage {
	
	static WebDriver driver;

	public WebElement getTotalPriceOfPurchase() {
		return totalPriceOfPurchase;
	}

	public WebElement getProceedToCheckoutFromCart() {
		return ProceedToCheckoutFromCart;
	}

	public WebElement getProcessAddButton() {
		return processAddButton;
	}

	public WebElement getTermsConditionsCheckbox() {
		return termsConditionsCheckbox;
	}

	public WebElement getProcessCarrierButton() {
		return processCarrierButton;
	}

	public WebElement getPayByCheckOption() {
		return payByCheckOption;
	}

	public WebElement getConfirmOrderButton() {
		return confirmOrderButton;
	}

	public WebElement getPrice() {
		return price;
	}

	@FindBy(id="total_price")
	private WebElement totalPriceOfPurchase;
	
	@FindBy(xpath="//p[@class='cart_navigation clearfix']/a[1]")
	private WebElement ProceedToCheckoutFromCart;
	
	@FindBy(name="processAddress")
	private WebElement processAddButton;
	
	@FindBy(id="cgv")
	private WebElement termsConditionsCheckbox;
	
	@FindBy(xpath="//p[@class='fancybox-error']")
	private WebElement termsConditionsError;
	
	public WebElement getTermsConditionsErrorClose() {
		return termsConditionsErrorClose;
	}

	@FindBy(xpath="//a[@title='Close']")
	private WebElement termsConditionsErrorClose;
	
	public WebElement getTermsConditionsError() {
		return termsConditionsError;
	}

	@FindBy(name="processCarrier")
	private WebElement processCarrierButton;
	
	@FindBy(xpath="//a[@title='Pay by check.']")
	private WebElement payByCheckOption;
	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement payByBankWireOption;
	
	public WebElement getPayByBankWireOption() {
		return payByBankWireOption;
	}

	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	private WebElement confirmOrderButton;
	
	@FindBy(xpath="//span[@class='price']")
	private WebElement price;
	
	
	
	public CodeTest_CartPage(WebDriver ndriver) {
		this.driver = ndriver;
		PageFactory.initElements(driver, this);
	}

}
