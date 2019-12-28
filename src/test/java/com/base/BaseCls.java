package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseCls {

	public static WebDriver driver;

	public static void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Projects\\AdactinCu\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void Waitload() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	public static void openurl(String url) {
		driver.get(url);

	}

	public static void type(WebElement loc, String val) {
		loc.sendKeys(val);

	}

	public static void clk(WebElement loc) {
		loc.click();
	}

	public static void slttext(WebElement loc, String s1) {

		Select s = new Select(loc);
		s.selectByVisibleText(s1);
	}

	public static void sltval(WebElement loc, String s1) {

		Select s = new Select(loc);
		s.selectByValue(s1);
	}
	public static String getvalueAtr(WebElement loc) {
		return loc.getAttribute("value");}
	

}
