package apk.selendroid.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MobilUtils {

    public static AppiumDriver driver = null;
    public static WebDriverWait driverWait = null;
    public String appPackage = "selendroid-test-app-0.17.0.apk"; //for Live build

    public static void setUp(String device) throws MalformedURLException {
        if (device.equals("iOS")) {
            getSetup_ios();
        }
        if (device.equals("android")) {
            getSetup_android();
        }
    }

    public static void getSetup_ios() throws MalformedURLException {
        //Init Appium Instances:
        URL serverAddress = new URL("http://0.0.0.0:4723/wd/hub");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.VERSION,"7.0");
        capabilities.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"\\selendroid-test-app-0.17.0.apk");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 2");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,20000);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");


        //Set appPath
        String userDir = System.getProperty("user.dir");
        String localApp = "";
        String appPath = userDir + "/" + localApp;
        capabilities.setCapability("app", appPath);

        driver = new IOSDriver(serverAddress, capabilities);
        driverWait = new WebDriverWait(driver, 90);
    }

    public static void getSetup_android() throws MalformedURLException {
        URL serverAddress = new URL("http://127.0.0.1:4723/wd/hub");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.VERSION,"10.0");
        capabilities.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"\\selendroid-test-app-0.17.0.apk");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 2");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,20000);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");

        String userDir = System.getProperty("user.dir");
        String localApp = "selendroid-test-app-0.17.0.apk";
        String appPath = userDir + "/" + localApp;
        capabilities.setCapability("app", appPath);

        driver = new AndroidDriver(serverAddress, capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static void tearDown() throws Exception {
        if (driver != null) driver.quit();
    }
}
