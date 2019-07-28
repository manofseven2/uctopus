package ir.uctopus.api.config;

import ir.uctopus.api.exception.UctopusConfigurationException;
import ir.uctopus.api.exception.UctopusExceptionMessages;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
class CsvFileReader {
    private String fileAddress;

    List<String> getUrls() {

        try(BufferedReader reader = new BufferedReader(new FileReader(fileAddress))) {
            List<String> list = new ArrayList<>();
            String line = reader.readLine();
            while (line!=null){
                list.add(line.trim());
                line = reader.readLine();
            }
            return list;
        } catch (FileNotFoundException e) {
            throw new UctopusConfigurationException(UctopusExceptionMessages.URL_FILE_NOT_FOUND, e);
        } catch (IOException e) {
            throw new UctopusConfigurationException(UctopusExceptionMessages.COULD_NOT_READ_URLS, e);
        }
    }
}
