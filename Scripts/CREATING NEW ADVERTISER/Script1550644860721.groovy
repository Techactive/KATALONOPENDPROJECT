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

WebUI.setText(findTestObject('Object Repository/createnewadvertiser/Page_Opend/input_Admin Login_email_id'), 'admin@opend.com')

WebUI.setEncryptedText(findTestObject('Object Repository/createnewadvertiser/Page_Opend/input_Admin Login_password'), '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/createnewadvertiser/Page_Opend/button_Sign In'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/createnewadvertiser/Page_Opend/a_Advertisers'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/createnewadvertiser/Page_Opend/button_Add New Advertiser'))

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/createnewadvertiser/Page_Opend/input__validate input-field ng'), 'TEST ADVERTISER')

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/createnewadvertiser/Page_Opend/select_Please select a Country'), 
    '79', true)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/createnewadvertiser/Page_Opend/select_Please select a City'), 
    '4860', true)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/createnewadvertiser/Page_Opend/select_Please select a Functio'), 
    '3', true)

WebUI.delay(3)

WebUI.click(findTestObject('createnewadvertiser/advnewids/Page_Opend/input__validate input-field in'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/createnewadvertiser/Page_Opend/label_automation testing'))

WebUI.delay(2)

WebUI.click(findTestObject('createnewadvertiser/advnewids/Page_Opend/button_Select'))

WebUI.delay(2)

WebUI.setText(findTestObject('createnewadvertiser/advnewids/Page_Opend/input__sub_id'), '6465')

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/createnewadvertiser/Page_Opend/select_Please select a timezon'), 
    'Europe/London', true)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/createnewadvertiser/Page_Opend/input__validate input-field ng_5'), 'TEST')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/createnewadvertiser/Page_Opend/input__validate input-field ng_9'), 'ADv')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/createnewadvertiser/Page_Opend/input__email_id'), 'siddannna@active.agency')

WebUI.delay(3)

not_run: WebUI.click(findTestObject('createnewadvertiser/advnewids/Page_Opend/button_Add'))

WebUI.delay(5)

WebUI.closeBrowser()

