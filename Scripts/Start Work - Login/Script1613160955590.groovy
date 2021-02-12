import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.time.*
import java.time.format.*
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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

LocalDateTime today = LocalDateTime.now()

DateTimeFormatter date = DateTimeFormatter.ofPattern('d_M_yyyy-hh_MM_ss')

Mobile.startExistingApplication('com.servicenow.fulfiller')

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot(('\\Katalon\\MABE\\MABE Agent APP\\Screenshot\\Open_App_' + today.format(date)) + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Keyboard/keyboard_number_1'), 30)

Mobile.tap(findTestObject('Keyboard/keyboard_number_3'), 30)

Mobile.tap(findTestObject('Keyboard/keyboard_number_0'), 30)

Mobile.tap(findTestObject('Keyboard/keyboard_number_7'), 30)

Mobile.tap(findTestObject('Keyboard/keyboard_number_7'), 30)

Mobile.tap(findTestObject('Keyboard/keyboard_number_0'), 30)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot(('\\Katalon\\MABE\\MABE Agent APP\\Screenshot\\Login_' + today.format(date)) + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

CucumberKW.comment('Test Case End')

assert true

Mobile.closeApplication()

