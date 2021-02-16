import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

//CREATE ACCOUNT//
Mobile.startApplication('C:\\Users\\Owner\\Downloads\\FINALPROJECTS-201016-121328 (1)\\FINAL PROJECTS\\MOBILE\\app-debug.apk', false)

Mobile.tap(findTestObject('Create Account/Button_CreateAccount'), 3)

Mobile.setText(findTestObject('Create Account/Stext_First Name'), 'nia', 3)

Mobile.setText(findTestObject('Create Account/Stext_Last Name'), 'kurniawati', 3)

Mobile.setText(findTestObject('Create Account/Stext_Country'), 'indonesia', 3)

Mobile.setText(findTestObject('Create Account/Stext_Username'), 'kurniawati', 3)

Mobile.setEncryptedText(findTestObject('Create Account/Stext_Password'), 'OjI3K2/1R30xCJ6z9HEOrA==', 3)

Mobile.setEncryptedText(findTestObject('Create Account/Stext_Confirm Password'), 'OjI3K2/1R30xCJ6z9HEOrA==', 3)

Mobile.tap(findTestObject('Create Account/Button_Create Profile'), 3)

//LOGIN
Mobile.tap(findTestObject('Object Repository/Login/Button_Login'), 3)

//ACCOUNT
Mobile.tap(findTestObject('Login/Button_StripTiga'), 3)

Mobile.tap(findTestObject('Menu-menu Strip Tiga/Button_Accounts'), 3)

Mobile.tap(findTestObject('Object Repository/Account/Input Add Account/Button Plus for Add Account'), 3)

Mobile.setText(findTestObject('Object Repository/Account/Input Add Account/Stex_Account Name'), 'M Fachri', 3)

Mobile.setText(findTestObject('Object Repository/Account/Input Add Account/Stext_Initial Balance (Optional)'), '1500000', 3)

	//VERIFY ACCOUNT
	Mobile.tap(findTestObject('Object Repository/Account/Input Add Account/Button_ADD'), 3)

	Mobile.verifyElementText(findTestObject('Object Repository/Account/TView_Account Name M Fachri'), 'M Fachri')

	Mobile.verifyElementText(findTestObject('Account/TView_Account No M Fachri'), 'Account no: A1')

	Mobile.verifyElementText(findTestObject('Object Repository/Account/TView_Account Balance Fachri'), 'Account balance: $1500000.00')
	
	Mobile.tap(findTestObject('Object Repository/Account/Input Add Account/Button_View Group'), 3)
	
	Mobile.tap(findTestObject('Object Repository/Account/Input Add Account/Button_Back'), 3)
	

//MAKE DEPOSIT

Mobile.tap(findTestObject('Login/Button_StripTiga'), 3)

Mobile.tap(findTestObject('Menu-menu Strip Tiga/Button_Make a Deposit'), 3)

Mobile.delay(3)

// CLOSE APP
Mobile.closeApplication()

