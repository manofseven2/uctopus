package ir.uctopus.api.config;

import ir.uctopus.api.exception.UctopusConfigurationException;
import ir.uctopus.api.exception.UctopusExceptionMessages;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class FileConfigurationManager implements ConfigurationManager {
    private Configuration configuration;
    public FileConfigurationManager() {
        try {
            configuration = new PropertiesConfiguration("uctopus.properties");
        } catch (ConfigurationException e) {
            throw new UctopusConfigurationException(UctopusExceptionMessages.COULD_NOT_LOAD_CONFIGURATION_FILE, e);
        }
    }

    @Override
    public int getPageNavigationDepth() {
        return configuration.getInt(UctopusPropertyKeys.PAGE_NAVIGATION_DEPTH);
    }

    @Override
    public int getRampUpTime() {
        return configuration.getInt(UctopusPropertyKeys.RAMP_UP_TIME_IN_SECONDS);
    }
}
