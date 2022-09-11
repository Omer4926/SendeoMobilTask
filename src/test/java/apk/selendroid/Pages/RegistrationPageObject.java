package apk.selendroid.Pages;

import org.openqa.selenium.By;

import static apk.selendroid.Utilities.MobilUtils.driver;

public class RegistrationPageObject {
    private String usernameInputXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText[1]";
    private String emailInputXpath = "//android.widget.EditText[@content-desc=\"email of the customer\"]";
    private String passwordInputXpath = " /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText[3]";
    private String nameInputXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText[4]";
    private String programmingLanguageXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner/android.widget.TextView";
    private String javaButtonXpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[6]";
    private String tandcCheckboxXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.CheckBox";
    private String registerUserButtonXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button";

    private String verifyUserTextXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.TableLayout/android.widget.TableRow[1]/android.widget.TextView";
    public void fillUsernameInput(String username){
        driver.findElement(By.xpath(usernameInputXpath)).sendKeys(username);
    }
    public void fillEmailInput(String email){
        driver.findElement(By.xpath(emailInputXpath)).sendKeys(email);
    }
    public void fillPasswordInput(String password){
        driver.findElement(By.xpath(passwordInputXpath)).sendKeys(password);
    }
    public void fillNameInput(String name) throws InterruptedException {
        driver.findElement(By.xpath(nameInputXpath)).clear();
        Thread.sleep(3000);
        driver.findElement(By.xpath(nameInputXpath)).sendKeys(name);
    }
    public void clickProgrammingLanguage() throws InterruptedException {
        driver.findElement(By.xpath(programmingLanguageXpath)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(javaButtonXpath)).click();
    }
    public void clickTandCCheckbox(){
        driver.findElement(By.xpath(tandcCheckboxXpath)).click();
    }
    public void clickTheRegisterUserButton(){
        driver.findElement(By.xpath(registerUserButtonXpath)).click();
    }

    public String getVerifyUserText(){
        return driver.findElement(By.xpath(verifyUserTextXpath)).getText();
    }
}
