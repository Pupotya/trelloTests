package pages;

import core.Elem;
import core.MethodsFactory;
import org.openqa.selenium.By;

public class BoardPage extends MethodsFactory {

    private Elem newCardName = new Elem(By.cssSelector(".open-card-composer"));
    private Elem addCardBtn = new Elem(By.cssSelector(".primary.confirm.mod-compact"));
    private Elem textField = new Elem(By.cssSelector(".list-card-composer-textarea"));
    private Elem createdCard = new Elem(By.cssSelector(".list-card-title.js-card-name"));
    private Elem dropDown = new Elem(By.cssSelector(".list-header-extras-menu.dark-hover.js-open-list-menu"));
    private Elem archiveAllCard = new Elem(By.cssSelector(".js-archive-cards"));
    private Elem confirmBtn = new Elem(By.cssSelector(".js-confirm.full.negate"));


    public void openBoard() {
        driver().get(getProp("baseUrl") + getProp("openBoardUrl"));
    }

    public void addCard() {
        openBoard();
        newCardName.click();
        textField.type("Test card");
        addCardBtn.click();
    }

    public String getNameOfCreatedCard() {

        return createdCard.getText();
    }

    public void openDropDown() {
        dropDown.click();
    }

    public void archiveCards() {
        openDropDown();
        archiveAllCard.click();
        confirmBtn.click();

    }
}
