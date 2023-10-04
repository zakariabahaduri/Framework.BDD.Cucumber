package test.excutions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.PlansPage;
import utility.SeleniumUtility;

import java.util.List;

public class PlansSteps extends SeleniumUtility {



    @Then(": Validate Section title is {string}")
    public void validate_section_title_is(String headerTitle) {
        String actual=getElementText(PlansPage.PAGE_HEADER_LOCATOR);
        Assert.assertEquals(actual,headerTitle);
    }
    @Then(": Validate table has {int} rows")
    public void validate_table_has_rows(int rowsCount) {

      //  List<WebElement> rows=getDriver().findElements(PlansPage.TABALE_ROW_LOCATOR);
       int rows= getListOfElements(PlansPage.TABALE_ROW_LOCATOR).size();
        Assert.assertEquals(rows,rowsCount);

    }
    @And(": Validate all plans rows are valid {string}")
    public void validateAllPlansRowsAreValid(String valid) {
        List<WebElement> elements=getListOfElements(PlansPage.TABLE_PLAN_EXPIRED);
        for (WebElement element : elements)
        {
            Assert.assertEquals(element.getText(),valid);
        }
    }

    @Then(": Validate Plan table header")
    public void validatePlanTableHeader(DataTable dataTable) {
        List<List<String>> tableAsList= dataTable.asLists();
        List<WebElement> headerElements=getListOfElements(PlansPage.TABLE_PLAN_HEADER);
       List <String>  actualRow=tableAsList.get(0);
       for (int i=0; i<headerElements.size(); i++){
           String actual=headerElements.get(i).getText();
           String expected=actualRow.get(i);
           Assert.assertEquals(expected,actual);

       }
    }
}
