package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RentLongTimePage_With_Action extends AbstractPage{

    @FindBy(css = "div[data-item-name='rooms'] a[data-type='1']")
    private WebElement btnChooseOneRoom;

    @FindBy(css =".tm-tag")
    private WebElement fieldChooseDistrict;

    @FindBy(css = "a[data-district-id ='28']")
    private WebElement checkBoxDistrictCentral;

    @FindBy(css = "div[class='view'] input[class='save']")
    private WebElement btnSave;

    @FindBy(css = "#show-result-search")
    private WebElement btnFind;


    public RentLongTimePage_With_Action clickOneRoom() throws InterruptedException {
        btnChooseOneRoom.click();
        new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS)).until(ExpectedConditions
                .elementToBeClickable(fieldChooseDistrict));
        return this;
    }
    public RentLongTimePage_With_Action clickDistrict() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(fieldChooseDistrict).click().build().perform();
        new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS)).until(ExpectedConditions
                .elementToBeClickable(checkBoxDistrictCentral));
        return this;
    }

    public RentLongTimePage_With_Action clickDistrictCentral() throws InterruptedException {
        checkBoxDistrictCentral.click();
        new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS)).until(ExpectedConditions
                .elementToBeClickable(btnSave));
        return this;
    }
    public RentLongTimePage_With_Action clickSave() throws InterruptedException {
        btnSave.click();
        new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS)).until(ExpectedConditions
                .elementToBeClickable(btnFind));
        return this;
    }
    public void clickFind() throws InterruptedException {
        btnFind.click();
        Thread.sleep(3000);
    }
}
