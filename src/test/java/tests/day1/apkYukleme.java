package tests.day1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class apkYukleme {
    AndroidDriver<AndroidElement> driver;


    @Test
    public void apkYukleme() throws MalformedURLException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");

        capabilities.setCapability(MobileCapabilityType.APP,"C:\\javaProje\\Appium_T130\\Apps\\all-currency-converter-3-9-0 (1).apk");
        // app capabilities degeri bir uygulamayi yuklemek icin kullanilan degerdir.
        // Bu capability eger ki bir uygulama yukle degilse onu kontrol eder ve yukler eger yuklu ise uygulamainin yuklu olup olmadigini kontrol eder
        // ve yukluyse uygulamayi acar


        driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    }
}