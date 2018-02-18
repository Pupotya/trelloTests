package pages;

import core.Elem;
import core.MethodsFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class RegistrationPO extends MethodsFactory {

    private static Elem signUp = new Elem(By.cssSelector(".global-header-section-button.mod-primary"), "Sign Up");
    private static Elem regSign = new Elem(By.cssSelector("#signup"), "Sign Up");
    private static Elem nameInput = new Elem(By.cssSelector("#name"), "Name");
    private static Elem notificationIcon = new Elem(By.cssSelector(".header-btn-icon.icon-lg.icon-notification.light"), "Kolokolchik");
    private static Elem headerNotification = new Elem(By.cssSelector(".header-banner.mod-warning"), "Notification");
    private static Elem regEmail = new Elem(By.cssSelector("#email"), "Email Input");
    private static Elem passInput = new Elem(By.cssSelector("#password"), "Pass Input");
    private static Elem mainError = new Elem(By.cssSelector("#error>p"), "Main Error");
    private static Elem emailError = new Elem(By.cssSelector("p.error-message"), "Email Error");

    public Elem getMainError() {
        return mainError;
    }

    public Elem getEmailError() {
        return emailError;
    }

    public Elem getNotificationIcon() {
        return notificationIcon;
    }

    public Elem getHeaderNotification() {
        return headerNotification;
    }

    public void registration(String name, String email, String password) {
        nameInput.type(name);
        regEmail.type(email);
        passInput.type(password);
        regSign.click();
    }

    public void open() {
        driver().get(getProp("baseUrl") + getProp("regUrl"));
    }

    public void checkForErrors(String errorText, Elem element, boolean isErrorPresent) {

        if (isErrorPresent) {
            Assert.assertTrue(element.getText().equals(errorText));
        } else {
            if (element == null && errorText == null)
                Assert.assertTrue(isElementPresent(getHeaderNotification()));
        }
    }

}
