package com.pageFactory.common.SAUCE;

import org.openqa.selenium.By;

import com.generics.Pojo;

public class SauceDemoDashboardPage {
	
	private Pojo objPojo;

	public SauceDemoDashboardPage(Pojo pojo) {
		objPojo = pojo;
	}

	// Xpath
	
	private By btnAddToCart1 = By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
	private By btnAddToCart2 = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	private By btnAddToCart3 = By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']");
	private By btnAddToCart4 = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
	private By btnAddToCart5 = By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']");
	private By btnAddToCart6 = By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']");
	private By btnAddToCart7 = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	private By btnAddToCart8 = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
	private By cartLink = By.xpath("//a[@class='shopping_cart_link']");
	private By lblProd1 = By.xpath("//div[normalize-space()='Sauce Labs Fleece Jacket']");
	private By lblProd2 = By.xpath("//div[normalize-space()='Sauce Labs Backpack']");
	private By inpFirstName = By.xpath("//input[@id='first-name']");
	private By inpLastName = By.xpath("//input[@id='last-name']");
	private By inpPostalCode = By.xpath("//input[@id='postal-code']");
	
	

    
	public void verifyURL(String url) 
	{
		// Verify URL
				
				String lnkProductURL=objPojo.getCurrentURL();
				
				if (url.equals(lnkProductURL)) {
					System.out.println("Matching!!!");
					objPojo.getObjUtilities().logReporter("URL Verified", url, lnkProductURL, true);
				} else {
					System.out.println("MisMatch!!!");
					objPojo.getObjUtilities().logReporter("URL Not Verified",  url, lnkProductURL, false);
				}
		
		
	}

      //Add to Most Expensive cart
	public void AddCartMostExpensive(String string1, String string2) {
		
		objPojo.getObjWrapperFunctions().waitFor(2);
		objPojo.getObjUtilities().logReporter("Click on Cart button to Add "+string1+" ",
				objPojo.getObjWrapperFunctions().click(btnAddToCart1));
		objPojo.getObjUtilities().setDataPool("product1", string1);
		
		
		
		objPojo.getObjWrapperFunctions().waitFor(2);
		objPojo.getObjUtilities().logReporter("Click on Cart button to Add "+string2+" ",
				objPojo.getObjWrapperFunctions().click(btnAddToCart2));
		objPojo.getObjUtilities().setDataPool("product2", string2);
		
	}
	
	//Add to Less Expensive cart
	public void AddCartLessExpensive(String string1, String string2) {
		objPojo.getObjWrapperFunctions().waitFor(2);
		objPojo.getObjUtilities().logReporter("Click on Cart button to Add "+string1+" ",
				objPojo.getObjWrapperFunctions().click(btnAddToCart3));
		objPojo.getObjUtilities().setDataPool("product1", string1);
		
		
		
		objPojo.getObjWrapperFunctions().waitFor(2);
		objPojo.getObjUtilities().logReporter("Click on Cart button to Add "+string2+" ",
				objPojo.getObjWrapperFunctions().click(btnAddToCart4));
		objPojo.getObjUtilities().setDataPool("product2", string2);
		
	}
	
	//Add Name Z TO A Expensive cart
	public void AddCartZToA(String string1, String string2) {
		objPojo.getObjWrapperFunctions().waitFor(2);
		objPojo.getObjUtilities().logReporter("Click on Cart button to Add "+string1+" ",
				objPojo.getObjWrapperFunctions().click(btnAddToCart5));
		objPojo.getObjUtilities().setDataPool("product1", string1);
		
		
		
		objPojo.getObjWrapperFunctions().waitFor(2);
		objPojo.getObjUtilities().logReporter("Click on Cart button to Add "+string2+" ",
				objPojo.getObjWrapperFunctions().click(btnAddToCart6));
		objPojo.getObjUtilities().setDataPool("product2", string2);
		
		
	}
	
	//Add Name A TO Z Expensive cart
	public void AddCartAToZ(String string1, String string2) {
		objPojo.getObjWrapperFunctions().waitFor(2);
		objPojo.getObjUtilities().logReporter("Click on Cart button to Add "+string1+" ",
				objPojo.getObjWrapperFunctions().click(btnAddToCart7));
		objPojo.getObjUtilities().setDataPool("product1", string1);
		
		
		
		objPojo.getObjWrapperFunctions().waitFor(2);
		objPojo.getObjUtilities().logReporter("Click on Cart button to Add "+string2+" ",
				objPojo.getObjWrapperFunctions().click(btnAddToCart8));
		objPojo.getObjUtilities().setDataPool("product2", string2);
		
	}
	
	
	
	
	
	

    //Click on Cart Button
	public void Cart() {
		objPojo.getObjWrapperFunctions().waitFor(2);
		objPojo.getObjUtilities().logReporter("Click on Cart button ",
				objPojo.getObjWrapperFunctions().click(cartLink));
		
		
	}

	
	
	public void verifyProduct(String string1, String string2)
	{
		 By lblProd1 = By.xpath("//div[normalize-space()='"+string1+"']");
			String prod1=objPojo.getObjUtilities().dpString("product1");
			String addedprod1=objPojo.getObjWrapperFunctions().getText(lblProd1,"text");
			objPojo.getObjUtilities().logReporter("Selected Product "+prod1+" displayed at the page ", prod1, addedprod1,prod1.equals(addedprod1) );

			
			By lblProd2 = By.xpath("//div[normalize-space()='"+string2+"']");
			String prod2=objPojo.getObjUtilities().dpString("product2");
			String addedprod2=objPojo.getObjWrapperFunctions().getText(lblProd2,"text");
			objPojo.getObjUtilities().logReporter("Selected Product "+prod2+" displayed at the page ", prod2, addedprod2,prod2.equals(addedprod2) );

		
	}

	//Set First Name
	
	public void setFirstName(String value) 
	{
		String FirstName=objPojo.getObjUtilities().getRandomFirstNameGenerator();
		objPojo.getObjWrapperFunctions().elementHighlight(inpFirstName);
		objPojo.getObjUtilities().logReporter("Enter First Name", FirstName,
				objPojo.getObjWrapperFunctions().setText(inpFirstName, FirstName));
		
	}

	//Set Last Name
	public void setLast(String value) {
		String LastName=objPojo.getObjUtilities().getRandomLastNameGenerator();
		objPojo.getObjWrapperFunctions().elementHighlight(inpLastName);
		objPojo.getObjUtilities().logReporter("Enter Last Name", LastName,
				objPojo.getObjWrapperFunctions().setText(inpLastName, LastName));
		
	}

	//Set Postal Name
	public void setPostalCode(String value) {
		String PostalCode=objPojo.getObjUtilities().getRandomString(6);
		objPojo.getObjWrapperFunctions().elementHighlight(inpPostalCode);
		objPojo.getObjUtilities().logReporter("Enter Postal Code", PostalCode,
				objPojo.getObjWrapperFunctions().setText(inpPostalCode, PostalCode));
		
	}

	

	

	

	

	

	

}
