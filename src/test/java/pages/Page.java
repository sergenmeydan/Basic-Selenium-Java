package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Page {

    WebDriver cdriver;

    public Page(WebDriver cdriver){
        this.cdriver=cdriver;
    }

    public void waitSecond(String elementId){
        WebDriverWait wait = new WebDriverWait(cdriver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementId)));
    }

    public void click(String clickxpath){
        cdriver.findElement(By.xpath(clickxpath)).click();
    }

    public void scroll(){
        ((JavascriptExecutor)cdriver).executeScript("scroll(0,400)");
    }
}
