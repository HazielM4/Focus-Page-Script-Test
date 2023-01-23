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

WebUI.navigateToUrl('https://www.google.com/')

WebUI.setText(findTestObject('Object Repository/PageScriptObjects/Page_Google/input__q'), 'Focus Services')

WebUI.sendKeys(findTestObject('Object Repository/PageScriptObjects/Page_Google/input__q'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('Object Repository/PageScriptObjects/Page_Focus Services - Buscar con Google/cite_httpswww.focusservices.com'), 
    0)

WebUI.click(findTestObject('Object Repository/PageScriptObjects/Page_Focus Services - Buscar con Google/h3_Focus Services  Beyond Expectations'))

WebUI.verifyElementPresent(findTestObject('Object Repository/PageScriptObjects/Page_Focus Services  Beyond Expectations/a_Now Hiring'), 
    0)

WebUI.click(findTestObject('Object Repository/PageScriptObjects/Page_Focus Services  Beyond Expectations/span_Locations'))

WebUI.verifyLinksAccessible(['https://www.focusservices.com/locations/#north-america'])

WebUI.click(findTestObject('Object Repository/PageScriptObjects/Page_Locations  Focus Services/span_Central America'))

WebUI.verifyTextPresent('El Salvador & Nicaragua', false)

WebUI.click(findTestObject('Object Repository/PageScriptObjects/Page_Locations  Focus Services/span_Asia'))

WebUI.verifyTextPresent('Bacolod City, Philippines', false)

