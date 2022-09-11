package apk.selendroid.Pages;

import org.openqa.selenium.By;

import static apk.selendroid.Utilities.MobilUtils.driver;


public class OnboardingScreen {
    private String versionControlXpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]";

    public void clickOKButton(){
        driver.findElement(By.xpath(versionControlXpath)).click();
    }
}
