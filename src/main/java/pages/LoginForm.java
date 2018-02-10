package pages;

import core.Elem;
import core.MethodsFactory;
import org.openqa.selenium.By;

public class LoginForm extends MethodsFactory {

    private Elem emailInput = new Elem(By.cssSelector("#user"), "Email Input");
    private Elem passInput = new Elem(By.cssSelector("#password"), "Pass Input");
    private Elem loginBtn = new Elem(By.cssSelector("#login"), "Login Button");
    private Elem notificationIcon = new Elem(By.cssSelector(".header-btn-icon.icon-lg.icon-notification.light"), "Kolokolchik");

    public void login(String email, String password) {

        emailInput.type(email);
        passInput.type(password);
        loginBtn.click();
        notificationIcon.isDisplayed();
    }

    public boolean isElementPresent() {
        return notificationIcon.isDisplayed();
    }
}
