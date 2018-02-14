package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class Props {

    private static final String relPath = "src/main/resources/trello_tests.properties";
    private static File file = new File(relPath);
    private static Properties props = new Properties();

    public String getProp(String parameter) {

        String propPath = file.getAbsolutePath();

        try {
            InputStream in = new FileInputStream(propPath);
            props.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return props.getProperty(parameter);

    }

}
