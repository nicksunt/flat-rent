package testLogAddressPrice;

import driverInit.BaseAbstarctClass;
import org.testng.annotations.Test;
import pageObject.SearchResult;
import preparedActions.PreparedActions;

public class LogSearchResultTest extends BaseAbstarctClass {

    @Test
    public void testMatchRegion() throws InterruptedException {

        PreparedActions preparedActions = new PreparedActions();
        preparedActions.getPreparedActions();

        SearchResult searchResult = new SearchResult();
        searchResult.loggingResult();
    }
}

