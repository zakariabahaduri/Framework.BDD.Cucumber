package test.excutions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utility.SeleniumUtility;

public class Hooks  extends SeleniumUtility {
    @Before
    public void setupTests(){
        openBrowser();
    }

    @AfterStep
    public void takeScreenShotAfterEachStep(Scenario scenario){
        byte[] screenshot=takeScreenShot();
        scenario.attach(screenshot,"image/png","screenshot");
    }

    @After
    public void cleanupTests(Scenario scenario){

        if (scenario.isFailed()) {
          byte[] picture=  takeScreenShot();
            scenario.attach(picture, "image/png", "failedScreenShot");
        }
        closeBrowser();
    }
}
