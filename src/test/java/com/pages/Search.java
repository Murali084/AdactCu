package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseCls;

public class Search extends BaseCls {
	
	public Search() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="location")
	List<WebElement>lstLoc;
	
	@FindBy(id="hotels")
	List<WebElement>lstHotel;
	
	@FindBy(id="room_type")
	List<WebElement>lstRoomtype;
	
	@FindBy(id="room_nos")
	List<WebElement>lstRoomNo;
	
	@FindBy(id="datepick_in")
	List<WebElement>lstInDate;
	
	@FindBy(id="datepick_out")
	List<WebElement>lstOutDate;
	
	@FindBy(id="adult_room")
	List<WebElement>lstAdults;
	
	@FindBy(id="child_room")
	List<WebElement>lstChilds;
	
	@FindBy(id="Submit")
	List<WebElement>lstSearch;

	public List<WebElement> getLstLoc() {
		return lstLoc;
	}

	public List<WebElement> getLstHotel() {
		return lstHotel;
	}

	public List<WebElement> getLstRoomtype() {
		return lstRoomtype;
	}

	public List<WebElement> getLstRoomNo() {
		return lstRoomNo;
	}

	public List<WebElement> getLstInDate() {
		return lstInDate;
	}

	public List<WebElement> getLstOutDate() {
		return lstOutDate;
	}

	public List<WebElement> getLstAdults() {
		return lstAdults;
	}

	public List<WebElement> getLstChilds() {
		return lstChilds;
	}

	public List<WebElement> getLstSearch() {
		return lstSearch;
	}
	
	
	
	

	

}
