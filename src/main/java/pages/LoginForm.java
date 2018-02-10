package pages;

import core.Elem;
import core.MethodsFactory;
import org.openqa.selenium.By;

public class LoginForm extends MethodsFactory {

    private Elem emailInput = new Elem(By.cssSelector("#user"), "Email Input");
    public static Elem notificationIcon = new Elem(By.cssSelector(".header-btn-icon.icon-lg.icon-notification.light"), "Kolokolchik");
    private Elem passInput = new Elem(By.cssSelector("#password"), "Pass Input");
    private Elem loginBtn = new Elem(By.cssSelector("#login"), "Login Button");
    public static Elem headerNotification = new Elem(By.cssSelector(".header-banner.mod-warning"), "Notification");
    private Elem regEmail = new Elem(By.cssSelector("#email"), "Email Input");
    private Elem signUp = new Elem(By.cssSelector(".global-header-section-button.mod-primary"), "Sign Up");
    private Elem regSign = new Elem(By.cssSelector("#signup"), "Sign Up");
    private Elem nameInput = new Elem(By.cssSelector("#name"), "Name");

    public void login(String email, String password) {

        emailInput.type(email);
        passInput.type(password);
        loginBtn.click();
    }

    public boolean isElementPresent(Elem element) {
        return element.isDisplayed();
    }


    public void registration(String name, String email, String password) {
        signUp.click();
        nameInput.type(name);
        regEmail.type(email);
        passInput.type(password);
        regSign.click();
    }
}
