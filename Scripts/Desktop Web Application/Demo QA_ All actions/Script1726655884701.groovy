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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://demoqa.com/')

WebUI.click(findTestObject('Object Repository/Desktop/All actions/Page_DEMOQA/h5_Forms'))

WebUI.click(findTestObject('Object Repository/Desktop/All actions/Page_DEMOQA/span_Practice Form'))

WebUI.setText(findTestObject('Object Repository/Desktop/All actions/Page_DEMOQA/input_Name_firstName'), 'Test')

WebUI.setText(findTestObject('Object Repository/Desktop/All actions/Page_DEMOQA/input_Name_lastName'), 'Ignore')

WebUI.setText(findTestObject('Object Repository/Desktop/All actions/Page_DEMOQA/input_Email_userEmail'), 'test@gmail.com')

WebUI.click(findTestObject('Object Repository/Desktop/All actions/Page_DEMOQA/label_Male'))

WebUI.setText(findTestObject('Object Repository/Desktop/All actions/Page_DEMOQA/input_(10 Digits)_userNumber'), '9876543211')

WebUI.setText(findTestObject('Object Repository/Desktop/All actions/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'), 
    '06 Sep 2024')

WebUI.click(findTestObject('Object Repository/Desktop/All actions/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Desktop/All actions/Page_DEMOQA/select_190019011902190319041905190619071908_246ee1'), 
    '1991', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Desktop/All actions/Page_DEMOQA/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Desktop/All actions/Page_DEMOQA/div_1'))

WebUI.click(findTestObject('Object Repository/Desktop/All actions/Page_DEMOQA/div_Subjects_subjects-auto-complete__value-_d244cf'))

WebUI.setText(findTestObject('Object Repository/Desktop/All actions/Page_DEMOQA/input_Subjects_subjectsInput'), 'Testing purpose ignore it')

WebUI.click(findTestObject('Object Repository/Desktop/All actions/Page_DEMOQA/label_Sports'))

WebUI.click(findTestObject('Object Repository/Desktop/All actions/Page_DEMOQA/label_Reading'))

WebUI.setText(findTestObject('Object Repository/Desktop/All actions/Page_DEMOQA/textarea_Current Address_currentAddress'), 
    'Test Street\nTest city and state. 90001')

WebUI.click(findTestObject('Object Repository/Desktop/All actions/Page_DEMOQA/div_Current Address'))

WebUI.click(findTestObject('Object Repository/Desktop/All actions/Page_DEMOQA/div_Select State'))

WebUI.click(findTestObject('Object Repository/Desktop/All actions/Page_DEMOQA/div_Rajasthan'))

WebUI.click(findTestObject('Object Repository/Desktop/All actions/Page_DEMOQA/div_Select City'))

WebUI.click(findTestObject('Object Repository/Desktop/All actions/Page_DEMOQA/div_Jaipur'))

WebUI.click(findTestObject('Object Repository/Desktop/All actions/Page_DEMOQA/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Desktop/All actions/Page_DEMOQA/td_Test Ignore'), 'Test Ignore')

