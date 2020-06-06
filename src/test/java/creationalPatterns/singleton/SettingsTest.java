package creationalPatterns.singleton;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SettingsTest {

    private String host = "localhost";
    private String user = "admin";
    private String pass = "123admin";

    @Test
    void checkStringProperties() {
        assertEquals(Settings.getInstance().getDatabaseHost(), host);
        assertEquals(Settings.getInstance().getDatabaseUser(), user);
        assertEquals(Settings.getInstance().getDatabasePass(), pass);
    }

    @Test
    void checkIntegerIncrementation() {
        for (int i = 0; i < 2; i++) {
            assertEquals(Settings.getInstance().getNumberOfConnections(), i);
            Settings.getInstance().increaseNumberOfConnections();
            assertEquals(Settings.getInstance().getNumberOfConnections(), i + 1);
        }
    }

}
