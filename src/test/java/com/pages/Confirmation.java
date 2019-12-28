package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseCls;

public class Confirmation extends BaseCls {
	
	public Confirmation() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="order_no")
	List<WebElement>lstOrder;

	public List<WebElement> getLstOrder() {
		return lstOrder;
	}
	
		

}
