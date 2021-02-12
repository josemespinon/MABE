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

Mobile.startExistingApplication('com.servicenow.fulfiller')

Mobile.tap(findTestObject('Keyboard/keyboard_number_1'), 30)

Mobile.tap(findTestObject('Keyboard/keyboard_number_3'), 30)

Mobile.tap(findTestObject('Keyboard/keyboard_number_0'), 30)

Mobile.tap(findTestObject('Keyboard/keyboard_number_7'), 30)

Mobile.tap(findTestObject('Keyboard/keyboard_number_7'), 30)

Mobile.tap(findTestObject('Keyboard/keyboard_number_0'), 30)

Mobile.tap(findTestObject('UI/CardView1'), 30)

Mobile.tap(findTestObject('Buttons/Button - Aceptar'), 30)

Mobile.tap(findTestObject('Buttons/Button - Iniciar viaje'), 30)

Mobile.tap(findTestObject('Buttons/Button - Menu'), 30)

Mobile.tap(findTestObject('Buttons/Button - Llegada a domicilio'), 30)

Mobile.tap(findTestObject('Buttons/Button - Sacar foto'), 30)

Mobile.tap(findTestObject('Buttons/Button - Opturador'), 30)

Mobile.tap(findTestObject('Buttons/Button - Save photo'), 30)

Mobile.tap(findTestObject('Buttons/Botton - Update'), 30)

Mobile.tap(findTestObject('Buttons/Button - Menu'), 30)

Mobile.tap(findTestObject('Buttons/Button - Cliente no encontrado'), 30)

Mobile.tap(findTestObject('Forms/RadioButton - Cliente Ausente'), 30)

Mobile.setText(findTestObject('Forms/EditText - Nota de cierre'), 'Esto es una prueba', 30)

Mobile.doubleTap(findTestObject('Buttons/Button - Guardar (cliente no encontrado)'), 30)

Mobile.doubleTap(findTestObject('Buttons/Button - Return'), 0)

Mobile.swipe(0, 250, 0, 550)

Mobile.tap(findTestObject('UI/CardView1'), 30)

Mobile.tap(findTestObject('Buttons/Button - Aceptar'), 30)

Mobile.tap(findTestObject('Buttons/Button - Iniciar viaje'), 30)

Mobile.tap(findTestObject('Buttons/Button - Menu'), 30)

Mobile.tap(findTestObject('Buttons/Button - Llegada a domicilio'), 30)

Mobile.tap(findTestObject('Buttons/Button - Sacar foto'), 30)

Mobile.tap(findTestObject('Buttons/Button - Opturador'), 30)

Mobile.tap(findTestObject('Buttons/Button - Save photo'), 30)

Mobile.tap(findTestObject('Buttons/Botton - Update'), 30)

Mobile.tap(findTestObject('Buttons/Button - Menu'), 30)

Mobile.tap(findTestObject('Buttons/Button - Cliente no encontrado'), 30)

Mobile.tap(findTestObject('Forms/RadioButton - Direccin no Encontrada'), 30)

Mobile.setText(findTestObject('Forms/EditText - Nota de cierre'), 'Esto es una prueba', 30)

Mobile.doubleTap(findTestObject('Buttons/Button - Guardar (cliente no encontrado)'), 30)

Mobile.doubleTap(findTestObject('Buttons/Button - Return'), 0)

Mobile.swipe(0, 250, 0, 550)

Mobile.tap(findTestObject('UI/CardView1'), 30)

Mobile.tap(findTestObject('Buttons/Button - Aceptar'), 30)

Mobile.tap(findTestObject('Buttons/Button - Iniciar viaje'), 30)

Mobile.tap(findTestObject('Buttons/Button - Menu'), 30)

Mobile.tap(findTestObject('Buttons/Button - Llegada a domicilio'), 30)

Mobile.tap(findTestObject('Buttons/Button - Sacar foto'), 30)

Mobile.tap(findTestObject('Buttons/Button - Opturador'), 30)

Mobile.tap(findTestObject('Buttons/Button - Save photo'), 30)

Mobile.tap(findTestObject('Buttons/Botton - Update'), 30)

Mobile.tap(findTestObject('Buttons/Button - Menu'), 30)

Mobile.tap(findTestObject('Buttons/Button - Cliente no encontrado'), 30)

Mobile.tap(findTestObject('Forms/RadioButton - No se Localiza Cliente'), 30)

Mobile.setText(findTestObject('Forms/EditText - Nota de cierre'), 'Esto es una prueba', 30)

Mobile.doubleTap(findTestObject('Buttons/Button - Guardar (cliente no encontrado)'), 30)

Mobile.doubleTap(findTestObject('Buttons/Button - Return'), 0)

Mobile.swipe(0, 250, 0, 550)

Mobile.closeApplication()

