package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class VersionService {

    @Value("${info.app.version}")
    private String version;

    public String getVersion() {
        return version;
    }

}
