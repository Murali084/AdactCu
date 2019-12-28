package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseCls;

public class Login extends BaseCls {
	
	public Login() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="username")
	List<WebElement>lsttxtUname;
	
	@FindBy(id="password")
	List<WebElement>lsttxtPass;
	
	@FindBy(id="login")
	List<WebElement>lstBtn;

	public List<WebElement> getLsttxtUname() {
		return lsttxtUname;
	}

	public List<WebElement> getLsttxtPass() {
		return lsttxtPass;
	}

	public List<WebElement> getLstBtn() {
		return lstBtn;
	}
	

}
