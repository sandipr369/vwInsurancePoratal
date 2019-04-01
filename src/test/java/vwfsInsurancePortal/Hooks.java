package vwfsInsurancePortal;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Utils{
    @Before
    public void openWebPage(){
        System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://covercheck.vwfsinsuranceportal.co.uk/");
        // Implicitly Wait for Driver
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Maximising Browser
        driver.manage().window().fullscreen();

    }

    @After
    public void closeBrowser(){
        driver.quit();
    }


}
