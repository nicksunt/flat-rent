package driverInit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseAbstarctClass {


        @BeforeTest
        public  void openChrome() {
            DriverSinglton.getDriver().manage().window().maximize();
        }

        @AfterTest
        public  void tearDown() {
            DriverSinglton.closeDriver();
        }
    }

