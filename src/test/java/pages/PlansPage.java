package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.SeleniumUtility;

import java.util.List;

public class PlansPage extends SeleniumUtility {
    public static final By PAGE_HEADER_LOCATOR= By.xpath("//div/app-plans-list/mat-card/mat-card-title");

    public static final By TABALE_ROW_LOCATOR=By.xpath("//table/tbody/tr");
    public static final By TABLE_PLAN_EXPIRED=By.xpath("//table/tbody/tr/td[6]");
    public static final By TABLE_PLAN_HEADER=By.xpath("//table/thead/tr/th");


}
