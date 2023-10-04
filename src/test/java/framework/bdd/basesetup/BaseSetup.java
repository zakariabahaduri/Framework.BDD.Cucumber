package framework.bdd.basesetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseSetup {
    private static WebDriver driver;
   // public final String url="https://qa.insurance.tekschool-students.com/";
  //  private final static String browser_Type="firefox";
    public void openBrowser() {
        String configPathFile=System.getProperty("user.dir") +"/src/test/resources/configs/config.properties" ;
        Properties properties= new Properties();



            try {
          FileInputStream      configFile = new FileInputStream(configPathFile);
                properties.load(configFile);
            } catch (IOException e){
                e.getStackTrace();
            }


        String baseURL=properties.getProperty("url");
         String browserType=properties.getProperty("browser");
        //String baseURL="https://qa.insurance.tekschool-students.com/";
      // String browserType="chrome";
        System.out.println("This is the browser type: "+browserType);
        System.out.println("This is the url "+ baseURL);

        if (browserType.equalsIgnoreCase("chrome")) {
            driver= new ChromeDriver();
        }
        else if (browserType.equalsIgnoreCase("firefox")) {
            driver=new FirefoxDriver();
        }
        else if (browserType.equalsIgnoreCase("edge")){
            driver= new EdgeDriver();

        }
        else {
            throw new RuntimeException("Wrong browser type");
        }


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        driver.get(baseURL);



    }
    public void closeBrowser() {
        if(driver !=null) {
            driver.quit();
        }
    }
    public WebDriver getDriver(){
        return driver;
    }
}
