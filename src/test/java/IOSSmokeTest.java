import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class IOSSmokeTest {

    IOSDesiredCaps caps;
    IOSDriver driver;
    HashMap<String, Object> params;


    @BeforeClass
    public void beforeClass() throws MalformedURLException {

        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        caps = new IOSDesiredCaps();
        driver = new IOSDriver<IOSElement>(url, caps.setupIOSDesirecCapabilities());
        params = new HashMap<String,Object>();
        params.put("bundleId", "uxbae.MacAndCheese");
    }

    @Test
    public void testAppInstalled() throws InterruptedException {

        final boolean isInstalled = (Boolean)driver.executeScript("mobile: isAppInstalled", params);
        Assert.assertTrue(isInstalled);
    }
//    @Test
//    public void testAppInBackground() throws InterruptedException {
//        final boolean wasRunningBefore = (Boolean) driver.executeScript("mobile: terminateApp", params);
//        Thread.sleep(6000);
//        Assert.assertTrue(wasRunningBefore);
//    }
//    @Test
//    public void testAppResumed() throws InterruptedException {
//        driver.executeScript("mobile: activateApp", params);
//        Thread.sleep(3000);
//        final long state = (Long) driver.executeScript("mobile: queryAppState", params);
//        Assert.assertEquals(state, 4);
//    }
    @Test
    public void testAppUninstalled() {
        driver.removeApp("uxbae.MacAndCheese");
        final boolean isInstalled = (Boolean)driver.executeScript("mobile: isAppInstalled", params);
        Assert.assertFalse(isInstalled);
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }

}

