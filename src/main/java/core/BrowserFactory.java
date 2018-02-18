package core;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BrowserFactory extends MethodsFactory {

    @BeforeClass
    public void setUp(){
        DRIVER.set(new ChromeDriver());
    }

    @AfterClass
    public void tearDown(){
        driver().close();
    }

}
