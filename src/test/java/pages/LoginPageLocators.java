package pages;

import org.openqa.selenium.By;

public class LoginPageLocators {
    public static final By HEADER_TITLE= By.xpath("//mat-toolbar/span[1]");
    public static final By SECTION_TITLE=By.xpath("//div/mat-card/mat-card-title[1]/strong");
    public static final By SUBMIT_BUTTON=By.id("loginButton");
    public static final By USERNAME=By.name("username");
    public static final By PASSWORD=By.name("password");
    public static final By ERROR_MESSAGE=By.xpath("//mat-card-content/app-banner/div");
}
