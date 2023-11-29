package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocators {
	//loginLocators
	@FindBy(xpath="//a[@href='https://demo.smart-hospital.in/site/userlogin']")//login
	public WebElement clickuserLogin;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement clicksignIn;
	
	//DashBoard AddAppointments
	@FindBy(xpath ="//span[text()='My Appointments']")
	public WebElement clickmyAppointments;
	
	@FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
	public WebElement clickaddAppointment;
	
	@FindBy (xpath = "//input[@id='dates']")
	public WebElement setDate;
	
	@FindBy(xpath ="//select[@id='specialist']")
	public WebElement selectSpecialist;
	
	@FindBy(xpath="//select[@name='doctor']")
	public WebElement selectDoctor;
	
	@FindBy(xpath ="//select[@name='global_shift']")
	public WebElement selectShift;
	
	@FindBy(xpath ="//select[@id='shift_id']")
	public WebElement selectSlot;
	
	@FindBy(xpath="//textarea[@id='message']")
	public WebElement setMessage;
	
	@FindBy(xpath="//select[@name=\"live_consult\"]")
	public WebElement setConsultation;
	
	@FindBy(id="slot_6")
	public WebElement setSlot;
	
	@FindBy(xpath="//button[@id='formaddbtn']")
	public WebElement clickSave;
	
	@FindBy(xpath = "//div[@id='DataTables_Table_0_filter']//child::label//input")
	public WebElement search2;
	
	@FindBy(xpath ="//a[@class='btn btn-default dt-button buttons-pdf buttons-html5']")
	public WebElement clicksaveASPDF;
	
	//Pharmacy
	
	@FindBy(xpath ="//a[@href='https://demo.smart-hospital.in/patient/dashboard/bill']")
	public WebElement clickPharmacy;
	
	@FindBy(xpath="//input[@type='search']")
	public WebElement search;
	
	@FindBy(xpath ="//i[@class='fa fa-file-excel-o']")
	public WebElement clicksaveAsExcel;
	
	//Pathology
	
	@FindBy(xpath ="//a[@href='https://demo.smart-hospital.in/patient/dashboard/search']")
	public WebElement pathology;
	
	@FindBy(xpath ="(//button[@type='button'])[2]")
	public WebElement clickPay;
	
	@FindBy (xpath ="//button[@class='btn btn-info pull-right payment_pathology']")
	public WebElement clickAdd;
	
	@FindBy(xpath ="//button[@class='stripe-button-el']")
	public WebElement clickPayWithCard;
	
	@FindBy(xpath ="//html[@class=' ']//body[1]")
	public WebElement email;
	
	@FindBy(xpath ="//input[@id='card_number']")
	public WebElement cardNo;
	
	@FindBy(xpath ="//input[@id='cc-exp']")
	public WebElement expiryTime;
	
	@FindBy(xpath ="id=\"cc-csc\"")
	public WebElement cvv;
	
	//@FindBy(xpath="//div[@class='zipCodeInput input bottom']")
	//public WebElement zipcode;
	
	@FindBy(xpath ="//span[@class='iconTick']")
	public WebElement pay;
	
	//ToDoCalender
	
	@FindBy(xpath="//a[@href='https://demo.smart-hospital.in/user/calendar/']")
	public WebElement calender;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-sm pull-right']")
	public WebElement addTODO;
	
	@FindBy(xpath="//input[@id='task-title']")
	public WebElement title;
	
	@FindBy(xpath="//input[@id='task-date']")
	public WebElement todoDate;
	
	@FindBy(xpath ="//button[@type='submit']")
	public WebElement save;
	
	//assert locators
	@FindBy(xpath="//td[@class='fc-event-container'][2]//child::span[@class='fc-title']")
	public WebElement valid;
	
	@FindBy(xpath="//button[@class='toast-close-button']")
	public WebElement close;
}
	
	


