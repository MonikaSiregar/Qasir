import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
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
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords

WebUI.waitForElementPresent(findTestObject('Profile/btnProfile'), 60)

WebUI.click(findTestObject('Profile/btnProfile'))

WebUI.click(findTestObject('Profile/btnUserProfile'))

String userDir = System.getProperty('user.dir')

String photoPath = userDir + '/Data Files/potoku.jpg'

WebUI.waitForElementVisible(findTestObject('Profile/btnEditPhoto'), 20)

//WebUI.click(findTestObject('Profile/btnEditPhoto'))
//WebUI.uploadFile(findTestObject('Profile/btnEditPhoto'), photoPath)
//WebUI.click(findTestObject('Profile/btnApplyPhoto'))

WebUI.setText(findTestObject('Profile/txtFirstName'), 'monika ulina')

WebUI.setText(findTestObject('Profile/txtLastName'), 'siregar')

WebUI.scrollToElement(findTestObject('Profile/btnSave'), 10)

WebUI.click(findTestObject('Profile/btnSave'))

