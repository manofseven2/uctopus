package ir.uctopus.api.config;

import org.junit.Test;

import static org.junit.Assert.*;

public class FileConfigurationManagerTest {

    private ConfigurationManager fileConfigurationManager = new FileConfigurationManager();

    @Test
    public void getPageNavigationDepth() {
        assertNotNull(fileConfigurationManager);
        assertEquals(3, fileConfigurationManager.getPageNavigationDepth());
    }

    @Test
    public void getRampUpTime() {
        assertNotNull(fileConfigurationManager);
        assertEquals(120, fileConfigurationManager.getRampUpTime());
    }

    @Test
    public void getUrlListAddress() {
        assertEquals("urls.csv", fileConfigurationManager.getUrlListAddress());
    }
}
