package mavenkoans;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    private App app = new App();

    public static final String FILENAME = "foo.properties";

    public void testApp()
    {
        boolean fileExists = app.fileExists(FILENAME);

        assertTrue("Tekst som beskriver at filen burde eksistert", fileExists);
    }

}
