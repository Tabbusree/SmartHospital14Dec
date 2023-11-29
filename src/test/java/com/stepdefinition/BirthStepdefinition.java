package com.stepdefinition;


import com.actions.BirthAndDeathActions;
import com.locators.BirthAndDeathLocators;
import com.utility.DataClass;
import com.utility.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BirthStepdefinition extends DataClass {
	BirthAndDeathActions objBDA=new BirthAndDeathActions();
	BirthAndDeathLocators objloc=new BirthAndDeathLocators();
	DataClass util=new DataClass();
    
	//<!--------------------------------------------------------------------------Birth And Death -------------------------------------------------------------------->
	
	
	@Given("user need to be login into the page")
	public void user_need_to_be_login_into_the_page() {
	   HelperClass.openPage("https://demo.smart-hospital.in/site/login");
	   objBDA.clickAdmin();
	   objBDA.Sigin();
	  HelperClass.log.info("succesfully launched the url and pass the Credentials ");
	   
	
	}

	@Given("the user is on the birth and death records page")
	public void the_user_is_on_the_birth_and_death_records_page() {
		
		//objBDA.setAdmin();
		 //  objBDA.Sigin();
	  HelperClass.log.info(" successfully scroll to the birth and death");
	   }

	@When("the user clicks on Birth and Death Record")
	public void the_user_clicks_on_birth_and_death_record() {
		objBDA.BirthAnddeath();
		  HelperClass.log.info(" clicked the birth and death");
		
	 
	}

	@When("the user clicks on Birth Record")
	public void the_user_clicks_on_birth_record() {
		objBDA.birthRecord();
		 HelperClass.log.info(" Choose the birth Record");
	}

	@When("the user clicks on Add Birth Record")
	public void the_user_clicks_on_add_birth_record() {
		objBDA.AddbirthRecord();
		 HelperClass.log.info(" click the Add Birth Record ");
		
	  
	}

	@When("the user enters the required values for birth record")
	public void the_user_enters_the_required_values_for_birth_record() {
		 objBDA.AddBirthRecord(ChildName, Weight, Birth, CaseId, Phone, AddreSS, Fathername);
		 HelperClass.log.info("user sends the parameters to the required field");
	}

	@When("the user clicks Save")
	public void the_user_clicks_save() throws InterruptedException {
		objBDA.AddRecord();
		HelperClass.log.info("Added Record Successfully !!");
	}

	@Then("the birth record should be successfully saved")
	public void the_birth_record_should_be_successfully_saved() {
	  System.out.println("Here we need to perform Assertion ");
	}

	@When("the user clicks on Death Record")
	public void the_user_clicks_on_death_record() throws InterruptedException {
		//objBDA.BirthAnddeath();
		 HelperClass.log.info(" clicked the birth and death");
	   objBDA.deathrecord();
	   HelperClass.log.info(" User Choose the death Record");
	}

	@When("the user clicks on Add Death Record")
	public void the_user_clicks_on_add_death_record() throws InterruptedException { 
		objBDA.adddeathRecord();
		 HelperClass.log.info(" click the Add death Record ");
	}

	@When("the user enters valid entries for death record")
	public void the_user_enters_valid_entries_for_death_record() {
		objBDA.DeathRecord(Case,death,guardian);
		HelperClass.log.info(" need to enter the required field values");
	}

	@When("the user clicks Save Death Record")
	public void the_user_clicks_save_death_record() throws InterruptedException {
		objBDA.AddRecord();
		 HelperClass.log.info("user clicks the save Record");
	}

	@Then("the death record should be successfully saved")
	public void the_death_record_should_be_successfully_saved() {
	   System.out.println("here we need to assert the death record");
	}
	
	
	
	
	//<!-------------------------------------------------------------------------------------------FINANCE----------------------------------------------------->
	@Given("User is on the finance module")
	public void user_is_on_the_finance_module() {
		objBDA.Finances();
		System.out.println("User clicks the Finance Successfully!!");
		
	   
	}

	@When("user clicks on Income")
	public void user_clicks_on_income() {
		objBDA.Finances();
		objBDA.IncomeField();
	   System.out.println("User clicks the income");
	}

	@When("user clicks on  Add Income")
	public void user_clicks_on_add_income() {
		objBDA.Addincome();
	  System.out.println("User Successfully Clicked Add Income");
	}

	@When("user  needs to provide the {string} and {string} and {string}  and {string} and {string}")
	public void user_needs_to_provide_the_and_and_and_and(String name,String Invoicenumber,String date,String amount,String description ) throws InterruptedException {
		objBDA.IncomeDetails(name, Invoicenumber, date, amount, description);
		System.out.println("Successfully done by entering the required crenditals");
		
	   
	}

	@Then("user validates the income record")
	public void user_validates_the_income_record() {
		objBDA.IncomeSave();
	}

	@When("user clicks on Expenses")
	public void user_clicks_on_expenses() {
		//objBDA.Finances();
//		System.out.println("user click the Finance");
		objBDA.expenses();
		System.out.println("And choose the Expenses");
		
	}

	@When("user clicks on Add Expenses")
	public void user_clicks_on_add_expenses() {
		objBDA.addExpenses();
		System.out.println("user clicks the Add Expenses !!");
	}

	@When("user needs to enters the {string} and {string} and {string}  and {string} and {string}")
	public void user_needs_to_enters_the_and_and_and_and(String name,String Invoicenumber,String date,String amount,String description) throws InterruptedException {
	    objBDA.IncomeDetails(name, Invoicenumber, date, amount, description);
	    System.out.println("successfully send the credentials !!");
	}

	@When("user saves the expense record")
	public void user_saves_the_expense_record() {
		objBDA.ExpensesSave();
		System.out.println("User Successfully Save the Expenses Record !!q");
	}

	@Then("user validates the expense record")
	public void user_validates_the_expense_record() {
	   System.out.println("this is the expenses record");
	}


	//<!-----------------------------------------------------------------------HumanResource----------------------------------------------------------------->
	
	
	
	@Given("User is on the Human Resource module")
	public void user_is_on_the_human_resource_module() {
		objBDA.ClickHuman();
		System.out.println("User Clicks the Human Resource");
	  
	}

	@When("user clicks on Add Staff")
	public void user_clicks_on_add_staff() {
		objBDA.AddStaff(); 
	   System.out.println("user clicks the Add Staff");
	}

	@When("user fills in the required fields")
	public void user_fills_in_the_required_fields() {
		objBDA.HumanAction(staffid,Fname,date,Mail);
	   
	}

	@Then("user saves the staff information")
	public void user_saves_the_staff_information() {
		objBDA.HumanSubmit();
	    
	}

	@When("user clicks on Staff Attendance")
	public void user_clicks_on_staff_attendance() {
		objBDA.ClickHuman();
	}

	@When("user provides the staff attendance")
	public void user_provides_the_staff_attendance() {
		
		objBDA.staffAttendance();
		objBDA.ROle();
		
	}

	@When("user saves the attendance record")
	public void user_saves_the_attendance_record() {
		objBDA.staffSearch();
	}

	@Then("the attendance record is successfully saved")
	public void the_attendance_record_is_successfully_saved() {
	  System.out.println("user successfully search the record");
	}
	@Then("user need to logout")
	public void user_need_to_logout() {
		 objBDA.AdminProfile();
		 objBDA.LogOut();
	   
	}

	
	//<!------------------------------------------------------------Messaging------------------------------------------------------------------------------->
	
	@When("user click the messaging")
	public void user_click_the_messaging() {
		objBDA.messageIcon();
	   
	}

	@When("user click the post messaging")
	public void user_click_the_post_messaging() {
		objBDA.PostMessage();
		System.out.println("User click Post Message Successfully");
	}

	@When("user need to give value for required fields")
	public void user_need_to_give_value_for_required_fields() {
		objBDA.message_box(message);
	objBDA.Notice(NoticeDate);
	objBDA.SetPublishOn(publish);
	System.out.println("user provide the Credentials Successfully");
	}

	@When("user click the Send button")
	public void user_click_the_send_button() {
		objBDA.SendMSg();
		System.out.println("User Clicks the Send message Successfully !!");
	}







	
}
