package mavenkoans;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ResourcesTest {
    public static final String FILENAME = "foo.properties";

    @Test
    public void make_sure_properties_file_is_copied_into_target_classes() {
        assertTrue("Could not find " + FILENAME + ". Are you sure it is located in mavens default resource directory?", Resources.resourceExists(FILENAME));
    }

}
