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

WebUI.navigateToUrl('https://demoqa.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Desktop/Iframes/Page_DEMOQA/h5_Alerts, Frame  Windows'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Desktop/Iframes/Page_DEMOQA/h5_Alerts, Frame  Windows'))

WebUI.click(findTestObject('Object Repository/Desktop/Iframes/Page_DEMOQA/h5_Alerts, Frame  Windows'))

WebUI.scrollToElement(findTestObject('Object Repository/Desktop/Iframes/Page_DEMOQA/span_Frames'), 0)

WebUI.click(findTestObject('Object Repository/Desktop/Iframes/Page_DEMOQA/span_Frames'))

WebUI.verifyElementText(findTestObject('Object Repository/Desktop/Iframes/Page_DEMOQA/h1_This is a sample page'), 'This is a sample page', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Desktop/Iframes/Page_DEMOQA/span_Nested Frames'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Desktop/Iframes/Page_DEMOQA/span_Nested Frames'))

WebUI.click(findTestObject('Object Repository/Desktop/Iframes/Page_DEMOQA/span_Nested Frames'))

WebUI.verifyElementText(findTestObject('Object Repository/Desktop/Iframes/Page_DEMOQA/h1_Nested Frames'), 'Nested Frames')

WebUI.click(findTestObject('Object Repository/Desktop/Iframes/Page_DEMOQA/p_Child Iframe'))

WebUI.verifyElementText(findTestObject('Object Repository/Desktop/Iframes/Page_DEMOQA/p_Child Iframe'), 'Child Iframe')

WebUI.verifyElementText(findTestObject('Object Repository/Desktop/Iframes/Page_DEMOQA/p_Child Iframe'), 'Child Iframe')

