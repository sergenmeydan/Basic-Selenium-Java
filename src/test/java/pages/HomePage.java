package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends Page{

    public final String elements = "(//div[@class='icon'])[1]";
    public final String bookStoreApplication = "(//div[contains(@class,'icon')])[6]";

    public final String Login = "(//span[normalize-space()='Login'])[1]";


    public HomePage(WebDriver cdriver) {
        super(cdriver);
    }
}
