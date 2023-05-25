package com.pageFactory.common.SAUCE;

import org.openqa.selenium.By;

import com.generics.Pojo;

public class LoginPage {
	private Pojo objPojo;

	public LoginPage(Pojo pojo) {
		objPojo = pojo;
	}

	
	
	//Xpaths
	
	private By inpUserName = By.xpath("//input[@id='user-name']");
	private By inpPassword = By.xpath("//input[@id='password']");
	
	
	public void setUsername(String value) {
		objPojo.getObjWrapperFunctions().elementHighlight(inpUserName);
		objPojo.getObjUtilities().logReporter("Enter Username in SauceDemo Login Page", value,
				objPojo.getObjWrapperFunctions().setText(inpUserName, value));
	}


	public void setPassword(String value) {
		objPojo.getObjWrapperFunctions().elementHighlight(inpPassword);
		objPojo.getObjUtilities().logReporter("Enter Password in SauceDemo Login Page", value,
				objPojo.getObjWrapperFunctions().setText(inpPassword, value));
		
	}
}
