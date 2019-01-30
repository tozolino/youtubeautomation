import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class IOSDesiredCaps {



    public DesiredCapabilities setupIOSDesirecCapabilities() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        String appPath = "/Users/s.pavlovic/Downloads/MacAndCheese.app";
        File app = new File(appPath);
        caps.setCapability("deviceName", "iPhone XR");
        caps.setCapability("platformName", "iOS");
        caps.setCapability("platformVersion", "12.1");
        caps.setCapability("automationName", AutomationName.IOS_XCUI_TEST);
        caps.setCapability("app", app.getAbsolutePath());
        IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(url, caps);
        return caps;



    }


}
