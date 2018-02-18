import core.BrowserFactory;
import core.CookieManager;
import core.Elem;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.RegistrationPO;


public class RegistrationTests extends BrowserFactory {

    RegistrationPO registrationPO = new RegistrationPO();

    @DataProvider(name = "NameEmailsAndPassword")
    public Object[][] namesEmailsProvider() {
        return new Object[][]{
                {"testuser", "testmail4444@gmail.com", "q1w2e3rt4yui", getProp("emailIsInUseError"), registrationPO.getMainError(), true},
                {randomString(10), randomString(10), randomString(10), getProp("emailError"), registrationPO.getEmailError(), true},
                {randomString(8), randomEmail(), randomString(10), null, null, false},
                {randomString(1), randomEmail(), randomString(10), null, null, false},

        };
    }

    @Test(dataProvider = "NameEmailsAndPassword")
    public void registrationTest(String name, String email, String password, String expectedResult, Elem elem, boolean error) {
        registrationPO.open();
        registrationPO.registration(name, email, password);
        registrationPO.checkForErrors(expectedResult, elem, error);
        CookieManager.clearCookie();
    }


}
