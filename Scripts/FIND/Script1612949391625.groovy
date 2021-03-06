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

WebUI.navigateToUrl('https://dev-aws.amartha.id/login')

WebUI.setText(findTestObject('Object Repository/input_RESET_email'), 'selena@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/input_RESET_password'), '3OCunMiHqemD5oZEZdOMLg==')

WebUI.click(findTestObject('Object Repository/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/button_LANJUT'))

WebUI.click(findTestObject('Object Repository/button_LANJUT'))

WebUI.click(findTestObject('Object Repository/button_SELESAI'))

WebUI.click(findTestObject('Object Repository/div_Hi,Sustrp_HamburgerMenu_wrapper__1mo0S'))

WebUI.click(findTestObject('Object Repository/span_Marketplace'))

WebUI.click(findTestObject('Object Repository/button_LANJUT (1)'))

WebUI.click(findTestObject('Object Repository/path'))

WebUI.click(findTestObject('Object Repository/button_SELESAI (1)'))

WebUI.click(findTestObject('Object Repository/img'))

WebUI.click(findTestObject('Object Repository/button_Lanjut ke Pembayaran'))

WebUI.click(findTestObject('Object Repository/path (1)'))

WebUI.click(findTestObject('Object Repository/button_Bayar - Rp0'))

WebUI.click(findTestObject('Object Repository/button_Bayar - Rp0'))

WebUI.closeBrowser()

