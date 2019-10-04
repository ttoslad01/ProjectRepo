package StepDef;

import base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.reflect.misc.FieldUtil;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Hook extends BaseUtil {
    private BaseUtil base;
    public Hook(BaseUtil base){
        this.base=base;
    }
    @Before
    public void setUp(){
        String ChromedriverLocation = "src/main/resources/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChromedriverLocation);
        base.driver=new ChromeDriver();
    }
    @After
    public void cleanup() throws Exception{
        takeScreenshot();
        Thread.sleep(3000);
        base.driver.quit();
    }

    private void takeScreenshot() throws Exception {
        File scrFile = ((TakesScreenshot)base.driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("C:/Automation/TestResultsForTA/" + System.currentTimeMillis() + ".png"));
    }
}
