package core;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BrowserFactory extends MethodsFactory {

    @BeforeTest
    public void setUp(){
        DRIVER.set(new ChromeDriver());
    }
    @AfterTest
    public void tearDown(){
        driver().close();
    }

}
