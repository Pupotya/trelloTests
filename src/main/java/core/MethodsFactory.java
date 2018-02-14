package core;

import org.openqa.selenium.WebDriver;
import utils.Utils;

public class MethodsFactory extends Utils {
    private static CookieManager cookie = new CookieManager();
    static ThreadLocal<WebDriver> DRIVER = new ThreadLocal<>();

    public static WebDriver driver() {
        return DRIVER.get();
    }

    public boolean isElementPresent(Elem element) {
        return element.isDisplayed();
    }

    //TODO needs refactor:
    public void openAsLoginedUser() {
        driver().get(getProp("baseUrl"));
        cookie.setCookies();
        driver().navigate().refresh();
    }

    private void autoLogin(String email, String password) {
        String autoLoginUrl = getProp("autoLoginLink").replace("{$1}", email).replace("{$2}", password).replace("@", "%40");
        driver().get(autoLoginUrl);
    }

}
