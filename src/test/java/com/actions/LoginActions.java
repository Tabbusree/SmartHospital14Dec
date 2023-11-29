package com.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.locators.LoginLocators;
import com.utility.HelperClass;

public class LoginActions {
	LoginLocators logloc;
	Actions act = new Actions (HelperClass.getDriver());
	JavascriptExecutor js = (JavascriptExecutor)HelperClass.getDriver();
	WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(20));
	
	public LoginActions() {
		this.logloc = new LoginLocators();
		PageFactory.initElements(HelperClass.getDriver(), logloc);	
	}
	public void clickloginAction() {
		logloc.clickuserLogin.click();	
	}
	public void clicksigninAction() {
		act.moveToElement(logloc.clicksignIn).click().perform();
		//logloc.clicksignIn.click();
	}
	public void clickmyAppointments() {
		wait.until(ExpectedConditions.elementToBeClickable(logloc.clickmyAppointments));
		act.moveToElement(logloc.clickmyAppointments).click().perform();
		//logloc.clickmyAppointments.click();	
    }
	public void clickaddAppointments() {
		wait.until(ExpectedConditions.elementToBeClickable(logloc.clickaddAppointment));
		act.moveToElement(logloc.clickaddAppointment).click().perform();
	}
	public void setDate(String date) {
		logloc.setDate.sendKeys(date);
	}
	public void selectSpecialist() {
		wait.until(ExpectedConditions.elementToBeClickable(logloc.selectSpecialist)).click();
		act.moveToElement(logloc.selectSpecialist).click().perform();
		logloc.selectSpecialist.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
	}
	public void selectDoctor() {
		wait.until(ExpectedConditions.elementToBeClickable(logloc.selectDoctor)).click();
		act.moveToElement(logloc.selectDoctor).click().perform();
		logloc.selectDoctor.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	}
	public void selectShift() {
		wait.until(ExpectedConditions.elementToBeClickable(logloc.selectShift)).click();
		act.moveToElement(logloc.selectShift).click().perform();
		logloc.selectShift.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,
				Keys.ENTER);
	}
	public void selectSlot() {
		wait.until(ExpectedConditions.elementToBeClickable(logloc.selectSlot)).click();
		act.moveToElement(logloc.selectSlot).click().perform();
		logloc.selectSlot.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	}
	public void setMessage(String setMessage) {
		wait.until(ExpectedConditions.visibilityOf(logloc.setMessage)).sendKeys(setMessage);
		logloc.setMessage.sendKeys(setMessage);
	}
	public void setConsultation() {
		wait.until(ExpectedConditions.elementToBeClickable(logloc.setConsultation)).click();
		logloc.setConsultation.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
	}
	public void setSlot() {
		wait.until(ExpectedConditions.elementToBeClickable(logloc.setSlot)).click();
		act.moveToElement(logloc.setSlot).click().perform();
		//logloc.setSlot.click();
	}
	public void clickSave() {
		logloc.clickSave.click();
	}
	public void clickClose() {
		logloc.close.click();
	}
	public void setSearch(String search) {
		wait.until(ExpectedConditions.elementToBeClickable(logloc.search2)).click();
		logloc.search2.sendKeys(search);
	}
	public void clicksaveAsPDF() {
		wait.until(ExpectedConditions.elementToBeClickable(logloc.clicksaveASPDF)).click();
		logloc.clicksaveASPDF.click();
	}
	
	//PharmacyActions
	
	public void clickPharmacy() {
		//wait.until(ExpectedConditions.elementToBeClickable(logloc.clickPharmacy)).click();
		logloc.clickPharmacy.click();
	}
	public void pharmacySearch(String pharma) {
		wait.until(ExpectedConditions.elementToBeClickable(logloc.search)).click();
		logloc.search2.sendKeys(pharma);
	}
	public void clicksaveAsExcel() {
		wait.until(ExpectedConditions.elementToBeClickable(logloc.clicksaveAsExcel)).click();
		logloc.clicksaveAsExcel.click();
	}
	
	//PathologyActions
	
	public void clickpathology() {
		logloc.pathology.click();
	}
	
	public void clickPay() {
		logloc.clickPay.click();
	}
	public void clickAdd() {
		logloc.clickAdd.click();
	}
	public void clickPayWithCard() {
		wait.until(ExpectedConditions.elementToBeClickable(logloc.clickPayWithCard)).click();
		logloc.clickPayWithCard.click();
		 //HelperClass.getDriver().switchTo().frame(1);
		
	}
	public void setEmail(String email) throws InterruptedException {
		WebElement iframe = HelperClass.getDriver().findElement(By.xpath("//iframe[@name='stripe_checkout_app']"));
		 HelperClass.getDriver().switchTo().frame(iframe);
		//Alert alert = HelperClass.getDriver().switchTo().alert();
//		wait.until(ExpectedConditions.elementToBeClickable(logloc.email)).click();
		Thread.sleep(4000);
		act.moveToElement(logloc.email).sendKeys("email");
		logloc.email.sendKeys(email);
		//js.executeScript("arguments[1].value = arguments[0];","padma@gmail.com",logloc.email);
		//logloc.email.sendKeys(email,Keys.ENTER);
	}
	public void setCardno(String crdno) {
		//HelperClass.getDriver().switchTo().frame(1);
		//wait.until(ExpectedConditions.elementToBeClickable(logloc.cardNo)).click();
		//act.moveToElement(logloc.cardNo).click().perform();
		logloc.cardNo.sendKeys(crdno);
	}
	public void setExpiryTime(String expiry) {
		//HelperClass.getDriver().switchTo().frame(1);
		//wait.until(ExpectedConditions.elementToBeClickable(logloc.expiryTime)).click();
		//act.moveToElement(logloc.expiryTime).click().perform();
		logloc.expiryTime.sendKeys(expiry);
	}
	public void setCvv(String cvv) {
		//HelperClass.getDriver().switchTo().frame(1);
		//wait.until(ExpectedConditions.elementToBeClickable(logloc.cvv)).click();
		//act.moveToElement(logloc.cvv).click().perform();
		logloc.cvv.sendKeys(cvv);
	}
	//public void setZipcode(String zcode) {
		//logloc.zipcode.sendKeys(zcode);
	//}
	public void Pay() {
		wait.until(ExpectedConditions.elementToBeClickable(logloc.pay)).click();
		logloc.pay.click();
		HelperClass.getDriver().switchTo().parentFrame();
	}
	
	//ToDoCalendar
	
	public void clickCalendar() {
		logloc.calender.click();
	}
	public void clickaddtodo() {
		logloc.addTODO.click();
	}
	public void setTitle(String tit) {
		logloc.title.sendKeys(tit);
	}
	public void settododate(String dat) {
		logloc.todoDate.sendKeys(dat);
	}
	public void enterSave() {
		logloc.save.click();
	}
	public String verify() {
		return logloc.valid.getText();
	}
	public  void userloginDetails(String date,String setMessage,String search,String pharma,String amnt,String mail,String crdno,String expiry,String cvv,String tit,String dat) throws InterruptedException {
		setDate(date);
		setMessage(setMessage);
		setSearch(search);
		setTitle(tit);
		settododate(date);
		setEmail(mail);
		setCardno(crdno);
		setExpiryTime(expiry);
		setCvv(cvv);
		
		
		
		
	}
}
