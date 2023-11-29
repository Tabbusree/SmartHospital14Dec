Feature: Testing the functionality of the smart hospital

Background:
   Given User enters into the User Login page
    
    @MyAppointments
    Scenario: Testing Appointment Functionlaity
    When User Clicks  MyAppointment
    And User Clicks AddAppointment  
    Then User Enters All the details 
    And User Click Save button
    Then User Search using Appointment number 
    And User downloads Showing details as PDF
    
    @Pharmacy 
    Scenario: Testing Pharmacy Functionality
    When User Clicks Pharmacy
    Then User will be redirected to the Pharmacy Page
    Then User checks Search functionality with Doctor name 
    And User Downloads the details in ExcelFormat
    
    @ToDoCalendar
    Scenario: Testing Calendar Functionality
    When User Clicks Calendar button
    Then User Should moved to another Page 
    And User should Click on ToDo button 
    Then User will be Shown up with Pop-Up Box and Should send values to be added
    And User Clicks Save button 
    And User Should See the Todo added into Calendar
    
                                                 
    
   
