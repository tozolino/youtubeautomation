import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class AndroidSmokeTest {

    AndroidDesiredCaps base;
    AndroidDriver driver;

    @BeforeClass
    public void beforeClass() throws InterruptedException, MalformedURLException{
        base = new AndroidDesiredCaps();
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), base.setupDesiredCapabilities());
    }

    @Test
    public void test() throws InterruptedException {

        Thread.sleep(6000);


        YTHome yt = new YTHome(driver);
        yt.searchIcon.click();
        yt.searchInput.sendKeys("drake mia");
        yt.submit();


        Thread.sleep(3000);

        yt.firstVideoInTheList.get(0).click();
        Thread.sleep(30000);


    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }

}
