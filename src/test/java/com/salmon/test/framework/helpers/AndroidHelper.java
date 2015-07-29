package com.salmon.test.framework.helpers;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AndroidHelper extends EventFiringWebDriver {
    private static final Logger LOG = LoggerFactory
            .getLogger(AndroidHelper.class);
    private static AndroidDriver<WebElement> ANDROID_DRIVER = null;
    private static final Thread CLOSE_THREAD = new Thread() {

        @Override
        public void run() {
            ANDROID_DRIVER.quit();
        }
    };

    static {
        LoadProperties.loadRunConfigProps();
        ANDROID_DRIVER = startAppiumDriver();
        Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
    }

    private AndroidHelper() {
        super(ANDROID_DRIVER);
    }


    private static AndroidDriver<WebElement> startAppiumDriver() {
        DesiredCapabilities capabilities = getAppiumDesiredCapabilities();
        try {
            ANDROID_DRIVER = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return ANDROID_DRIVER;
    }


    private static DesiredCapabilities getAppiumDesiredCapabilities() {
        File app = new File("D:\\projects\\master_cucumber_testng\\tools\\ContactManager.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app-package", "com.example.android.contactmanager");
        capabilities.setCapability("app-activity", ".ContactManager");
        capabilities.setCapability("deviceName", "emulator-5554");
//        capabilities.setCapability("deviceName", "42f7ab1fb7b59fab");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "Appium");

        capabilities.setCapability("app", app.getAbsolutePath());
        return capabilities;
    }

    public static AndroidDriver<WebElement> getAndroidWebDriver() {
        return ANDROID_DRIVER;
    }

    @Override
    public void close() {
        if (Thread.currentThread() != CLOSE_THREAD) {
            throw new UnsupportedOperationException(
                    "You shouldn't close this WebDriver. It's shared and will close when the JVM exits.");
        }
        super.close();
    }
}