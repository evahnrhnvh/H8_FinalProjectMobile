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

Mobile.startApplication('C:\\Users\\Owner\\Downloads\\FINALPROJECTS-201016-121328 (1)\\FINAL PROJECTS\\MOBILE\\app-debug.apk', 
    false)



Mobile.tap(findTestObject('Create Account/Button_CreateAccount'), 0)

Mobile.setText(findTestObject('Create Account/Stext_First Name'), 'nia', 0)

Mobile.setText(findTestObject('Create Account/Stext_Last Name'), 'kurniawati', 0)

Mobile.setText(findTestObject('Create Account/Stext_Country'), 'indonesia', 0)

Mobile.setText(findTestObject('Create Account/Stext_Username'), 'kurniawati', 0)

Mobile.setEncryptedText(findTestObject('Create Account/Stext_Password'), 'OjI3K2/1R30xCJ6z9HEOrA==', 0)

Mobile.setEncryptedText(findTestObject('Create Account/Stext_Confirm Password'), 'OjI3K2/1R30xCJ6z9HEOrA==', 0)

Mobile.tap(findTestObject('Create Account/Button_Create Profile'), 0)

Mobile.tap(findTestObject('Object Repository/payment/android.widget.Button - LOGIN'), 0)

Mobile.tap(findTestObject('Object Repository/payment/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/payment/android.widget.CheckedTextView - Make a Payment'), 0)

Mobile.tap(findTestObject('Object Repository/payment/android.widget.Button - ADD ACCOUNT'), 0)

Mobile.setText(findTestObject('Object Repository/payment/android.widget.EditText - Account Name'), 'nia', 0)

Mobile.setText(findTestObject('Object Repository/payment/android.widget.EditText - Initial Balance (Optional)'), '10000', 
    0)

Mobile.tap(findTestObject('Object Repository/payment/android.widget.Button - ADD'), 0)

Mobile.tap(findTestObject('Login/Button_StripTiga'), 0)

Mobile.tap(findTestObject('payment/android.widget.CheckedTextView - Make a Payment'), 0)

Mobile.tap(findTestObject('payment/android.widget.ImageButton (2)'), 0)

Mobile.setText(findTestObject('Object Repository/payment/android.widget.EditText - Payee Name'), 'baju', 0)

Mobile.tap(findTestObject('payment/android.widget.Button - ADD'), 0)

Mobile.setText(findTestObject('Object Repository/payment/android.widget.EditText - Amount'), '1000', 0)

Mobile.tap(findTestObject('Object Repository/payment/android.widget.Button - Make Payment'), 0)

Mobile.tap(findTestObject('Object Repository/payment/android.widget.ImageButton'), 0)

Mobile.scrollToText('Logout', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login/Button_Logout'), 0)

Mobile.closeApplication()

