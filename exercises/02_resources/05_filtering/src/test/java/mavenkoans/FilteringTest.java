package mavenkoans;

import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

import static junit.framework.Assert.assertEquals;

public class FilteringTest {

    private static final String PROPERTIES_FILE = "foo.properties";
    private static final String PROPERTY_NAME = "project-version-defined-in-pom";
    private static final String EXPECTED_PROPERTY_VALUE = "1.0-SNAPSHOT";

    @Test
    public void make_sure_properties_are_filtered() throws IOException {
        Properties properties = Filtering.loadProperties(PROPERTIES_FILE);

        assertEquals("foo.properties are not filtered", EXPECTED_PROPERTY_VALUE, properties.getProperty(PROPERTY_NAME));
    }

}
