package com.stepDefination.SauceDemoDash;

import org.openqa.selenium.By;

import com.generics.BaseTest;
import com.generics.Pojo;
import com.pageFactory.common.SAUCE.SauceDemoDashboardPage;

import io.cucumber.java.en.Then;

public class SauceDemoDashStepDefination 
{

	private Pojo objPojo;
	private SauceDemoDashboardPage objSauceDemoDashbordPage;
	private String testData;

	public SauceDemoDashStepDefination (BaseTest pojo) throws Exception {
		objPojo = pojo.initializeWebEnvironment();
		objSauceDemoDashbordPage = new SauceDemoDashboardPage(objPojo);

	}
	
	/**
	 * @ScriptName :Verify that you’ve been logged in successfully and navigated to the products page
	  * @Author : Amol Sule
	 **/
	@Then("Verify that you’ve been logged in successfully and navigated to the products page {string}")
	public void verify_that_you_ve_been_logged_in_successfully_and_navigated_to_the_products_page(String URL) {
	    
		objSauceDemoDashbordPage.verifyURL(URL);
	}
	
	
	/**
	 * @ScriptName :Click on DropDown and Select Option
	  * @Author : Amol Sule
	 **/
	@Then("Select {string} dropdown and option {string}  to Add the most expensive products to your cart.")
	public void select_dropdown_and_option_to_add_the_most_expensive_products_to_your_cart(String dropdown, String Option) 
	{
		
		By drpProduct = By.xpath("//select[@class='"+dropdown+"']");
		objPojo.getObjWrapperFunctions().elementHighlight(drpProduct);
		objPojo.getObjWrapperFunctions().selectDropDownOption(drpProduct, Option);
		objPojo.getObjWrapperFunctions().waitFor(2);
	}
	
	/**
	 * @ScriptName :Add the most expensive two products
	  * @Author : Amol Sule
	 **/
	@Then("Add the most expensive two products {string} and {string} to Cart")
	public void add_the_most_expensive_two_products_and_to_cart(String string1, String string2) {
	    
		objSauceDemoDashbordPage.AddCartMostExpensive(string1,string2);

		}
	
	/**
	 * @ScriptName :Add the less expensive two products
	  * @Author : Amol Sule
	 **/
	@Then("Add the less expensive two products {string} and {string} to Cart")
	public void add_the_less_expensive_two_products_and_to_cart(String string1, String string2) {
		objSauceDemoDashbordPage.AddCartLessExpensive(string1,string2);
	    
	}
	
	/**
	 * @ScriptName :Add Name (Z to A)  two products
	  * @Author : Amol Sule
	 **/
	@Then("Add Z to A  two products {string} and {string} to Cart")
	public void add_z_to_a_two_products_and_to_cart(String string1, String string2) {
		objSauceDemoDashbordPage.AddCartZToA(string1,string2);
	   
	}
	
	/**
	 * @ScriptName :Add Name (A to Z)  two products
	  * @Author : Amol Sule
	 **/
	@Then("Add Name \\(A to Z)  two products {string} and {string} to Cart")
	public void add_name_a_to_z_two_products_and_to_cart(String string1, String string2) {
	    
		objSauceDemoDashbordPage.AddCartAToZ(string1,string2);
	}


	
	
	
	/**
	 * @ScriptName :Click on  cart button
	  * @Author : Amol Sule
	 **/
	@Then("Click on  cart button")
	public void click_on_cart_button() {
		objSauceDemoDashbordPage.Cart();
	   
	}
	
	/**
	 * @ScriptName :Verify URL
	  * @Author : Amol Sule
	 **/
	@Then("Verify that you’ve been navigated to {string} page.")
	public void verify_that_you_ve_been_navigated_to_page(String URL) {
		objSauceDemoDashbordPage.verifyURL(URL);
	}
	
	/**
	 * @ScriptName :Verify Product
	  * @Author : Amol Sule
	 **/
	
	@Then("Verify that the previously selected products {string} and {string} are displayed at the page.")
	public void verify_that_the_previously_selected_products_and_are_displayed_at_the_page(String string1, String string2) {
	    
		objSauceDemoDashbordPage.verifyProduct(string1,string2);
	}

	/**
	 * @ScriptName :Click Button
	  * @Author : Amol Sule
	 **/
	@Then("Click on the {string} button")
	public void click_on_the_button(String buttonName) 
	{
		By btnCheckOut = By.xpath("//button[@id='"+buttonName+"']");
		objPojo.getObjWrapperFunctions().waitFor(2);
		objPojo.getObjUtilities().logReporter("Click on "+buttonName+" ",
					objPojo.getObjWrapperFunctions().click(btnCheckOut));
	    
	}
	
	/**
	 * @ScriptName :Fill First Name,Last Name and Postal Code
	  * @Author : Amol Sule
	 **/
	@Then("Fill {string} and {string} and {string} on information page.")
	public void fill_and_and_on_information_page(String username, String password, String zipcode) 
	{
		// Set First Name
		testData = objPojo.getObjUtilities().dpString("FIRSTNAME");
		if (!testData.equals("")) {
			objSauceDemoDashbordPage.setFirstName(testData);

		}
		
		// Set Last Name
		testData = objPojo.getObjUtilities().dpString("LASTNAME");
			if (!testData.equals("")) {
				objSauceDemoDashbordPage.setLast(testData);

				}
				
		// Set Postal Code
		testData = objPojo.getObjUtilities().dpString("ZIPCODE");
			if (!testData.equals("")) {
				objSauceDemoDashbordPage.setPostalCode(testData);

				}
	}
	
	/**
	 * @ScriptName :Click On Continue Button
	  * @Author : Amol Sule
	 **/
	@Then("Click on the continue button")
	public void click_on_the_continue_button() {
		By btnContinue = By.xpath("//input[@id='continue']");
		objPojo.getObjWrapperFunctions().waitFor(2);
		objPojo.getObjUtilities().logReporter("Click on Continue ",
					objPojo.getObjWrapperFunctions().click( btnContinue));
	    
	}
	
	/**
	 * @ScriptName :Verify Overview Page
	  * @Author : Amol Sule
	 **/
	@Then("Verify that you’ve been navigated to the “Overview” page")
	public void verify_that_you_ve_been_navigated_to_the_overview_page() 
	{
		By overview=By.xpath("//span[@class='title']");
		
		objPojo.getObjWrapperFunctions().elementHighlight(overview);
		String expPage="Checkout: Overview";
		String actPage=objPojo.getObjWrapperFunctions().getText(overview, "text");
		objPojo.getObjUtilities().logReporter("Overview Page Verified ", expPage, actPage,expPage.equals(actPage) );
		
	}
	
	/**
	 * @ScriptName :Verify the Items total amount before taxes for Price (high to low)
	  * @Author : Amol Sule
	 **/
	
	@Then("Verify the Items total amount before taxes for {string}")
	public void verify_the_items_total_amount_before_taxes_for(String string) 
	{
		By firstPrice=By.xpath("//div[@class='inventory_item_price'][normalize-space()='$49.99']");
		String a=objPojo.getDriver().findElement(firstPrice).getText().toString();
		String a1=a.replace("$","");
		float a2=Float.valueOf(a1);
		System.out.println("First Item value a2=$"+a2);
		
		
		
		
        By secondPrice=By.xpath("//div[@class='inventory_item_price'][normalize-space()='$29.99']");
		String b=objPojo.getDriver().findElement(secondPrice).getText().toString();
		String b1=b.replace("$","");
		float b2=Float.valueOf(b1);
		System.out.println("Second Item value b2=$"+b2);
		
		
		By beforTaxTotal=By.xpath("//div[@class='summary_subtotal_label']");
		String berforeTax=objPojo.getDriver().findElement(beforTaxTotal).getText().toString();
		System.out.println(berforeTax);
		
		float d=a2+b2;
		String total="Item total: $"+d;
		
		
			objPojo.getObjUtilities().logReporter("Items total before tax verified ", berforeTax, total,berforeTax.equals(total) );

	}
	
	/**
	 * @ScriptName :Verify the Items total amount before taxes for Price (low to high)
	  * @Author : Amol Sule
	 **/
	@Then("Verify the Items total amount before taxes for Price \\(low to high)")
	public void verify_the_items_total_amount_before_taxes_for_price_low_to_high() 
	{
		By firstPrice=By.xpath("//div[@class='inventory_item_price'][normalize-space()='$7.99']");
		String a=objPojo.getDriver().findElement(firstPrice).getText().toString();
		String a1=a.replace("$","");
		float a2=Float.valueOf(a1);
		System.out.println("First Item value a2=$"+a2);
		
		
		
		
        By secondPrice=By.xpath("//div[@class='inventory_item_price'][normalize-space()='$9.99']");
		String b=objPojo.getDriver().findElement(secondPrice).getText().toString();
		String b1=b.replace("$","");
		float b2=Float.valueOf(b1);
		System.out.println("Second Item value b2=$"+b2);
		
		
		By beforTaxTotal=By.xpath("//div[@class='summary_subtotal_label']");
		String berforeTax=objPojo.getDriver().findElement(beforTaxTotal).getText().toString();
		System.out.println(berforeTax);
		
		float d=a2+b2;
		String total="Item total: $"+d;
		
		
			objPojo.getObjUtilities().logReporter("Items total before tax verified ", berforeTax, total,berforeTax.equals(total) ); 
	}
	
	/**
	 * @ScriptName :Verify the Items total amount before taxes Name (Z to A)
	  * @Author : Amol Sule
	 **/
	@Then("Verify the Items total amount before taxes Name \\(Z to A)")
	public void verify_the_items_total_amount_before_taxes_name_z_to_a() 
	{
		By firstPrice=By.xpath("//div[@class='inventory_item_price'][normalize-space()='$15.99']");
		String a=objPojo.getDriver().findElement(firstPrice).getText().toString();
		String a1=a.replace("$","");
		float a2=Float.valueOf(a1);
		System.out.println("First Item value=$"+a2);
		
		
		
		
        By secondPrice=By.xpath("//div[@class='inventory_item_price'][normalize-space()='$7.99']");
		String b=objPojo.getDriver().findElement(secondPrice).getText().toString();
		String b1=b.replace("$","");
		float b2=Float.valueOf(b1);
		System.out.println("Second Item value=$"+b2);
		
		
		By beforTaxTotal=By.xpath("//div[@class='summary_subtotal_label']");
		String berforeTax=objPojo.getDriver().findElement(beforTaxTotal).getText().toString();
		System.out.println(berforeTax);
		
		float d=a2+b2;
		String total="Item total: $"+d;
		
		
			objPojo.getObjUtilities().logReporter("Items total before tax verified ", berforeTax, total,berforeTax.equals(total) ); 
	
	   
	}
	
	/**
	 * @ScriptName :Verify the Items total amount before taxes Name (A to Z)
	  * @Author : Amol Sule
	 **/
	
	@Then("Verify the Items total amount before taxes Name \\(A to Z)")
	public void verify_the_items_total_amount_before_taxes_name_a_to_z() {
		By firstPrice=By.xpath("//div[@class='inventory_item_price'][normalize-space()='$29.99']");
		String a=objPojo.getDriver().findElement(firstPrice).getText().toString();
		String a1=a.replace("$","");
		float a2=Float.valueOf(a1);
		System.out.println("First Item value=$"+a2);
		
		
		
		
        By secondPrice=By.xpath("//div[@class='inventory_item_price'][normalize-space()='$9.99']");
		String b=objPojo.getDriver().findElement(secondPrice).getText().toString();
		String b1=b.replace("$","");
		float b2=Float.valueOf(b1);
		System.out.println("Second Item value=$"+b2);
		
		
		By beforTaxTotal=By.xpath("//div[@class='summary_subtotal_label']");
		String berforeTax=objPojo.getDriver().findElement(beforTaxTotal).getText().toString();
		System.out.println(berforeTax);
		
		float d=a2+b2;
		String total="Item total: $"+d;
		
		
			objPojo.getObjUtilities().logReporter("Items total before tax verified ", berforeTax, total,berforeTax.equals(total) ); 
	
	}
	
	
	/**
	 * @ScriptName :Verify Thank You and Order Dispatch Message
	  * @Author : Amol Sule
	 **/
	@Then("Verify {string} and {string} messages")
	public void verify_and_messages(String expThankYou, String expOrderMessage) 
	{

		By lblThankYou=By.xpath("//h2[normalize-space()='Thank you for your order!']");
		objPojo.getObjWrapperFunctions().elementHighlight(lblThankYou);
		String actThankYou=objPojo.getObjWrapperFunctions().getText(lblThankYou, "text");
		objPojo.getObjUtilities().logReporter("Thank You Message Verified", expThankYou, actThankYou,expThankYou.equals(actThankYou) );
		
		
		By lblOrderDispatch=By.xpath("//div[@class='complete-text']");
		objPojo.getObjWrapperFunctions().elementHighlight(lblOrderDispatch);
		String actOrderMessage=objPojo.getObjWrapperFunctions().getText(lblOrderDispatch, "text");
		objPojo.getObjUtilities().logReporter("Order Dispatched Message Verified", expOrderMessage, actOrderMessage,expOrderMessage.equals(actOrderMessage) );
	}


	
}
