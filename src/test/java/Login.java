import core.BrowserFactory;
import core.CookieManager;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.RegistrationPO;

public class Login extends BrowserFactory {

    MainPage mainPage = new MainPage();
    RegistrationPO registrationPO = new RegistrationPO();

    @DataProvider(name = "emailsAndPassword")
    public Object[][] emailsProvider() {
        return new Object[][]{
                {"testmail4444@gmail.com", "q1w2e3rt4yui"},
        };
    }

    @Test(dataProvider = "emailsAndPassword")
    public void login(String email, String password) {

        mainPage.loginForm.open();
        mainPage.loginForm.login(email, password);
        mainPage.loginForm.isElementPresent(registrationPO.getHeaderNotification());
        Assert.assertTrue(mainPage.loginForm.isElementPresent(registrationPO.getNotificationIcon()));
        CookieManager.clearCookie();
    }


}
