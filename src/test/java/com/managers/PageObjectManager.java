package com.managers;

import com.pages.Book;
import com.pages.Confirmation;
import com.pages.Login;
import com.pages.Search;
import com.pages.Select;

public class PageObjectManager {

	private Book bk;
	private Confirmation cf;
	private Login lg;
	private Search sr;
	private Select sl;

	public Book getBk() {
		return (bk == null) ? bk = new Book() : bk;
	}

	public Confirmation getCf() {
		return (cf == null) ? cf = new Confirmation() : cf;
	}

	public Login getLg() {
		return (lg == null) ? lg = new Login() : lg;
	}

	public Search getSr() {
		return (sr == null) ? sr = new Search() : sr;
	}

	public Select getSl() {
		return (sl == null) ? sl = new Select() : sl;
	}
}
