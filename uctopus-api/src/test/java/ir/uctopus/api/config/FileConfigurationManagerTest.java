package ir.uctopus.api.config;

import org.junit.Test;

import static org.junit.Assert.*;

public class FileConfigurationManagerTest {

    @Test
    public void getPageNavigationDepthSuccessTest(){
        ConfigurationManager fileConfigurationManager = new FileConfigurationManager();
        assertNotNull(fileConfigurationManager);
        assertEquals(3, fileConfigurationManager.getPageNavigationDepth());
    }
    @Test
    public void getRampUpTimeTest(){
        ConfigurationManager fileConfigurationManager = new FileConfigurationManager();
        assertNotNull(fileConfigurationManager);
        assertEquals(120, fileConfigurationManager.getRampUpTime());
    }
}
