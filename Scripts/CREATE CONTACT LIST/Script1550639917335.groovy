import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://campaignsopend.techactive.tk/#/admin_login')

WebUI.setText(findTestObject('Object Repository/creating contact/Page_Opend/input_Admin Login_email_id'), 'admin@opend.com')

WebUI.setEncryptedText(findTestObject('Object Repository/creating contact/Page_Opend/input_Admin Login_password'), '4nvbrPglk7k=')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/creating contact/Page_Opend/a_Contacts'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/creating contact/Page_Opend/a_Create Contact'))

WebUI.delay(4)

WebUI.selectOptionByValue(findTestObject('Object Repository/creating contact/Page_Opend/select_Please Select Publisher'), 
    '2', true)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/creating contact/Page_Opend/input__validate input-field ng'), 'TEST LIST 1')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/creating contact/Page_Opend/label_siddu'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/creating contact/Page_Opend/button_Select'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/creating contact/Page_Opend/input__validate input-field ng'), '10')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/creating contact/Page_Opend/label_Kidz Wear'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/creating contact/Page_Opend/label_Party wear'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/creating contact/Page_Opend/button_Select'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/creating contact/Page_Opend/select_Select Country'), '79', true)

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/creating contact/Page_Opend/input__validate input-field ng_7'), 'QATEST')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/creating contact/Page_Opend/button_Add'))

WebUI.delay(5)

WebUI.closeBrowser()

