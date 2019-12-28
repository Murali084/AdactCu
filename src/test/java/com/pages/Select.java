package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseCls;

public class Select extends BaseCls {
	
	public Select() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="radiobutton_0")
	List<WebElement>lstSelradio;
	
	@FindBy(id="continue")
	List<WebElement>lstSelcon;

	public List<WebElement> getLstSelradio() {
		return lstSelradio;
	}

	public List<WebElement> getLstSelcon() {
		return lstSelcon;
	}


	

}
