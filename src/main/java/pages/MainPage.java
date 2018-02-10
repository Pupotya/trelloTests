package pages;

import core.MethodsFactory;

public class MainPage extends MethodsFactory {

    private String pageUrl = "https://trello.com/login";
    private String regUrl = "https://trello.com";

    public LoginForm loginForm = new LoginForm();

    public void open() {
        driver().get(pageUrl);
    }

    public void openReg() {
        driver().get(regUrl);
    }
}
