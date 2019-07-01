package ir.uctopus.api.config;

public class ConfigurationFactory {



    public ConfigurationManager getConfigurationManager(){
        return new FileConfigurationManager();
    }
}
