package mavenkoans;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Filtering {

    public static Properties loadProperties(String propertiesFile) throws IOException {
        InputStream stream = Filtering.class.getClassLoader().getResourceAsStream(propertiesFile);
        Properties properties = new Properties();
        properties.load(stream);
        return properties;
    }
}
