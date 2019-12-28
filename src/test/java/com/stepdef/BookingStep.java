package com.stepdef;

import org.openqa.selenium.WebElement;

import com.base.BaseCls;
import com.managers.PageObjectManager;
import com.pages.Book;
import com.pages.Confirmation;
import com.pages.Login;
import com.pages.Search;
import com.pages.Select;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class BookingStep extends BaseCls {
	PageObjectManager po =new PageObjectManager();
	//Login l;

	@Given("User is on Adactin home page")
	public void user_is_on_Adactin_home_page() {
		launchbrowser();
		openurl("https://adactin.com/HotelApp/");
	}

	@SuppressWarnings("deprecation")
	@When("User logs in with {string} and {string}")
	public void user_logs_in_with_and(String s1, String s2) {
		//l = new Login();
		WebElement txtname = po.getLg().getLsttxtUname().get(0);
		WebElement txtpass = po.getLg().getLsttxtPass().get(0);
		type(txtname, s1);
		Assert.assertEquals("Verified Username",s1,getvalueAtr(txtname));
		type(txtpass, s2);
		Assert.assertEquals("Verified Password",s2,getvalueAtr(txtpass));
	}

	@Then("User clicks the login button and logs in")
	public void user_clicks_the_login_button_and_logs_in() {
		clk(po.getLg().getLstBtn().get(0));

	}

	@Then("User selects {string},{string},{string},{string},{string},{string},{string},{string} and click Search button")
	public void user_selects_and_click_Search_button(String s1, String s2, String s3, String s4, String s5, String s6,
			String s7, String s8) {
		Waitload();
		//Search s = new Search();
		slttext(po.getSr().getLstLoc().get(0), s1);
		slttext(po.getSr().getLstHotel().get(0), s2);
		slttext(po.getSr().getLstRoomtype().get(0), s3);
		slttext(po.getSr().getLstRoomNo().get(0), s4);
		po.getSr().getLstInDate().get(0).clear();
		type(po.getSr().getLstInDate().get(0), s5);
		po.getSr().getLstOutDate().get(0).clear();
		type(po.getSr().getLstOutDate().get(0), s6);
		slttext(po.getSr().getLstAdults().get(0), s7);
		slttext(po.getSr().getLstChilds().get(0), s8);
		clk(po.getSr().getLstSearch().get(0));
	}

	@Then("User selects the Hotel from list of options and clicks continue and navigates to Booking page")
	public void user_selects_the_Hotel_from_list_of_options_and_clicks_continue_and_navigates_to_Booking_page() {
	//Select s1 = new Select();
	clk(po.getSl().getLstSelradio().get(0));
	clk(po.getSl().getLstSelcon().get(0));
	
	}

	@Then("User Enters {string},{string},{string},{string},{string},{string},{string},{string} and clicks on Book now")
	public void user_Enters_and_clicks_on_Book_now(String s1, String s2, String s3, String s4,
			String s5, String s6, String s7, String s8) {
		//Book b = new Book();
		type(po.getBk().getLstFname().get(0), s1);
		type(po.getBk().getLstLname().get(0), s2);
		type(po.getBk().getLstAdd().get(0), s3);
		type(po.getBk().getLstCard().get(0), s4);
		slttext(po.getBk().getLstCtype().get(0), s5);
		slttext(po.getBk().getLstExmon().get(0), s6);
		slttext(po.getBk().getLstExyr().get(0), s7);
		type(po.getBk().getLstCvv().get(0), s8);
		clk(po.getBk().getLstBtnbk().get(0));

	}

	@Then("User navigates to Booking confirmation page and prints the Order no")
	public void user_navigates_to_Booking_confirmation_page_and_prints_the_Order_no() {
		//Confirmation o = new Confirmation();		
		System.out.println(po.getCf().getLstOrder().get(0).getAttribute("value"));
	}

}
