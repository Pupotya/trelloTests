package core;

import org.openqa.selenium.WebDriver;

public class MethodsFactory {

    static ThreadLocal<WebDriver> DRIVER = new ThreadLocal<>();

    public static WebDriver driver() {
        return DRIVER.get();
    }

    public String randomEmail() {

        return Math.random() + "testmail@gmail.com";
    }

    public String randomPass() {

        return String.valueOf(Math.random() * 100000);
    }

    public String randomName() {

        return "lolololololololololo";
    }
}
