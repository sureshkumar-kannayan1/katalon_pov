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

WebUI.scrollToElement(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/h5_Forms'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/h5_Forms'))

WebUI.click(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/h5_Forms'))

WebUI.scrollToElement(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/span_Practice Form'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/span_Practice Form'))

WebUI.click(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/span_Practice Form'))

WebUI.scrollToElement(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/input_Name_firstName'), 
    0)

WebUI.setText(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/input_Name_firstName'), 'Suresh')

WebUI.scrollToElement(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/input_Name_lastName'), 
    0)

WebUI.setText(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/input_Name_lastName'), 'Kumar')

WebUI.scrollToElement(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/input_Email_userEmail'), 
    0)

WebUI.setText(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/input_Email_userEmail'), 'test@gmail.com')

WebUI.scrollToElement(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/label_Male'), 0)

WebUI.click(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/label_Male'))

WebUI.scrollToElement(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/input_(10 Digits)_userNumber'), 
    0)

WebUI.setText(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/input_(10 Digits)_userNumber'), 
    '9952368678')

WebUI.setText(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'), 
    '18 Sep 2024')

WebUI.click(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/select_190019011902190319041905190619071908_246ee1'), 
    '1990', true)

WebUI.click(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/div_4'))

WebUI.scrollToElement(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/div_Subjects_subjects-auto-complete__value-_d244cf'), 
    0)

WebUI.click(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/div_Subjects_subjects-auto-complete__value-_d244cf'))

WebUI.scrollToElement(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/input_Subjects_subjectsInput'), 
    0)

WebUI.setText(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/input_Subjects_subjectsInput'), 
    'Test please ignore it')

WebUI.scrollToElement(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/label_Sports'), 0)

WebUI.click(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/label_Sports'))

WebUI.click(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/label_Reading'))

WebUI.click(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/label_Music'))

WebUI.scrollToElement(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/textarea_Current Address_currentAddress'), 
    0)

WebUI.setText(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/textarea_Current Address_currentAddress'), 
    'Test address')

WebUI.scrollToElement(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/div_Select State'), 
    0)

WebUI.click(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/div_Select State'))

WebUI.click(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/div_Uttar Pradesh'))

WebUI.click(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/div_Select City'))

WebUI.click(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/div_Lucknow'))

WebUI.scrollToElement(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/button_Submit'), 0)

WebUI.click(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Desktop/All actions with scroll/Page_DEMOQA/div_Thanks for submitting the form'), 
    'Thanks for submitting the form')

