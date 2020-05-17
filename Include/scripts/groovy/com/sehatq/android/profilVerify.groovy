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



class profilVerify {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("home Page apps sehatQ")
	def openExistingApps() {
		Mobile.startExistingApplication('com.she.sehatq', FailureHandling.STOP_ON_FAILURE)
	}

	@When("user tap icon Profil")
	def userTapIconProfil() {
		Mobile.tap(findTestObject('android/homePageAndroid/btnProfile1'), 0)
	}

	@Then("I verify the feature keluarga is present")
	def verifykeluargaPresent() {
		Mobile.verifyElementText(findTestObject('android/profilPage/TextViewKeluarga'), 'Keluarga')
	}
	@And("I verify the feature aktivitas is present")
	def verifyAktivitasPresent() {
		Mobile.verifyElementText(findTestObject('android/profilPage/TextViewAktivitas'), 'Aktivitas')
	}
	@And("I verify the feature Health Record is present")
	def verifyhealtRecordPresent() {
		Mobile.verifyElementText(findTestObject('android/profilPage/TextViewHealth Record'), 'Health Record')
	}
	@And("I verify the feature kalender is present")
	def verifyKalenderPresent() {
		Mobile.verifyElementText(findTestObject('android/profilPage/TextViewKalender'), 'Kalender')
	}
}