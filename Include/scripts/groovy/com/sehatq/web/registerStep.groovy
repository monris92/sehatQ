package com.sehatq.web
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class registerStep {
	@Given("user navigates to register page")
	def navigateToRegisterPage(){
		WebUI.openBrowser('https://www.sehatq.com/daftar/email')
		WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)
	}
	@When("user input userRegister name (.*)")
	def userInputName(String userName){
		WebUI.setText(findTestObject('webSite/homePage/registerPage/inputName_registerPage'), userName)
	}
	@And("user input emailRegister name (.*)")
	def userInputEmailName(String emailName){
		WebUI.setText(findTestObject('webSite/homePage/registerPage/inputEmail_registerPage'), emailName)
	}
	@And("user input passwordRegister (.*)")
	def userInputPassword(String password){
		WebUI.setText(findTestObject('webSite/homePage/registerPage/inputPassword_registerPage'), password)
	}
	@And("user click checkBox register agreement")
	def checkBox(){
		WebUI.check(findTestObject('webSite/homePage/registerPage/agreement_checkBox'))
	}

	@And("user click continue btnRegister")
	def continueBtn(){
		WebUI.click(findTestObject('webSite/homePage/registerPage/btn_continueRegister'), FailureHandling.STOP_ON_FAILURE)
	}
	@Then("sistem direct url sehatq.com as user registered (.*)")
	def profilNameVerify(String userName){
		WebUI.verifyTextPresent(userName, false)
	}
}


