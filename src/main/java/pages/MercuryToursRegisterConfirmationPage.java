package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MercuryToursRegisterConfirmationPage extends BasePage {
    public MercuryToursRegisterConfirmationPage(WebDriver driver) throws InterruptedException {
        super(driver);
    }

    //Using xpath
    @FindBy(xpath = "*//td/p[1]/font/b")
        private WebElement dearLocator;
    @FindBy(xpath = "*//p/a[1]/font/b")
        private WebElement noteLocator;
    @FindBy(xpath = "*//tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")
        private WebElement usingLocator;

    public String getDearTexts(){
        return dearLocator.getText();
    }

    public String getNoteTexts(){
        return noteLocator.getText();
    }

    public String getUsingTexts(){
        return usingLocator.getText();
    }




}
