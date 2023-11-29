package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataClass {
public String url,Billno,Email,CardNumber,Expiry,CVC,Zipcode,Component,Message,date,message,appointmentNo,doctorname,email,cardno,expiry,cvv,title,tododate,URL,ChildName,Weight,Birth,Phone,AddreSS,CaseId,Fathername,Report,Case,staffid,Fname,Mail,IncomeName,IncomeDate,incomeAmount,ExpenseName,E_date,amount1,death,guardian,NoticeDate,publish;

	
	public DataClass(){
		data();
	}
	public void data() {
		File file = new File("C:\\Git\\Test\\Test\\smartHospital\\src\\test\\resources\\data.properties");
		FileInputStream fio =null;
		try {
			fio = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		try {
			prop.load(fio);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		url = prop.getProperty("url");
		Billno = prop.getProperty("Billno");
		Email = prop.getProperty("Email");
		CardNumber = prop.getProperty("CardNumber");
		Expiry = prop.getProperty("Expiry");
		CVC = prop.getProperty("CVC");
		Zipcode = prop.getProperty("Zipcode");
		Component = prop.getProperty("Component");
		Message = prop.getProperty("Message");
		date = prop.getProperty("date");
		message = prop.getProperty("message");
		appointmentNo = prop.getProperty("appointmentNo");
		doctorname = prop.getProperty("doctorname");
		email = prop.getProperty("email");
		cardno = prop.getProperty("cardno");
		expiry = prop.getProperty("expiry");
		cvv = prop.getProperty("cvv");
		//zipcode = prop.getProperty(zipcode);
		title = prop.getProperty("title");
		tododate = prop.getProperty("tododate");
		URL=prop.getProperty("URL");
		ChildName=prop.getProperty("ChildName");
		Weight=prop.getProperty("Weight");
		Birth=prop.getProperty("Birth");
		Phone=prop.getProperty("Phone");
		AddreSS=prop.getProperty("AddreSS");
		CaseId=prop.getProperty("CaseId");
		Fathername=prop.getProperty("Fathername");
		Report=prop.getProperty("Report");
		Case=prop.getProperty("Case");
		 death = prop.getProperty("death");
		 guardian=prop.getProperty("guardian");
		
		staffid=prop.getProperty("staffid");
		Fname=prop.getProperty("Fname");
		
		Mail=prop.getProperty("Mail");
		IncomeName=prop.getProperty("IncomeName");
		IncomeDate=prop.getProperty("IncomeDate");
		incomeAmount=prop.getProperty("incomeAmount");
		ExpenseName=prop.getProperty("ExpenseName");
		E_date=prop.getProperty("E_date");
		amount1=prop.getProperty("amount1");
		
		NoticeDate=prop.getProperty("NoticeDate");
		publish=prop.getProperty("publish");
	}

}
