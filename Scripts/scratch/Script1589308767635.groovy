import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

not_run: Mobile.startApplication('C:\\Users\\faris\\Downloads\\sehatQ1.0.24.apk', false)

Mobile.startExistingApplication('com.she.sehatq', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android/Login/btn_iconLogin'), 0)

Mobile.tap(findTestObject('android/Login/login_Continue with email'), 0)

Mobile.verifyElementText(findTestObject('android/Login/loginText'), 'Login')

Mobile.verifyElementVisible(findTestObject('android/Login/btnSignUp'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('android/Login/btnSignUp'), 0)

Mobile.verifyElementText(findTestObject('android/Login/signUp/textSignUpAndroid'), 'Sign up', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('android/Login/signUp/CheckBox_TermConditionsSignUp'), '', 0)

Mobile.checkElement(findTestObject('android/Login/signUp/CheckBox_TermConditionsSignUp'), 0)

Mobile.tap(findTestObject('android/Login/signUp/btn_lanjutkan'), 0)

Mobile.verifyElementText(findTestObject('android/Login/signUp/onBoard_profilPage/textOnboardingProfil_Lengkapi Profil'), 
    'Lengkapi Profil')

Mobile.tap(findTestObject('android/Login/signUp/onBoard_profilPage/btnSkip_signUp'), 0)

Mobile.tap(findTestObject('android/Login/signUp/onBoard_profilPage/skipAllertProfil_Ya'), 0)

