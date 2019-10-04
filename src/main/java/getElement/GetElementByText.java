package getElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;

public class GetElementByText extends BasePage {
    public GetElementByText(WebDriver driver) {
        super(driver);
    }

    public static void main(String[] args) throws InterruptedException {
        String ChromedriverLocation = "src/main/resources/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChromedriverLocation);
        WebDriver driver = new ChromeDriver();

        driver.get("http://newtours.demoaut.com/mercurywelcome.php");
        //String getTextofDear = driver.findElement(By.xpath("//*[text()='REGISTER']")).getText();
        String getTextofDear3 = driver.findElement(By.xpath("*//tbody/tr[4]/td/table/tbody/tr[1]/td/font")).getText();

        Thread.sleep(1000);
        System.out.println(getTextofDear3);
    }
}
