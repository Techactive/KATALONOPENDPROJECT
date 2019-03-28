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

WebUI.setText(findTestObject('Object Repository/NEWOPENDCPM/Page_Opend/input_Admin Login_email_id'), 'admin@opend.com')

WebUI.setEncryptedText(findTestObject('Object Repository/NEWOPENDCPM/Page_Opend/input_Admin Login_password'), '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/NEWOPENDCPM/Page_Opend/button_Sign In'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/NEWOPENDCPM/Page_Opend/a_Campaigns'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/NEWOPENDCPM/Page_Opend/a_Start New Campaign'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/NEWOPENDCPM/Page_Opend/select_Please Select Advertise'), '2', 
    true)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/NEWOPENDCPM/Page_Opend/input_Campaign Name_camp_name_'), 'TEST CAMPAIGN 2')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/NEWOPENDCPM/Page_Opend/label_Normal charges'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/NEWOPENDCPM/Page_Opend/select_Please Select Audience'), '2', 
    true)

WebUI.delay(3)

WebUI.click(findTestObject('newidsfromspy/Page_Opend/input_Campaign Category_valida'))

WebUI.delay(3)

WebUI.click(findTestObject('newidsfromspy/Page_Opend/label_fashion'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/NEWOPENDCPM/Page_Opend/button_Select'))

WebUI.delay(3)

WebUI.click(findTestObject('newidsfromspy/Page_Opend/input_Audience Interests_valid'))

WebUI.delay(3)

WebUI.click(findTestObject('newidsfromspy/Page_Opend/label_Party wear'))

WebUI.delay(2)

WebUI.click(findTestObject('newidsfromspy/Page_Opend/label_Kidz Wear'))

WebUI.delay(5)

WebUI.click(findTestObject('newidsfromspy/Page_Opend/AIselectbtn'))

WebUI.delay(3)

WebUI.click(findTestObject('newidsfromspy/Page_Opend/input_Select Publisher_validat'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/NEWOPENDCPM/Page_Opend/label_Jack'))

WebUI.delay(3)

WebUI.click(findTestObject('newidsfromspy/Page_Opend/Pubselectbtn'))

WebUI.delay(3)

WebUI.click(findTestObject('NEWSPYIDS/Page_Opend/label_Normal charges'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/NEWOPENDCPM/Page_Opend/button_Proceed'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/NEWOPENDCPM/Page_Opend/input_Subject Line_subjectone'), 'GOOD MORNING ')

WebUI.delay(5)

WebUI.click(findTestObject('newidsfromspy/Page_Opend/input_From Creatives_uploadBtn'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/NEWOPENDCPM/Page_Opend/button_Select'))

WebUI.delay(5)

WebUI.click(findTestObject('NEWOPENDCPM/Step2prcdbtn'))

WebUI.delay(5)

WebUI.click(findTestObject('NEWOPENDCPM/step3prcdbrn'))

WebUI.delay(5)

not_run: WebUI.click(findTestObject('NEWOPENDCPM/Startcampbtn'))

WebUI.delay(5)

WebUI.closeBrowser()

