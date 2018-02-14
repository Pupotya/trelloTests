package core;

import org.openqa.selenium.Cookie;
import pages.LoginForm;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class CookieManager extends MethodsFactory {

    private static LoginForm loginForm = new LoginForm();

    private static void store(Set<Cookie> sourceSet, String targetFileName) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        for (Cookie setElement : sourceSet) {
            stringBuilder.append(setElement);
            stringBuilder.append(System.lineSeparator());
        }

        String setString = stringBuilder.toString().trim();
        byte[] setBytes = setString.getBytes(StandardCharsets.UTF_8);
        Files.write(Paths.get(targetFileName), setBytes);
    }

    public static void clearCookie() {
        driver().manage().deleteAllCookies();
    }

    public void setCookies() {

        Set<Cookie> kooka = new HashSet<>();
        kooka.add(createCookie("hasAccount", "password", false));
        kooka.add(createCookie("mab", "5a7f6e39989925acbfb88a8f", false));
        kooka.add(createCookie("token", getProp("userToken"), true));
        kooka.add(createCookie("dsc", "fbc3e4d9055c9f18d6486b6fecf90e65c29941d2b39faa7fe0061f614f974932", true));

        for (Cookie getCookie : kooka) {
            driver().manage().addCookie(getCookie);
        }

    }

    private Set<Cookie> getCookies() throws IOException {
        driver().get(getProp("loginUrl"));
        loginForm.login(getProp("testUserEmail"), getProp("testUserPassword"));
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<Cookie> cookiesOfLoginedUser = driver().manage().getCookies();
        store(cookiesOfLoginedUser, "cookies.txt");
        driver().manage().deleteAllCookies();
        driver().navigate().refresh();
        return cookiesOfLoginedUser;
    }

    private void setCookies(Set<Cookie> kooka) throws IOException {
        Set<Cookie> cookies = getCookies();
        for (Cookie getCookie : cookies) {
            driver().manage().addCookie(getCookie);
        }
    }

    private Cookie createCookie(String cookieName, String cookieValue, Boolean isSecure) {
        String dateStr = "Thu Feb 14 00:14:07 EET 2019";
        DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
        Date date = null;
        try {
            date = formatter.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        org.openqa.selenium.Cookie cookie = new org.openqa.selenium.Cookie.Builder(cookieName, cookieValue).path("/").domain("trello.com").expiresOn(date).isHttpOnly(false).isSecure(isSecure).build();
        return cookie;
    }
}
