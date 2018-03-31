import core.BrowserFactory;
import core.CookieManager;
import core.Elem;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import io.qameta.allure.model.Label;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.RegistrationPO;

@Epic("Registration")
public class RegistrationTests extends BrowserFactory {

    RegistrationPO registrationPO = new RegistrationPO();

    @DataProvider(name = "NameEmailsAndPassword")
    public Object[][] namesEmailsProvider() {
        return new Object[][]{
                {"testuser", "testmail4444@gmail.com", "q1w2e3rt4yui", getProp("emailIsInUseError"), registrationPO.getEmailIsInUseError(), true},
//                {randomString(1), randomEmail(), randomString(10), null, null, false},
//                {randomString(10), randomString(10), randomString(10), getProp("emailError"), registrationPO.getEmailError(), true},
//                {randomString(8), "dasds@sdaaasd", randomString(10), getProp("emailReceiveError"), registrationPO.getEmailError(), true},

        };
    }
    @Test(dataProvider = "NameEmailsAndPassword")
    @Story("registrationFromRegPO")
    @Description("This is an example test suite")
    public void registrationTest(String name, String email, String password, String expectedResult, Elem elem, boolean error) {
        Allure.addLabels(new Label().withName("epic").withValue("registration should be passed"));
        registrationPO.open();
        registrationPO.registration(name, email, password);
        registrationPO.checkForErrors(expectedResult, elem, error);
        CookieManager.clearCookie();
    }


}
