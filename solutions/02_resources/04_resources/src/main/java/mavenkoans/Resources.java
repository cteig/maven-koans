package mavenkoans;

import java.io.File;
import java.net.URL;

public class Resources
{
    public static boolean resourceExists(String filename) {
        URL url = Resources.class.getClassLoader().getResource(filename);
        boolean fileExists = url != null;
        return fileExists;
    }
}
