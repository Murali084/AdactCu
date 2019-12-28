package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	
	public static void generateJVMReport(String jsonLoc) {
		Configuration con = new Configuration(new File(System.getProperty("user.dir")+"src\\test\\resources\\Reports\\Macy.json"),"Macy");
		con.addClassifications("Browser", "Chrome");
		con.addClassifications("Version", "v79");
		con.addClassifications("OS", "Windows 8");
		con.addClassifications("Sprint", "10");
		List<String>lstJsonFIle= new ArrayList<String>();
		lstJsonFIle.add(jsonLoc);
		ReportBuilder builder = new ReportBuilder(lstJsonFIle,con);
		builder.generateReports();
		
		

	}

}
