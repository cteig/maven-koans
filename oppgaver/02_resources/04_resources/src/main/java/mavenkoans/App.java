package mavenkoans;

import java.io.File;

public class App
{
    public boolean fileExists(String filename) {
        File file = new File(this.getClass().getClassLoader().getResource(filename).getFile());
        return file.exists();
    }
}
