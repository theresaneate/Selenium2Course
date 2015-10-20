import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTestTest {


    @Test

    public void startWebDriver(){

        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://seleniumsimplified.com");

        Assert.assertTrue("title shoudl start with Selenium Simplified", driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();
        driver.quit();

    }
}