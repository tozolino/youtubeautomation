import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidDesiredCaps {


    public DesiredCapabilities setupDesiredCapabilities(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("platformName", "Android");
        caps.setCapability("browserName", "");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformVersion", "8.0");
//        caps.setCapability("app", "/home/spavlovic/Downloads/android-debug.apk");
        caps.setCapability("appPackage", "com.google.android.youtube");
        caps.setCapability("appActivity", "com.google.android.apps.youtube.app.WatchWhileActivity");
        return  caps;
    }

}
