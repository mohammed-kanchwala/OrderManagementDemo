package OMSDemo.services;

import java.io.IOException;
import java.net.URL;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class FixerRatesService {

    private String fixerUrl = "http://api.fixer.io/latest";

    @SuppressWarnings("unchecked")
    public Map<String, Object> getFixerRatesData() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new URL(fixerUrl), Map.class);
    }
}
