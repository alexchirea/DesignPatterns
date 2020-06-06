package creationalPatterns.singleton;

public final class Settings {

    private String databaseHost = "localhost";
    private String databaseUser = "admin";
    private String databasePass = "123admin";
    private Integer numberOfConnections = 0;

    private static volatile Settings instance;

    private Settings() {}

    public static Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }

    public String getDatabaseHost() {
        return databaseHost;
    }

    public String getDatabaseUser() {
        return databaseUser;
    }

    public String getDatabasePass() {
        return databasePass;
    }

    public Integer getNumberOfConnections() {
        return numberOfConnections;
    }

    public void increaseNumberOfConnections() {
        numberOfConnections++;
    }

}
