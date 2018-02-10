package pages;

import core.Elem;
import core.MethodsFactory;
import org.openqa.selenium.By;

public class BoardPage extends MethodsFactory {

    private Elem testedBoard = new Elem(By.name("Create and Update"));
    private Elem newCardName = new Elem(By.cssSelector(".open-card-composer"));
    private Elem addCardBtn = new Elem(By.cssSelector(".primary.confirm.mod-compact"));

    private Elem textField = new Elem(By.cssSelector(".list-card-composer-textarea"));

    private Elem createdCard = new Elem(By.cssSelector(".list-card-title.js-card-name"));


    private Elem dropDown = new Elem(By.cssSelector(".list-header-extras-menu.dark-hover.js-open-list-menu"));

    private Elem archiveAllCard = new Elem(By.cssSelector(".js-archive-cards"));

    private Elem confirmBtn = new Elem(By.cssSelector(".js-confirm.full.negate"));


//    public void openTestedBoard() {
//        testedBoard.click();
//    }

    public void openBoard() {
        driver().get("https://trello.com/b/whHcwYyv/create-and-update");
    }


    public void addCard() throws InterruptedException {
        openBoard();
        newCardName.click();
        Thread.sleep(1000);
        textField.type("Test card");
        addCardBtn.click();
        Thread.sleep(1000);
    }

    public String getNameOfCreatedCard() {

        return createdCard.getText();
    }

    public void openDropDown() throws InterruptedException {
        dropDown.click();
        Thread.sleep(2000);
    }

    public void archiveCards() throws InterruptedException {
        openDropDown();
        archiveAllCard.click();
        Thread.sleep(1000);
        confirmBtn.click();

    }
}
