package pages;

import core.Elem;
import core.MethodsFactory;
import org.openqa.selenium.By;

public class LoginForm extends MethodsFactory {

    //    private Elem emailField = new Elem(By.cssSelector("#user-email"), "Email Field");
//    private Elem passwordField = new Elem(By.cssSelector("#user-password"), "Password Field");
//    private Elem submitBtn = new Elem(By.cssSelector("#sign-in-form .submit"), "Submit Button");
//    private Elem signupBtn = new Elem(By.cssSelector("div.global-header-section.mod-right>.global-header-section-button.mod-primary"), "Signup Button");
    private Elem emailInput = new Elem(By.cssSelector("#user"), "Email Input");
    private Elem passInput = new Elem(By.cssSelector("#password"), "Pass Input");
    private Elem loginBtn = new Elem(By.cssSelector("#login"), "Login Button");

    public void login(String email, String password) {

        emailInput.type(email);
        passInput.type(password);
        loginBtn.click();
    }

}
