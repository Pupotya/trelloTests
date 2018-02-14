import core.BrowserFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BoardPage;
import pages.MainPage;
import pages.RegistrationPO;

public class Login extends BrowserFactory {

    MainPage mainPage = new MainPage();
    RegistrationPO registrationPO = new RegistrationPO();
    BoardPage boardPage = new BoardPage();


    @DataProvider(name = "emailsAndPassword")
    public Object[][] emailsProvider() {
        return new Object[][]{
                {"testmail4444@gmail.com", "q1w2e3rt4yui"},
        };
    }

    @Test(dataProvider = "emailsAndPassword", priority = 1)
    public void login(String email, String password) {
        //tyt poka debug
        mainPage.openAsLoginedUser();
//        mainPage.loginForm.open();
//        mainPage.loginForm.login(email, password);
//        mainPage.loginForm.isElementPresent(registrationPO.getHeaderNotification());
        Assert.assertTrue(mainPage.loginForm.isElementPresent(registrationPO.getNotificationIcon()));
    }

    @Test(priority = 2)
    public void createCardTest() throws InterruptedException {
        boardPage.addCard();
        String cardName = boardPage.getNameOfCreatedCard();
        Assert.assertEquals(cardName, "Test card");
    }

    @Test(priority = 3)
    public void archiveCard() throws InterruptedException {
        boardPage.archiveCards();
    }
}
