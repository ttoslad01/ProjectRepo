package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriverWait wait;
    public BasePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver,20);
    }

    public void waitForVisibilityOfElement(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void sendKeys(WebElement element, String keyword){
        waitForVisibilityOfElement(element);
        element.clear();
        element.sendKeys(keyword);
    }
    public void sendKeys(WebElement element, String keywordA, String keywordB){
        waitForVisibilityOfElement(element);
        element.clear();
        element.sendKeys(keywordA + keywordB);
    }
    public void click(WebElement element){
        waitForVisibilityOfElement(element);
        element.click();
    }
    public void selectFromDropDown(WebElement element,String text2){
        waitForVisibilityOfElement(element);
        Select sf = new Select(element);
        sf.selectByVisibleText(text2);
    }
}
