package utils;

public class Utils extends Props {

    private static int randomNumberGenerator(double range) {

        return (int) (Math.round(Math.random() * range));
    }

    public String randomEmail() {

        return randomNumberGenerator(10000) + "testmail@gmail.com";
    }

    public String randomString(int length) {
        String letters = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
        String name = "";
        StringBuffer buffer = new StringBuffer(name);
        for (int i = 0; i < length; i++) {
            char symbol = letters.charAt(randomNumberGenerator(52));

            name = String.valueOf(buffer.append(symbol));
        }
        return name;
    }
}
