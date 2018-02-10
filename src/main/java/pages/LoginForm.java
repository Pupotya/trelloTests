package pages;

import core.Elem;
import core.MethodsFactory;
import org.openqa.selenium.By;

public class LoginForm extends MethodsFactory {

    private Elem emailField = new Elem(By.cssSelector("#user-email"), "Email Field");
    private Elem passwordField = new Elem(By.cssSelector("#user-password"), "Password Field");
    private Elem submitBtn = new Elem(By.cssSelector("#sign-in-form .submit"), "Submit Button");


    public void login(String email, String password) {
        emailField.type(email);
        passwordField.type(password);
        submitBtn.click();
    }

}
