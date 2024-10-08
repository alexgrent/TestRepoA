package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;


@Service
public class VersionService {

    @Autowired
    private Environment environment;

    public String getVersion() {
        String version = environment.getProperty("info.app.version");
        return version != null ? version : "default-version";
    }
}
