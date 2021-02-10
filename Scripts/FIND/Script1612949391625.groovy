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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.ebay.com/')

WebUI.click(findTestObject('Object Repository/i_Shop by category_gh-shop-ei'))

WebUI.click(findTestObject('Object Repository/a_Cell phones  accessories'))

WebUI.click(findTestObject('Object Repository/a_Cell Phones  Smartphones'))

WebUI.click(findTestObject('Object Repository/button_More refinementsMore refinements'))

WebUI.click(findTestObject('Object Repository/span_Screen Size'))

WebUI.click(findTestObject('Object Repository/input_Screen Size_c3-subPanel-Screen20Size__b978e6'))

WebUI.click(findTestObject('Object Repository/div_Price'))

WebUI.setText(findTestObject('Object Repository/input_IDR_x-textrange__input x-textrange__i_f04732'), '10000000')

WebUI.setText(findTestObject('Object Repository/range'), '30000000')

WebUI.click(findTestObject('Object Repository/span_Item Location'))

WebUI.click(findTestObject('Object Repository/label_Asia'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/button_Apply'))

WebUI.verifyElementVisible(findTestObject('Verify banner'))

WebUI.closeBrowser()