package test.excutions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.AccountsPage;
import utility.SeleniumUtility;

import java.util.List;

public class AccountsSteps extends SeleniumUtility {
    @Then("Validate accounts table have {int} rows")
    public void validateAccountTableRows(int expectedRows) {
        List<WebElement> tableRowsElements = getListOfElements(AccountsPage.TABLE_ROWS);

        Assert.assertEquals(expectedRows, tableRowsElements.size());

    }

    //TODO Failed due to stale element while calling step multiple time
    @When("change item per page to {string}")
    public void changeItemPerPage(String itemPerPage) {
        //Click to open the dropdown
        elementClick(AccountsPage.ITEM_PER_PAGE_SELECT);
      //  elementClick(AccountsPage.ITEM_PER_PAGE_FIVE);
        selectFromDropDown(AccountsPage.ITEM_PER_PAGE_OPTIONS, itemPerPage);
    }
}
