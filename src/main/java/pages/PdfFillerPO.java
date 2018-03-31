package pages;

import core.Elem;
import core.MethodsFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PdfFillerPO extends MethodsFactory {

    private static Elem email = new Elem(By.cssSelector("#form-login-email"));
    private static Elem password = new Elem(By.cssSelector("#form-login-password"));
    private static Elem loginBtn = new Elem(By.cssSelector("#form-login-submit"));
    private static Elem profileIcon = new Elem(By.cssSelector(".h-ac__toggle"));
    private static Elem logoutBtn = new Elem(By.cssSelector(".ac-dropdown__navLink:last-child"));
    private static Elem duplicate = new Elem(By.cssSelector(".g-ibtn.i-duplicate"));
    private static Elem orangeBtn = new Elem(By.cssSelector(".modal-actions-btns.text-right .btn.-sm.-orange"));
    private static Elem documentRow = new Elem(By.cssSelector(".react-contextmenu-wrapper"));
    private static Elem renameIcon = new Elem(By.cssSelector(".g-ibtn.i-rename:nth-child(3)"));
    private static Elem renameInput = new Elem(By.cssSelector(".modal-body .form-control.small"));
    private static Elem fileName = new Elem(By.cssSelector(".react-contextmenu-wrapper .mf-doc-item__col.mf-doc-item__col--overflow .mf-doc-item__row:first-child span"));
    private static Elem addFolderIcon = new Elem(By.cssSelector(".mf-icon-add-folder"));
//    private static Elem loader = new Elem(By.cssSelector(".g-loader__circle"));


    public void open() {
        driver().get(getProp("PdfFiller"));
    }

    public void login() {
        email.type("popo@eth2btc.info");
        password.type("popo");
        loginBtn.click();
    }

    public void logOut() {
        profileIcon.click();
        logoutBtn.click();
    }

    public void waitForLoader() {
        WebDriverWait wait = new WebDriverWait(driver(), 6, 300);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".g-loader__circle")));
    }

    public void duplicateClick() {
        duplicate.click();
    }

    public void clickOrangeBtn() {
        orangeBtn.click();
    }

    public int getCountOfFiles() {
        return documentRow.findElements().size();
    }

    public void clickRenameIcon() {
        renameIcon.click();
    }

    public void typeToInput() {
        renameInput.type("Test");
    }

    public String getFileName() {
        return fileName.getText();
    }

    public void addFolder() {
        addFolderIcon.click();

    }
}
