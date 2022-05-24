package driverInit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSinglton {

    private static WebDriver webDriver;

    private DriverSinglton(){

    }

    public static WebDriver getDriver(){
        if (webDriver == null){
       //     WebDriverManager.chromedriver().setup(); // автоматическ обновляет драйвер
            webDriver = new ChromeDriver();
        }
        return webDriver;
    }
    public static void closeDriver() { // возможно для обнуления драйвера, т.к. выйти можно и в @After...
        webDriver.quit();
        webDriver = null;
    }
}
