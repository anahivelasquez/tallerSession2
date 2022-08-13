import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class registrarNota {

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
    public void registrarNota() {

        //Click en agregar Nota
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/fab")).click();

        //Ingresamos el titulo de la nota
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextTitle")).sendKeys("Nota de prueba");

        //Ingresamos la descripcion de la nota
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextNotes")).sendKeys("Se tiene la siguiente nota");

        //Click en guardar
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/saveItem")).click();

        String expectedResult = "Nota de prueba";
        String actualResult = driver.findElement(By.id("com.vrproductiveapps.whendo:id/home_list_item_text")).getText();

        Assertions.assertEquals(expectedResult, actualResult, "Error en registrar");


    }
    @Test
    public void registrarMultiplesNota() {

        //Click en agregar Nota
        driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.vrproductiveapps.whendo:id/fab']")).click();

        //Ingresamos el titulo de la nota
        driver.findElement(By.xpath("//android.widget.EditText[@text='Title']")).sendKeys("Nota de prueba2");

        //Ingresamos la descripcion de la nota
        driver.findElement(By.xpath("//android.widget.EditText[@text='Notes']")).sendKeys("Se tiene la nota multiples");

        //Click en guardar multiples
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.vrproductiveapps.whendo:id/saveAndNew']")).click();

        //Ingresamos el titulo de la nota
        driver.findElement(By.xpath("//android.widget.EditText[@text='Title']")).sendKeys("Nota de prueba3");

        //Ingresamos la descripcion de la nota
        driver.findElement(By.xpath("//android.widget.EditText[@text='Notes']")).sendKeys("Se tiene la nota multiples2");

        //Click en  multiples
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.vrproductiveapps.whendo:id/saveAndNew']")).click();

        //Ingresamos el titulo de la nota
        driver.findElement(By.xpath("//android.widget.EditText[@text='Title']")).sendKeys("Nota de prueba4");

        //Ingresamos la descripcion de la nota
        driver.findElement(By.xpath("//android.widget.EditText[@text='Notes']")).sendKeys("Se tiene la nota multiples5");
        //Click en  multiples
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.vrproductiveapps.whendo:id/saveAndNew']")).click();

        //Ingresamos el titulo de la nota
        driver.findElement(By.xpath("//android.widget.EditText[@text='Title']")).sendKeys("Nota de prueba4");

        //Ingresamos la descripcion de la nota
        driver.findElement(By.xpath("//android.widget.EditText[@text='Notes']")).sendKeys("Se tiene la nota multiples5");

        //Click en  multiples
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.vrproductiveapps.whendo:id/saveAndNew']")).click();

        //Ingresamos el titulo de la nota
        driver.findElement(By.xpath("//android.widget.EditText[@text='Title']")).sendKeys("Nota de prueba4");

        //Ingresamos la descripcion de la nota
        driver.findElement(By.xpath("//android.widget.EditText[@text='Notes']")).sendKeys("Se tiene la nota multiples5");

        //Click en  multiples
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.vrproductiveapps.whendo:id/saveAndNew']")).click();

        //Ingresamos el titulo de la nota
        driver.findElement(By.xpath("//android.widget.EditText[@text='Title']")).sendKeys("Nota de prueba4");

        //Ingresamos la descripcion de la nota
        driver.findElement(By.xpath("//android.widget.EditText[@text='Notes']")).sendKeys("Se tiene la nota multiples5");

        //Click en  multiples
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.vrproductiveapps.whendo:id/saveAndNew']")).click();

        //Ingresamos el titulo de la nota
        driver.findElement(By.xpath("//android.widget.EditText[@text='Title']")).sendKeys("Nota de prueba4");

        //Ingresamos la descripcion de la nota
        driver.findElement(By.xpath("//android.widget.EditText[@text='Notes']")).sendKeys("Se tiene la nota multiples5");

        //Click en guardar
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.vrproductiveapps.whendo:id/saveItem']")).click();

        String expectedResult = "Nota de prueba2";
        String actualResult = driver.findElement(By.id("com.vrproductiveapps.whendo:id/home_list_item_text")).getText();

        Assertions.assertEquals(expectedResult, actualResult, "Error en registrar");
    }
    @Test
    public void registrarNotaCompletadas() {

        //Click en agregar Nota
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/fab")).click();

        //Click en el check de tarea completada
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/note_item_marked")).click();

        //Ingresamos el titulo de la nota
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextTitle")).sendKeys("Nota de prueba");

        //Ingresamos la descripcion de la nota
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextNotes")).sendKeys("Se tiene la siguiente nota");

        //Click en guardar
        driver.findElement(By.id("com.vrproductiveapps.whendo:id/saveItem")).click();

        String expectedResult = "Nota de prueba";
        String actualResult = driver.findElement(By.id("com.vrproductiveapps.whendo:id/home_list_item_text")).getText();

        Assertions.assertEquals(expectedResult, actualResult, "Error en registrar");


    }

}
