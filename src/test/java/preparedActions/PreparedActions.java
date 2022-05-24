package preparedActions;

import pageObject.HomePageIrr;
import pageObject.SearchResult;


public class PreparedActions {

    public void getPreparedActions() throws InterruptedException {
       new HomePageIrr()
                .openPageHome()
                .getRealState()
                .getRentLongTime()
                .clickOneRoom()
                .clickDistrict()
                .clickDistrictCentral()
                .clickSave()
                .clickFind();
    }
}
