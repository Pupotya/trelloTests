package pages;

import core.Elem;
import core.MethodsFactory;
import org.openqa.selenium.By;

public class RegistrationPO extends MethodsFactory {

    private static Elem signUp = new Elem(By.cssSelector(".global-header-section-button.mod-primary"), "Sign Up");
    private static Elem regSign = new Elem(By.cssSelector("#signup"), "Sign Up");
    private static Elem nameInput = new Elem(By.cssSelector("#name"), "Name");
    private static Elem notificationIcon = new Elem(By.cssSelector(".header-btn-icon.icon-lg.icon-notification.light"), "Kolokolchik");
    private static Elem headerNotification = new Elem(By.cssSelector(".header-banner.mod-warning"), "Notification");
    private static Elem regEmail = new Elem(By.cssSelector("#email"), "Email Input");
    private static Elem passInput = new Elem(By.cssSelector("#password"), "Pass Input");

    public Elem getNotificationIcon() {
        return notificationIcon;
    }

    public Elem getHeaderNotification() {
        return headerNotification;
    }

    public void registration(String name, String email, String password) {
        signUp.click();
        nameInput.type(name);
        regEmail.type(email);
        passInput.type(password);
        regSign.click();
    }
}
