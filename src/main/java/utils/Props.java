package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class Props {

    private static final String relPath = "src/main/resources/trello_tests.properties";


    public String getProp(String parameter) {

        File file = new File(relPath);
        String propPath = file.getAbsolutePath();

        Properties props = new Properties();

        try {
            InputStream in = new FileInputStream(propPath);
            props.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return props.getProperty(parameter);

    }

}
