package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RealeStatePage_With_JsExecutor extends AbstractPage{


      @FindBy(css = "a[href='/realestate/longtime/']")
     private WebElement btnRentForLongTime;

    public RentLongTimePage_With_Action getRentLongTime() throws InterruptedException {

        JavascriptExecutor jsEx = (JavascriptExecutor) driver;
        jsEx.executeScript("arguments[0].click();", btnRentForLongTime);

        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[data-item-name='rooms'] a[data-type='1']")));
        return new RentLongTimePage_With_Action();
    }
}
