package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import java.util.stream.Collectors;

public class SearchResult extends AbstractPage {

    /////////////////////////////////////  МОЁ РЕШЕНИЕ  //////////////////////////////////////////

    @FindBy(css = ".add_cost")
    private List<WebElement> listTextPrice;

    @FindBy(css = ".add_title")
    private List<WebElement> listTextAddress;

    public void loggingResult() {

        List<String> lsTextAddress = listTextAddress.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());

        List<String> lsTextPrice = listTextPrice.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());

        for (int i = 0; i < lsTextAddress.size(); i++) {
            logger.info(lsTextAddress.get(i) + " по цене " + lsTextPrice.get(i));
        }
    }

/////////////////////////////////// РЕШЕНИЕ КАК У АЛЕКСАНДРА //////////////////////////////////////////////////

    @FindBy(css = ".add_info")
    private List<WebElement> listFlat;

    String textPrice = ".add_cost";
    String textAddress = ".add_title";

    public void loggingResult1() {
       listFlat.stream()
                .map(s -> s.findElement(By.cssSelector(textAddress))
                .getText() + " - " + s.findElement(By.cssSelector(textPrice)).getText())
                .forEach(logger::info);
    }
}
