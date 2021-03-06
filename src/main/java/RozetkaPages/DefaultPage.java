package RozetkaPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DefaultPage {

    WebDriver driver;

    public DefaultPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void implicitWait(long holdTime){
        driver.manage().timeouts().implicitlyWait(holdTime, TimeUnit.SECONDS);
    }

    public void loadPageWaiter (long holdTime){
        new WebDriverWait(driver, holdTime).until(
                webDriver -> ((JavascriptExecutor)webDriver).executeScript("return document.readyState").equals("complete"));
    }

    public void loadElementWaiter(long holdTime, WebElement element){
        WebDriverWait wait= new WebDriverWait(driver, holdTime);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
