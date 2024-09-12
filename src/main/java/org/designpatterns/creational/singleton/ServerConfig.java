package org.designpatterns.creational.singleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ServerConfig {
    private static final String configFilePath = "C:\\Git-hub\\design-patterns\\src\\main\\resources\\config.properties";
    private static volatile ServerConfig instance;
    private final Properties properties;

    private ServerConfig() {
        properties = new Properties();
        loadConfiguration();
        validateConfiguration();
    }

    public static synchronized ServerConfig getInstance() {
        if (instance == null) {
            instance = new ServerConfig();
        }
        return instance;
    }

    private void loadConfiguration() {
        try (FileInputStream input = new FileInputStream(configFilePath)) {
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load configuration", e);
        }
    }

    private void validateConfiguration() {
        if (properties.getProperty("admin.level") == null) {
            throw new RuntimeException("Configuration validation failed: 'admin.level' is missing.");
        }
    }

    public String getAccessLevel(User user) {
        String username = user.getUsername();
        return properties.getProperty(username + ".level", "user");
    }
}
