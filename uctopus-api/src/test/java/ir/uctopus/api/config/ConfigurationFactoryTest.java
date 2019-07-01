package ir.uctopus.api.config;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConfigurationFactoryTest {

    @Test
    public void creationTest(){
        ConfigurationFactory configurationFactory = new ConfigurationFactory();
        assertNotNull(configurationFactory.getConfigurationManager());
    }
}
