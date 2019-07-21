package ir.uctopus.api.config;

import ir.uctopus.api.exception.UctopusConfigurationException;
import ir.uctopus.api.exception.UctopusExceptionMessages;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CsvFileReaderTest {

    private static final String FILE_NAME = "test.com";
    private static final String NOT_EXISTS_FILE_NAME = "urls2.csv";

    @Test
    public void getUrls() {
        CsvFileReader csvFileReader = new CsvFileReader(ClassLoader.getSystemResource("urls.csv").getPath());
        List<String> urls = csvFileReader.getUrls();
        assertNotNull(urls);
        assertTrue(urls.size()>0);
        assertEquals(FILE_NAME, urls.get(0));
    }
    @Test(expected = UctopusConfigurationException.class)
    public void getUrlsExceptionTest() {
        CsvFileReader csvFileReader = new CsvFileReader(NOT_EXISTS_FILE_NAME);
        List<String> urls = csvFileReader.getUrls();
        fail();
    }
}