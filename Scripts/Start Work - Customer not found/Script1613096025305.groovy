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

Mobile.tap(findTestObject('UI/CardView1'), 30)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot(('\\Katalon\\MABE\\MABE Agent APP\\Screenshot\\WOT_' + today.format(date)) + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Buttons/Button - Aceptar'), 30)

Mobile.tap(findTestObject('Buttons/Button - Iniciar viaje'), 30)

Mobile.tap(findTestObject('Buttons/Button - Menu'), 30)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot(('\\Katalon\\MABE\\MABE Agent APP\\Screenshot\\Menu_' + today.format(date)) + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Buttons/Button - Llegada a domicilio'), 30)

Mobile.tap(findTestObject('Buttons/Button - Sacar foto'), 30)

Mobile.tap(findTestObject('Buttons/Opdturador ID'), 15)

Mobile.tap(findTestObject('Buttons/Button - Save photo'), 30)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot(('\\Katalon\\MABE\\MABE Agent APP\\Screenshot\\Evidence_Dom_' + today.format(date)) + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Buttons/Botton - Update'), 30)

Mobile.tap(findTestObject('Buttons/Button - Menu'), 30)

Mobile.tap(findTestObject('Buttons/Button - Cliente no encontrado'), 30)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot(('\\Katalon\\MABE\\MABE Agent APP\\Screenshot\\Button_disable_' + today.format(date)) + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Forms/RadioButton - Cliente Ausente'), 30)

Mobile.setText(findTestObject('Forms/EditText - Nota de cierre'), 'Esto es una prueba', 30)

Mobile.tap(findTestObject('Buttons/Button - Guardar (cliente no encontrado)'), 30)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot(('\\Katalon\\MABE\\MABE Agent APP\\Screenshot\\Button_enable_' + today.format(date)) + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Buttons/Button - Guardar (cliente no encontrado)'), 30)

Mobile.doubleTap(findTestObject('Buttons/Button - Return'), 30)

Mobile.swipe(0, 250, 0, 550)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot(('\\Katalon\\MABE\\MABE Agent APP\\Screenshot\\New_task_' + today.format(date)) + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('UI/CardView1'), 30)

Mobile.tap(findTestObject('Buttons/Button - Aceptar'), 30)

Mobile.tap(findTestObject('Buttons/Button - Iniciar viaje'), 30)

Mobile.tap(findTestObject('Buttons/Button - Menu'), 30)

Mobile.tap(findTestObject('Buttons/Button - Llegada a domicilio'), 30)

Mobile.tap(findTestObject('Buttons/Button - Sacar foto'), 30)

Mobile.tap(findTestObject('Buttons/Opdturador ID'), 15)

Mobile.tap(findTestObject('Buttons/Button - Save photo'), 30)

Mobile.tap(findTestObject('Buttons/Botton - Update'), 30)

Mobile.tap(findTestObject('Buttons/Button - Menu'), 30)

Mobile.tap(findTestObject('Buttons/Button - Cliente no encontrado'), 30)

Mobile.tap(findTestObject('Forms/RadioButton - Direccin no Encontrada'), 30)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot(('\\Katalon\\MABE\\MABE Agent APP\\Screenshot\\Option2_cnf_' + today.format(date)) + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Forms/EditText - Nota de cierre'), 'Esto es una prueba', 30)

Mobile.doubleTap(findTestObject('Buttons/Button - Guardar (cliente no encontrado)'), 30)

Mobile.doubleTap(findTestObject('Buttons/Button - Return'), 30)

Mobile.swipe(0, 250, 0, 550)

Mobile.tap(findTestObject('UI/CardView1'), 30)

Mobile.tap(findTestObject('Buttons/Button - Aceptar'), 30)

Mobile.tap(findTestObject('Buttons/Button - Iniciar viaje'), 30)

Mobile.tap(findTestObject('Buttons/Button - Menu'), 30)

Mobile.tap(findTestObject('Buttons/Button - Llegada a domicilio'), 30)

Mobile.tap(findTestObject('Buttons/Button - Sacar foto'), 30)

Mobile.tap(findTestObject('Buttons/Opdturador ID'), 15)

Mobile.tap(findTestObject('Buttons/Button - Save photo'), 30)

Mobile.tap(findTestObject('Buttons/Botton - Update'), 30)

Mobile.tap(findTestObject('Buttons/Button - Menu'), 30)

Mobile.tap(findTestObject('Buttons/Button - Cliente no encontrado'), 30)

Mobile.tap(findTestObject('Forms/RadioButton - No se Localiza Cliente'), 30)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot(('\\Katalon\\MABE\\MABE Agent APP\\Screenshot\\Option3_cnf_' + today.format(date)) + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Forms/EditText - Nota de cierre'), 'Esto es una prueba', 30)

Mobile.doubleTap(findTestObject('Buttons/Button - Guardar (cliente no encontrado)'), 30)

Mobile.doubleTap(findTestObject('Buttons/Button - Return'), 0)

Mobile.swipe(0, 250, 0, 550)

CucumberKW.comment('Test Case End')

assert true

Mobile.closeApplication()

