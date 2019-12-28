package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseCls;

public class Book extends BaseCls {
	
	public Book() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="first_name")
	List<WebElement>lstFname;
	
	@FindBy(id="last_name")
	List<WebElement>lstLname;
	
	@FindBy(id="address")
	List<WebElement>lstAdd;
	
	@FindBy(id="cc_num")
	List<WebElement>lstCard;
	
	@FindBy(id="cc_type")
	List<WebElement>lstCtype;
	
	@FindBy(id="cc_exp_month")
	List<WebElement>lstExmon;
	
	@FindBy(id="cc_exp_year")
	List<WebElement>lstExyr;
	
	@FindBy(id="cc_cvv")
	List<WebElement>lstCvv;
	
	@FindBy(id="book_now")
	List<WebElement>lstBtnbk;

	public List<WebElement> getLstFname() {
		return lstFname;
	}

	public List<WebElement> getLstLname() {
		return lstLname;
	}

	public List<WebElement> getLstAdd() {
		return lstAdd;
	}

	public List<WebElement> getLstCard() {
		return lstCard;
	}

	public List<WebElement> getLstCtype() {
		return lstCtype;
	}

	public List<WebElement> getLstExmon() {
		return lstExmon;
	}

	public List<WebElement> getLstExyr() {
		return lstExyr;
	}

	public List<WebElement> getLstCvv() {
		return lstCvv;
	}

	public List<WebElement> getLstBtnbk() {
		return lstBtnbk;
	}

	

	

}
