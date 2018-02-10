import core.BrowserFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.MainPage;

public class Login extends BrowserFactory {

    MainPage mainPage = new MainPage();


    @DataProvider(name = "emailsAndPassword")
    public Object[][] emailsProvider() {
        return new Object[][]{
                {"romandubovyi@gmail.com", "tktdfnjh1993"},
        };
    }

    @Test(dataProvider = "emailsAndPassword")
    public void login(String email, String password) {
        mainPage.open();
        mainPage.loginForm.login(email, password);
        mainPage.loginForm.isElementPresent();
        Assert.assertTrue(mainPage.loginForm.isElementPresent());
    }

}
