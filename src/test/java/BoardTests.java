import core.BrowserFactory;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BoardPage;
import pages.MainPage;

public class BoardTests extends BrowserFactory {

    MainPage mainPage = new MainPage();
    BoardPage boardPage = new BoardPage();

//    @Test(priority = 2)
//    @Story("card test")
//    public void createCardTest() {
//        mainPage.openAsLoginedUser();
//        boardPage.addCard();
//        String cardName = boardPage.getNameOfCreatedCard();
//        Assert.assertEquals(cardName, "Test card");
//    }
//
//    @Test(priority = 3)
//    @Story("archive test")
//    public void archiveCard() {
//        mainPage.openAsLoginedUser();
//        boardPage.openBoard();
//        boardPage.archiveCards();
//    }
}
