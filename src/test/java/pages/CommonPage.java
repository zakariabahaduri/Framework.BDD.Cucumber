package pages;

import org.openqa.selenium.By;

public class CommonPage {
    public static By getLinkText(String linktext){
return By.partialLinkText(linktext);

    }}
