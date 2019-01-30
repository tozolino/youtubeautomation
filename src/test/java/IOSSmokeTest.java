import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class IOSSmokeTest {

        IOSDesiredCaps caps;
        IOSDriver<IOSElement> driver;


        @BeforeClass
        public void beforeClass() throws InterruptedException, MalformedURLException {

            URL url = new URL("http://0.0.0.0:4723/wd/hub");
            caps = new IOSDesiredCaps();
            driver = new IOSDriver<IOSElement>(url, caps.setupIOSDesirecCapabilities());
        }

        @Test
        public void test() throws InterruptedException {

            Thread.sleep(3000);



        }

        @AfterClass
        public void afterClass(){
            driver.quit();
        }

    }

