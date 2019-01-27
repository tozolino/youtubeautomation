import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class YTHome {


    private AndroidDriver driver;

    public YTHome(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.google.android.youtube:id/menu_search")
    public MobileElement searchIcon;


    @AndroidFindBy(id = "com.google.android.youtube:id/search_edit_text")
    public MobileElement searchInput;

    public void submit(){
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }
    @AndroidFindBy(className = "android.widget.RelativeLayout")
    public List<MobileElement> firstVideoInTheList;








}



