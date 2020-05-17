package com.sehatq.android
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



class signUpButtonStepAndroid {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user already open sehatQ app")
	def userHasInstallAppsAlready() {
		Mobile.startExistingApplication('com.she.sehatq', FailureHandling.STOP_ON_FAILURE)
	}

	@And("user is on homepage sehatQ android")
	def systemShowHomePage() {
		Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)
	}

	@When("user tap icon Login")
	def userTapIconLogin() {
		Mobile.tap(findTestObject('android/Login/btn_iconLogin'), 0)
	}
	@And("user tap 'continue with email'")
	def userTapContinue(){
		Mobile.tap(findTestObject('android/Login/login_Continue with email'), 0)
	}
	@Then("system show login Page")
	def verifyLoginPage(){
		Mobile.verifyElementText(findTestObject('android/Login/loginText'), 'Login')
	}
	@And("System show 'belum terdaftar? sign up disini'")
	def verifyBtnSignUp(){
		Mobile.verifyElementVisible(findTestObject('android/Login/btnSignUp'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	}
	@And("user Tap button 'belum terdaftar? sign up disini'")
	def tapBtnSignUp(){
		Mobile.tap(findTestObject('android/Login/btnSignUp'), 0)
	}
}