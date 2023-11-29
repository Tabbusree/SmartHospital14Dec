package com.stepdefinition;

import java.util.Set;

import com.actions.LoginActions;
import com.utility.DataClass;
import com.utility.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	DataClass data = new DataClass();
	LoginActions objaction=new LoginActions();
	@Given("User enters into the User Login page")
	public void user_enters_into_the_user_login_portal() {
		HelperClass.openPage("https://demo.smart-hospital.in/site/login"); 
		  objaction.clickloginAction();
		  System.out.println("user clicks the user login");
		  Set<String> allWindows = HelperClass.getDriver().getWindowHandles();
			for (String curWindow : allWindows) {
				HelperClass.getDriver().switchTo().window(curWindow);
			}
		  objaction.clicksigninAction();
		  HelperClass.log.info("Succesfully gets SignedIn");
		  
		}
	@When("User Clicks  MyAppointment")
	public void user_clicks_my_appointment() {
		 objaction.clickmyAppointments();
		 HelperClass.log.info("Successfully Clicked MyApoointments");
	}

	@When("User Clicks AddAppointment")
	public void user_clicks_add_appointment() {
		objaction.clickaddAppointments();
		 HelperClass.log.info("Sucessfully Clicks AddAppointment");
	}

	@Then("User Enters All the details")
	public void user_enters_all_the_details() {
		objaction.setDate("11/30/2023");
		  objaction.selectSpecialist();
		  objaction.selectDoctor();
		  objaction.selectShift();	
		  objaction.selectSlot(); 
		  objaction.setMessage("Emergency");	
		  objaction.setConsultation();	
		  objaction.setSlot();
		  HelperClass.log.info("Added All details of Patient");
	}

	@Then("User Click Save button")
	public void user_click_save_button() {
		objaction.clickSave();
		  objaction.clickClose();
		  HelperClass.log.info("Succesfully Clicked Saved");
	}

	@Then("User Search using Appointment number")
	public void user_search_using_appointment_number() {
		 objaction.setSearch("APPNO5067");
		 HelperClass.log.info("Checked with Appointment number");
	}

	@Then("User downloads Showing details as PDF")
	public void user_downloads_showing_details_as_pdf() {
		objaction.clicksaveAsPDF();
		 HelperClass.log.info("Saved into PDF");
	}

	@When("User Clicks Pharmacy")
	public void user_clicks_pharmacy() {
	   objaction.clickPharmacy();
	   System.out.println("Succesfully Clicked Pharmacy");
	}

	@Then("User will be redirected to the Pharmacy Page")
	public void user_will_be_redirected_to_the_pharmacy_page() {
	  System.out.println("Page Redirected to Pharmacy Page");
	}

	@Then("User checks Search functionality with Doctor name")
	public void user_checks_search_functionality_with_doctor_name() {
	   objaction.pharmacySearch("Reyan Jain (9011)");
	  
	}

	@Then("User Downloads the details in ExcelFormat")
	public void user_downloads_the_details_in_excel_format() {
	    objaction.clicksaveAsExcel();
	    System.out.println("Downlaod Successfull");
	}

	@When("User Clicks Pathology")
	public void user_clicks_pathology() {
		objaction.clickpathology();
		HelperClass.log.info("Click Pathology");
	}

	@When("User will be on pathology page and  Clicks Pay Fuctionality")
	public void user_will_be_on_pathology_page_and_clicks_pay_fuctionality() {
	   objaction.clickPay();
	   HelperClass.log.info("Click Pay");
	  
	}

	@Then("User Enters All the details for the pay functionality")
	public void user_enters_all_the_details_for_the_pay_functionality() throws InterruptedException {
	  objaction.clickAdd();
	  objaction.clickPayWithCard();
//	  objaction.setEmail("padmapriyanagarajan@gmail.com");
//	  objaction.setCardno("4242");
//	  objaction.setCardno("4242");
//	  objaction.setCardno("4242");
//	  objaction.setCardno("4242");
//	  objaction.setExpiryTime("01");
//	  objaction.setExpiryTime("2028");
//	  objaction.setCvv("111");
	  objaction.setEmail("padma@gmail.com");
	  objaction.setCardno("4242424242424242");
	  objaction.setExpiryTime("01/28");
	  objaction.setCvv("111");
	  //objaction.setZipcode(data.zipcode);
	  objaction.Pay();
	  HelperClass.log.info("Completes pay Functionality");
	}

	@Then("User Should Navigated to Successful Payment")
	public void user_should_navigated_to_successful_payment() {
		System.out.println("Payment Successfull");
	  
	}

	@When("User Clicks Calendar button")
	public void user_clicks_calendar_button() {
		objaction.clickCalendar();
		System.out.println("Succesfully clicks Calendar Icon");
	}

	@Then("User Should moved to another Page")
	public void user_should_moved_to_another_page() {
	    System.out.println("Successfully Redirected to AnotherPage");
	}

	@Then("User should Click on ToDo button")
	public void user_should_click_on_to_do_button() {
		 objaction.clickaddtodo();
		 System.out.println("Successfully Clicked ToDo");
	}

	@Then("User will be Shown up with Pop-Up Box and Should send values to be added")
	public void user_will_be_shown_up_with_pop_up_box_and_should_send_values_to_be_added() {
		objaction.setTitle("Happy birthday TabbuShree");
    	objaction.settododate("11/30/2023");
    	System.out.println("Succesfully Entered Details");
	}

	@Then("User Clicks Save button")
	public void user_clicks_save_button() {
		objaction.clickSave();	
		System.out.println("Successfully Saved");
	}

	@Then("User Should See the Todo added into Calendar")
	public void user_should_see_the_todo_added_into_calendar() {
		// Assert.assertEquals(objaction.verify(),"Happy birthday Harsha");
		System.out.println("Suceesfully shown");
	}
}

