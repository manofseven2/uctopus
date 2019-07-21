package ir.uctopus.api.config;

import java.util.List;

public class UrlProviderImpl implements UrlProvider {
    private static UrlProvider urlProvider;
    private static Object lock = new Object();

    private ConfigurationManager configurationManager;
    private ConfigurationFactory configurationFactory;
    private UrlProviderImpl() {
        configurationFactory = new ConfigurationFactory();
        configurationManager = configurationFactory.getConfigurationManager();
        String address = configurationManager.getUrlListAddress();
    }

    public static UrlProvider getUrlProvider() {
        if (urlProvider == null) {
            synchronized (lock) {
                if (urlProvider == null) {
                    urlProvider = new UrlProviderImpl();
                }
            }
        }
        return urlProvider;
    }

    @Override
    public List<String> getListOfUrls() {
        return null;
    }
}
