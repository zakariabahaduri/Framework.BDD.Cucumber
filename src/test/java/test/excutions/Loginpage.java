package test.excutions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPageLocators;
import utility.SeleniumUtility;

public class Loginpage extends SeleniumUtility {
    @Then(": Validate the header title is {string}")
    public void validateTheHeaderTitleIs(String headerTitle) {
       String header_title= getElementText(LoginPageLocators.HEADER_TITLE);
        Assert.assertEquals(header_title,headerTitle);

    }

    @Then(": Validate the login section title {string}")
    public void validateTheLoginSectionTitle(String sectionTitle) {
        String section_title=getElementText(LoginPageLocators.SECTION_TITLE);
        Assert.assertEquals(sectionTitle,section_title);
    }

    @Then(": login button should {string} when the username and password fields are blank")
    public void loginButtonShouldDisabledWhenTheUsernameAndPasswordFieldsAreBlank(String expectedCondition) {
     boolean actualCondition=isElementEnabled(LoginPageLocators.SUBMIT_BUTTON);
     if (expectedCondition.equalsIgnoreCase("enabled")) {
         Assert.assertTrue("The button is enabled",actualCondition);

     }
     else if (expectedCondition.equalsIgnoreCase("disabled")){
         Assert.assertFalse("The button is disabled", actualCondition);

     }

    }

    @When(": user enters username {string} and Password {string}")
    public void userEntersUsernameStringAndPasswordString(String username , String password) {
        elementSendKey(LoginPageLocators.USERNAME,username);
        elementSendKey(LoginPageLocators.PASSWORD,password);
    }

    @Then(": The login Button should be {string}")
    public void theLoginButtonShouldBeEnabled(String expectedCondition) {
        boolean actualCondition=isElementEnabled(LoginPageLocators.SUBMIT_BUTTON);
        if (expectedCondition.equalsIgnoreCase("enabled")) {
            Assert.assertTrue("The button is enabled",actualCondition);

        }
        else if (expectedCondition.equalsIgnoreCase("disabled")){
            Assert.assertFalse("The button is disabled", actualCondition);

        }
    }

}
