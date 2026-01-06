package config;

public class AppConfig {

    private static AppConfig instance;

    private String appName;
    private String environment;
    private int port;
    private String storageMode;

    private AppConfig() {

        this.appName = "TaskBoard";
        this.environment = "DEV";
        this.port = 8080;
        this.storageMode = "MEMORY";
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public String getAppName() {
        return appName;
    }

    public String getEnvironment() {
        return environment;
    }

    public int getPort() {
        return port;
    }

    public String getStorageMode() {
        return storageMode;
    }
}
