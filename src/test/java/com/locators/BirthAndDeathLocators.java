package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BirthAndDeathLocators {
	@FindBy(xpath="(//a[contains(@class,'btn btn-primary')]//i)[2]")
	public WebElement admin;
	@FindBy(xpath="//div[@class='form-bottom']//button[1]")
	public WebElement signin;
	@FindBy(xpath="//a[@href='https://demo.smart-hospital.in/admin/birthordeath']//span[text()=' Birth & Death Record']")
	public WebElement Clickbirthanddeath;
	@FindBy(xpath="(//a[@href='https://demo.smart-hospital.in/admin/birthordeath'])[2]")
	public WebElement birthrecord;
	
	@FindBy(xpath="//i[@class='fa fa-plus']//parent::a[@class='btn btn-primary btn-sm birthrecord']")
	public WebElement addbirthrecord;
	
	//@FindBy(xpath="//div[contains(@class,'box-tools addmeeting')]//a[1]")
	//public WebElement plus;//this one need to edit
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	public WebElement childname;
	@FindBy(xpath="(//label[text()=' Gender']/following-sibling::select)[1]")
	public WebElement gender;
	@FindBy(xpath="(//input[@name='weight'])[1]")
	public WebElement weight;
	@FindBy(xpath="(//input[@name='birth_date'])[1]")
	public WebElement birthdate;
	@FindBy(xpath="(//input[@name='case_id'])[1]")// case id field is same is both birth and death
	public WebElement caseid;
	@FindBy(xpath="(//input[@class='form-control'])[3]")
	public WebElement phone;
	@FindBy(xpath="(//input[@name='address'])[1]")
	public WebElement address;
	@FindBy(xpath="(//input[@name='father_name'])[1]")
	public WebElement fathername;
	@FindBy(xpath= "(//label[text()='Report'])[2]/following::textarea")
	public WebElement textarea;
	@FindBy(xpath="//button[@class='btn btn-info']")// save btn is same for both birth and death
	public WebElement savebtn;
	
	//Death Locators
	
	@FindBy(xpath="//a[@href='https://demo.smart-hospital.in/admin/birthordeath/death']")
	public WebElement deathRecord;
	@FindBy(xpath="//a[@data-toggle='modal']")
	public WebElement adddeathRecord;
	@FindBy(xpath="//div[contains(@class,'box-tools pull-right')]//a[1]")
	public WebElement DeathCaseId;
	@FindBy(xpath="(//input[@name='death_date'])[1]")
	public WebElement Deathdate;
	
	@FindBy(xpath="(//label[text()='Guardian Name']/following-sibling::input)[1]")
	public WebElement gurdianname;
	@FindBy(xpath="//button[@id='formaddbtn']")
	public WebElement deathsave;
	
	//Human Resource Locators
	
	@FindBy(xpath="//span[text()='Human Resource']")
	public WebElement HumanResource;
	@FindBy(xpath="//a[@href='https://demo.smart-hospital.in/admin/staff/create']")
	public WebElement AddStaff;
	
	@FindBy(xpath="//input[@id='employee_id']")
	public WebElement StaffId;
	//dropdown
	@FindBy(xpath="//select[@id='role']")
	public WebElement StaffRole;
	
	@FindBy(xpath="//select[@id='designation']")
	public WebElement designation;
	@FindBy(xpath="//select[@id='department']")
	public WebElement department;
	//dropdown
	
	@FindBy(xpath="//button[text()='Select Specialist']")
	public WebElement Specialist;   //dropdow without select
	@FindBy(xpath="//input[@id='name']")
	public WebElement fname;
	@FindBy(id="input#surname")
	public WebElement lastname;
	@FindBy(xpath="//select[@name='gender']")
	public WebElement Gender; //dropdown select 
	@FindBy(id="dob")
	public WebElement dateofbirth;
	@FindBy(id="email")
	public WebElement email;
	@FindBy(xpath="//button[@class='btn btn-info pull-right']")
	public WebElement BasicInfoSubmit;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	public WebElement recordSaved;
	
//Staff atendance
	@FindBy(xpath="(//a[@class='btn btn-primary btn-sm btnMDb2'])[2]")
	public WebElement staffattendance;
	@FindBy(xpath="//select[@id='class_id']")
	public WebElement Role;
	@FindBy(xpath="//input[@id='date']")
	public WebElement staffattended;
	@FindBy(xpath="(//button[@name='search'])[3]")
	public WebElement staffsearch;
	
	
	
	//Finance 
	
	
	@FindBy(xpath="//i[@class='fas fa-money-bill-wave']/following-sibling::span[1]") //parent of income and expenses
	public WebElement Finance;
	
	@FindBy(xpath="//ul[@class='treeview-menu']//descendant::a[@href='https://demo.smart-hospital.in/admin/income']")
	public WebElement Income;
	@FindBy(xpath="//a[@class='btn btn-primary btn-sm addincome']")
	public WebElement AddIncome;
	@FindBy(xpath="//select[@id='inc_head_id']") //select 
	public WebElement IncomeHead;
	@FindBy(xpath="//input[@id='name']")
	public WebElement name;
	
	@FindBy(xpath="//input[@id='date']")
	public WebElement date;
	@FindBy(xpath="//input[@id='invoice_no']")
	public WebElement Invoice;
	@FindBy(xpath="//textarea[@id='description']")
	public WebElement description;
	@FindBy(xpath="//input[@id='amount']")
	public WebElement amount;
	@FindBy(xpath="//button[@id='add_incomebtn']")
	public WebElement incomebtn;
	//Expenses
	@FindBy(xpath="//a[text()=' Expenses']")
	public WebElement Expenses;
	@FindBy(xpath="//a[text()='  Add Expense']")
	public WebElement AddExpenses;
	@FindBy(xpath="//select[@id='exp_head_id']")
	public WebElement ExpensesHead;
	@FindBy(xpath="//input[@id='name']")
	public WebElement e_name;
	@FindBy(xpath="//input[@id='date']")
	public WebElement expensesDate;
	@FindBy(xpath="//input[@id='amount']")
	public WebElement expensesAmount;
	@FindBy(xpath="//button[@id='addexpensebtn']")
	public WebElement expensesButton;
	
	
//	//messaging
	@FindBy(xpath="//li//a//span[text()='Messaging']")
    public WebElement Messaging;
	@FindBy(xpath="//div[@class='box-tools pull-right']//a[text()=' Post New Message']")
	public WebElement PostMessaging;
	@FindBy(xpath="//input[@id='title']")
	public WebElement title;
	@FindBy(xpath="//iframe[@class='wysihtml5-sandbox']")
	public WebElement messageIframe;
	@FindBy(xpath="//body[@class='form-control wysihtml5-editor']")	
	public WebElement messageBox; //this is message box
	@FindBy(xpath="//input[@id='date']")
	public WebElement NoticeDate;
	@FindBy(xpath="//input[@id='publish_date']")
	public WebElement PublishON;
	@FindBy(xpath="(//button[@type='submit'])[3]")
	public WebElement Send;
	
	//logout
	@FindBy(xpath="//img[@class='topuser-image']")
	public WebElement Profile;
	
	//Assert
	@FindBy(xpath="//h4[text()='Jason  Abbot']")
	public WebElement AdminName;
	@FindBy(xpath="//a[@class='pull-right']")
	public WebElement Logout;
	
	
			

}
