package com.hrms.pages;

import javax.xml.stream.XMLReporter;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;


public class Logoutpage extends BaseClass  {
	//objects
	static By link_logout  =  By.linkText("Logout");
	    //fun:
	public static void logout() {
	driver.findElement(link_logout).click();
	XMLReporter.log("Logout completed ");
	}
	}


