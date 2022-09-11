package apk.selendroid.Pages;

import org.openqa.selenium.By;

import static apk.selendroid.Utilities.MobilUtils.driver;

public class MainPageObject {
    private String registrationButtonXpath = "//android.widget.ImageButton[@content-desc=\"startUserRegistrationCD\"]";

    private String displayAToastXpath = "//android.widget.Button[@content-desc=\"showToastButtonCD\"]";

    private String addsCheckboxButtonXpath = "(//android.widget.LinearLayout[@content-desc=\"imageViewCD\"])[2]/android.widget.CheckBox\n";

    private String displayTextViewButtonXpath = "//android.widget.Button[@content-desc=\"visibleButtonTestCD\"]";

    private String displayTextViewTextXpath= "(//android.widget.LinearLayout[@content-desc=\"visibleTestAreaCD\"])[1]/android.widget.TextView";



    public void clickRegistrationButton() {
        driver.findElement(By.xpath(registrationButtonXpath)).click();
    }

    public boolean isDisplayButton(){

        return driver.findElement(By.xpath(displayAToastXpath)).isDisplayed();
    }
    public void clickAddsCheckboxButton(){
        driver.findElement(By.xpath(addsCheckboxButtonXpath)).click();
    }
    public boolean isSelectedCheckboxButton(){

        return driver.findElement(By.xpath(addsCheckboxButtonXpath)).isSelected();
    }
    public void clickDisplayTextViewButton(){
        driver.findElement(By.xpath(displayTextViewButtonXpath)).click();
    }
    public String getTextDisplayTextViewButton(){
        return driver.findElement(By.xpath(displayTextViewTextXpath)).getText();
    }
}

