package test.excutions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.LoginPageLocators;
import utility.SeleniumUtility;

public class Login_Successfully extends SeleniumUtility {

    @When(": The web Page is displayed. The title should be {string}")
    public void the_web_page_is_displayed_the_title_should_be(String pageTitle) {
        String actual=getDriver().getTitle();
        Assert.assertEquals(pageTitle,actual);
    }

    @When(": user enters username {string}")
    public void user_enters_username_and_password(String username) {
         elementSendKey(By.name("username"),username);


    }
    @And(":  user enters Password1 {string}")
    public void userEntersPassword( String password) {
        elementSendKey(LoginPageLocators.PASSWORD,password);
    }

    @And(": The login Button should be enabled.")
    public void theLoginButtonShouldBeEnabled() {
    boolean submit_button_condition=    getDriver().findElement(By.id("loginButton")).isEnabled();
        Assert.assertTrue(submit_button_condition);
    }
    @When(": User clicks the submit button")
    public void user_clicks_the_submit_bottun() {

       elementClick(LoginPageLocators.SUBMIT_BUTTON);
    }
    @Then(": User should be logedin Successfully.")
    public void user_should_be_logedin_successfully() {

    String actual=   getElementText(By.xpath("//app-toolbar/mat-toolbar/span[1]"));
    String expected="Tek Insurance App";

        Assert.assertEquals("The actual and expected should be the same",actual,expected);
    }
    @Then(": User should be able to identify accounts {string}")
    public void user_should_be_able_to_identify_accounts(String accounts) {
        String actual=getElementText(By.xpath("//div/app-menu-items/mat-nav-list/a[1]"));
      //  String expected="Accounts";
        actual=actual.substring(5);
        Assert.assertEquals(accounts,actual);
    }
    @Then(": User should be able to identify plans {string}")
    public void user_should_be_able_to_identify_plans(String plans) {
       String actual=getElementText(By.xpath("//div/app-menu-items/mat-nav-list/a[2]"));
     actual=actual.substring(4);
       Assert.assertEquals("The actual is: "+actual,plans,actual);
    }


    @Then(": User gets an {string}")
    public void userGetsAn(String errorMessage) {
        String actual= getElementText(LoginPageLocators.ERROR_MESSAGE);
        Assert.assertEquals(errorMessage,actual);
    }
    @Given(": Login with username {string} and password {string}")
    public void loginWithUsernameAndPassword(String username, String password) {
        elementSendKey(LoginPageLocators.USERNAME,username);
        elementSendKey(LoginPageLocators.PASSWORD,password);
        elementClick(LoginPageLocators.SUBMIT_BUTTON);

    }
}
