package pages;

import core.Elem;
import core.MethodsFactory;
import org.openqa.selenium.By;

public class LoginForm extends MethodsFactory {

    private static Elem emailInput = new Elem(By.cssSelector("#user"), "Email Input");
    private static Elem passInput = new Elem(By.cssSelector("#password"), "Pass Input");
    private static Elem loginBtn = new Elem(By.cssSelector("#login"), "Login Button");

    public void login(String email, String password) {

        emailInput.type(email);
        passInput.type(password);
        loginBtn.click();

    }

    //TODO: implements auto login for Vika tests
    public void autoLogin() {
        driver().get("https://trello.com/?method=password&factors%5Buser%5D=testmail4444%40gmail.com&factors%5Bpassword%5D=q1w2e3rt4yui");
    }

    public void open() {
        driver().get(getProp("loginUrl"));
    }
}
