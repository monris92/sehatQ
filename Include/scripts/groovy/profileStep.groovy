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



class profileStep {
	@And("user navigate url to profil page")
	def	navigateUrlProfil(){
		WebUI.waitForPageLoad(20)
		WebUI.navigateToUrl('https://www.sehatq.com/profil')
	}
	@Then("system show feature keluarga is present and ClickAble")
	def keluargaLinkPresent(){
		WebUI.verifyElementPresent(findTestObject('webSite/profilPage/featureKeluarga'), 0)
	}
	@And("system show feature aktivitas is present and ClickAble")
	def aktivitasLinkPresent(){
		WebUI.verifyElementPresent(findTestObject('webSite/profilPage/featureAktivitas'), 0)
	}
	@And("system show feature kalender is present and ClickAble")
	def kalenderLinkPresent(){
		WebUI.verifyElementPresent(findTestObject('webSite/profilPage/featureKalender'), 0)
	}
	@And("system show feature healt record is present and ClickAble")
	def healtRecordLinkPresent(){
		WebUI.verifyElementPresent(findTestObject('webSite/profilPage/featureHealthRecord'), 0)
	}
}