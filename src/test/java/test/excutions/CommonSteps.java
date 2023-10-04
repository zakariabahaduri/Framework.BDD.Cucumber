package test.excutions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;
import utility.SeleniumUtility;

public class CommonSteps extends SeleniumUtility {
    @When(": wait for {int} Second")
    public void waitInSeconds(int int1) {
        try {
            Thread.sleep(2 * 1000);
        }
        catch (InterruptedException e) {
            Assert.fail("Interrupted Exception happened!");
        }
    }
    @When(": click on {string} Link")
    public void click_on_link(String partialLinkText) {
        By locator= CommonPage.getLinkText(partialLinkText);
        elementClick(locator);
    }

}
