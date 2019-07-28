package ir.uctopus.api.config;

import java.util.List;

public class UrlProviderImpl implements UrlProvider {
    private static UrlProvider urlProvider;
    private ConfigurationManager configurationManager;
    private ConfigurationFactory configurationFactory;
    private CsvFileReader csvFileReader;

    private UrlProviderImpl() {
        configurationFactory = new ConfigurationFactory();
        configurationManager = configurationFactory.getConfigurationManager();
        String address = configurationManager.getUrlListAddress();
        csvFileReader = new CsvFileReader(ClassLoader.getSystemResource(address).getPath());
    }

    static synchronized UrlProvider getUrlProvider() {
        if (urlProvider == null) {
            urlProvider = new UrlProviderImpl();
        }
        return urlProvider;
    }

    @Override
    public List<String> getListOfUrls() {
        return csvFileReader.getUrls();
    }
}
