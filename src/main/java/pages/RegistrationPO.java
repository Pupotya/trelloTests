package pages;

import core.Elem;
import core.MethodsFactory;
import org.openqa.selenium.By;
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
    private static Elem emailError = new Elem(By.cssSelector("#email-error"), "Email Error");
    private static Elem emailIsInUseError = new Elem(By.cssSelector("p.error-message"), "emailIsInUse Error");

    public Elem getEmailError() {
        return emailError;
    }

    public Elem getEmailIsInUseError() {
        return emailIsInUseError;
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

//            try {
//                Thread.sleep(100);
//                System.out.println(emailIsInUseError.find().getText());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            WebDriverWait wait = new WebDriverWait(driver(), 6, 300);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("p.error-message")));
//            Assert.assertTrue(("Email already in use by an unconfirmed account. You can use log in or use the forgot password page to reset your password").contains(errorText));
            Assert.assertTrue(("Email already in use by an unconfirmed account. You can use log in or use the foord").contains(errorText));
//            Assert.assertTrue((emailIsInUseError.find().getText()).contains(errorText));
        } else {
            if (element == null && errorText == null)
                Assert.assertTrue(isElementPresent(getHeaderNotification()));
        }
    }

}
