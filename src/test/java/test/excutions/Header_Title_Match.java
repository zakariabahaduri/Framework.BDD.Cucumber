package test.excutions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import utility.SeleniumUtility;

public class Header_Title_Match extends SeleniumUtility {

    @When("User inputs username {string} and password {string}")
    public void userInputsUsernameAndPassword(String username, String password) {
        elementSendKey(By.name("username"),username);
        elementSendKey(By.name("password"),password);
    }

    @When("User clicks on submit button")
    public void user_clicks_on_submit_button() {
        elementClick(By.id("loginButton"));
    }
    @Then("The title should be {string}")
    public void the_title_should_be(String title) {
        String actual= getDriver().getTitle();


        Assert.assertEquals("The actual and expected should be the same",actual,title);
    }
    @Then("User should see the header {string}")
    public void user_should_see_the_header(String header) {
        String actual=getElementText(By.xpath("//app-toolbar/mat-toolbar/span[1]"));
        Assert.assertEquals("Message",actual,header);
    }


}
