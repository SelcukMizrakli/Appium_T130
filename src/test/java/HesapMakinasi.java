import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HesapMakinasi {
    AndroidDriver<AndroidElement> driver;

    // IOSDriver<IOSElement> iosDriver;

    //   AppiumDriver<MobileElement> appiumDriver; // her iki platform da (ios ve android ) platformlarinda da calisir fakat dogruluk islem
    // kapasite orani diger platformlarin kendi driver larina gore daha zayiftir


    @Test
    public void hesapMakinasiTest() throws MalformedURLException {
        // kullanici gerekli kurulumlari yapar
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");

        capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\ahmet\\IdeaProjects\\Appium_T130\\Apps\\Calculator_8.4 (503542421)_Apkpure (3).apk");
        // app capabilities degeri bir uygulamayi yuklemek icin kullanilan degerdir.
        // Bu capability eger ki bir uygulama yukle degilse onu kontrol eder ve yukler eger yuklu ise uygulamainin yuklu olup olmadigini kontrol eder
        // ve yukluyse uygulamayi acar


        driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        // uygulamanin yuklendigini dogrular(isInstalled)

        // uygulamanin acildigini dogrular

        // 400 un 3 katininin 1200 oldugunu hesap makinasindan dogrulayalim





    }
}