package ir.uctopus.api.config;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UrlProviderImplTest {

    @Test
    public void getListOfUrls() {
        UrlProvider urlProvider = UrlProviderImpl.getUrlProvider();
        assertNotNull(urlProvider);
    }
}