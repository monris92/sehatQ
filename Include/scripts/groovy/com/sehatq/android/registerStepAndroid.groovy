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



class registerStepAndroid {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user is on sign up Page")
	def verifySignUpPage() {
		Mobile.verifyElementText(findTestObject('android/Login/signUp/textSignUpAndroid'), 'Sign up', FailureHandling.STOP_ON_FAILURE)
	}

	@When("user input name (.*) field")
	def userInpurNameRegister(String nameRegister) {
		Mobile.setText(findTestObject('android/Login/signUp/input_nameSignUp'), nameRegister, 0)
	}

	@And("user input email (.*) field")
	def userInpurEmailRegister(String emailRegister) {
		Mobile.setText(findTestObject('android/Login/signUp/input_emailSignUp'), emailRegister, 0)
	}

	@And("user input password (.*) field")
	def userInpurpasswordRegister(String passwordRegister) {
		Mobile.setText(findTestObject('android/Login/signUp/input_passwordSignUp'), passwordRegister, 0)
	}
	@And("user check privacy policy checkBox")
	def userChekTermConditionSignUp(){
		Mobile.checkElement(findTestObject('android/Login/signUp/CheckBox_TermConditionsSignUp'), 0)
	}
	@And("user tap button Lanjutkan")
	def tapBtnlanjutkan(){
		Mobile.tap(findTestObject('android/Login/signUp/btn_lanjutkan'), 0)
	}
	@Then("system direct open onboarding profil Page")
	def directOnboardingPage(){
		Mobile.verifyElementText(findTestObject('android/Login/signUp/onBoard_profilPage/textOnboardingProfil_Lengkapi Profil'),
			'Lengkapi Profil')
	}
	@And("user tap 'skip' button")
	def skipOnboardingPage(){
		Mobile.tap(findTestObject('android/Login/signUp/onBoard_profilPage/btnSkip_signUp'), 0)
	}
	@And("user tap 'ya' option allert for completed register")
	def confirmSkipOnboardingPage(){
		Mobile.tap(findTestObject('android/Login/signUp/onBoard_profilPage/skipAllertProfil_Ya'), 0)
	}
}