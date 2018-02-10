import core.BrowserFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class Login extends BrowserFactory {

    MainPage mainPage = new MainPage();

    @Test
    public void login(){
        mainPage.open();
        mainPage.loginForm.login("loliktest1mail.ru","qwe1rty2");

        Assert.assertTrue("".contains(""));
    }

}
