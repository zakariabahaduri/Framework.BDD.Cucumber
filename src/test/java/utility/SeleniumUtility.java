package utility;

import framework.bdd.basesetup.BaseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SeleniumUtility extends BaseSetup {

    private WebDriverWait getWait(){
        return new WebDriverWait(getDriver(), Duration.ofMinutes(1));

    }
    private List<WebElement> waitUntilVisabilityofAllAlements(By locator){
        return getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }
    private WebElement waitUntilVisiablityOfElement( By locator){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    private WebElement waitUntilElementClickable(By locator){
        return getWait().until(ExpectedConditions.elementToBeClickable(locator));
    }
    private List<WebElement> waitUntilVisiablityOfElements(By locator){

        List<WebElement> elements=getDriver().findElements(locator);
        return elements;
    }

     public String getElementText(By locator){


//WebElement element =getWait().until(ExpectedConditions.presenceOfElementLocated(locator));
return waitUntilVisiablityOfElement(locator).getText();


     }

     public void elementClick(By locator){

       //  getWait().until(ExpectedConditions.presenceOfElementLocated(locator)).click();
         waitUntilElementClickable(locator).click();

     }
     public  void elementSendKey(By locator, String key){

         //getWait().until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys(key);
         waitUntilElementClickable(locator).sendKeys(key);

    }
    public boolean isElementEnabled(By locator){

     // WebElement  condition=   getWait().until(ExpectedConditions.presenceOfElementLocated(locator));
      return waitUntilVisiablityOfElement(locator).isEnabled()  ;
    }
    public List<WebElement> getListOfElements(By locator){
        return waitUntilVisabilityofAllAlements(locator);
    }
    public void selectFromDropDown(By locator, String option) {
        List<WebElement> itemPerPageOptions = getListOfElements(locator);

        for(WebElement element : itemPerPageOptions) {
            String text = element.getText();
            if (text.contains(option)) {
                element.click();
            }
        }
    }
    public byte[] takeScreenShot(){
        TakesScreenshot screenshot = (TakesScreenshot) getDriver();
        return  screenshot.getScreenshotAs(OutputType.BYTES);
    }
}
