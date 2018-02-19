package pages;

import core.MethodsFactory;

public class MainPage extends MethodsFactory {

    public LoginForm loginForm = new LoginForm();

    public void open() {
        driver().get(getProp("baseUrl"));
    }



}
