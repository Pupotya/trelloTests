package exam;

import java.util.ArrayList;

public class CamelToSnake {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("areFddfCfhfd");
        str.add("areFddfgFfhfd");
        str.add("areFddfgfCfd");

        for (String var : str) {
            String replaced = var.replaceAll("([A-Z]+)", "_$1");
            System.out.println(replaced.toLowerCase());
        }

    }


}
