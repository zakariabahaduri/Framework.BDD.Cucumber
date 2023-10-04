package pages;

import org.openqa.selenium.By;

public class AccountsPage {
    public final static By TABLE_ROWS = By.xpath("//table/tbody/tr");

    public final static By ITEM_PER_PAGE_SELECT = By.xpath("//mat-paginator//mat-select");

    public final static By ITEM_PER_PAGE_OPTIONS = By.xpath("//div/mat-option");
    public final static By ITEM_PER_PAGE_FIVE=By.xpath("//div/mat-option[1]/span");
}
