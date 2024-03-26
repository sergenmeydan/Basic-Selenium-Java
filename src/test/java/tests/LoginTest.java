package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;

import java.time.Duration;

public class LoginTest {

    private WebDriver cdriver;
    private HomePage homePage;

    @BeforeEach
    void setup(){
        cdriver=new ChromeDriver();
        cdriver.manage().window().maximize();
        homePage=new HomePage(cdriver);
    }

    @Test
    void LoginTest() throws InterruptedException {

        cdriver.get("https://demoqa.com/elements");


        //Elements Close
        WebDriverWait wait = new WebDriverWait(cdriver, Duration.ofSeconds(10L));
        homePage.waitSecond(homePage.elements);
        homePage.click(homePage.elements);
        homePage.waitSecond(homePage.elements);
        homePage.scroll();
        Thread.sleep(2000);



        //Book Store Application open and target click Login
        homePage.click(homePage.bookStoreApplication);
        homePage.waitSecond(homePage.bookStoreApplication);
        homePage.click(homePage.Login);
        Thread.sleep(2000);
        ((JavascriptExecutor)cdriver).executeScript("scroll(0,400)");
        Thread.sleep(2000);



        //Login information
        cdriver.findElement(By.cssSelector("#userName")).sendKeys("demoqa");
        cdriver.findElement(By.cssSelector("#password")).sendKeys("demoqa123");
        cdriver.findElement(By.cssSelector("#login")).click();
        Thread.sleep(2000);


    }

    @AfterEach
    void tearDown(){
        cdriver.close();
    }

}
