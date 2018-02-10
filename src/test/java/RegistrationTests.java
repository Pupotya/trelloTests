import core.BrowserFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.RegistrationPO;

public class RegistrationTests extends BrowserFactory {

    MainPage mainPage = new MainPage();
    RegistrationPO registrationPO = new RegistrationPO();

    @DataProvider(name = "NameEmailsAndPassword")
    public Object[][] namesEmailsProvider() {
        return new Object[][]{
                {randomString(10), randomEmail(), randomString(10)},
                {randomString(8), randomEmail(), randomString(10)},
                {randomString(1), randomEmail(), randomString(10)},

        };
    }

    @Test(dataProvider = "NameEmailsAndPassword")
    public void registrationTest(String name, String email, String password) {
        mainPage.openReg();

        registrationPO.registration(name, email, password);
        try {
            Assert.assertTrue(mainPage.loginForm.isElementPresent(registrationPO.getHeaderNotification()));
        } catch (Exception e) {
            System.out.println("Notification is absent");
        }
        clearCookie();
    }

}
