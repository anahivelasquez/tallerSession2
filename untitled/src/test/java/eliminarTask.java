import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class eliminarTask {

    private AppiumDriver driver;

    @BeforeEach
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "AOSP");
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("appPackage", "com.vrproductiveapps.whendo");
        capabilities.setCapability("appActivity", ".ui.HomeActivity");
        capabilities.setCapability("platformName", "Android");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    @Test
    public void eliminarTask() {

        //Las tareas no se guardan para poder ejecutar el caso.

        //Click en la tarea
        driver.findElement(By.xpath("//android.widget.TextView[@text='Nota de prueba']")).click();

        //Click en le tachito de eliminar
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Delete']")).click();

    }
}
