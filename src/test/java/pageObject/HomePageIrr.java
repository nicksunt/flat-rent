package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HomePageIrr extends AbstractPage {

    private static final String URL_HOMEPAGE = "http://minsk.irr.by/";

     @FindBy(css = ".second")
   private WebElement btnRealestate;

      public HomePageIrr openPageHome() {
        driver.get(URL_HOMEPAGE);
          new WebDriverWait(driver, Duration.ofSeconds(5))
                  .until(ExpectedConditions.elementToBeClickable(btnRealestate));
              return this;
    }
    public RealeStatePage_With_JsExecutor getRealState() throws InterruptedException {
        btnRealestate.click();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text() = 'Аренда квартир на длительный срок']")));
        return new RealeStatePage_With_JsExecutor();
    }


}
































