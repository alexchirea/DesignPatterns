package creationalPatterns.singleton;

public class Example {

    public static void main(String[] args) {
        System.out.println("The number of concurent connections is " + Settings.getInstance().getNumberOfConnections());
        System.out.println("The database host is " + Settings.getInstance().getDatabaseHost());
        String username = Settings.getInstance().getDatabaseUser();
        String password = Settings.getInstance().getDatabasePass();
        System.out.println("You can connect with " + username + " and " + password);

        Settings.getInstance().increaseNumberOfConnections();
        Settings.getInstance().increaseNumberOfConnections();
        Settings.getInstance().increaseNumberOfConnections();
        System.out.println("The number of concurent connections is " + Settings.getInstance().getNumberOfConnections());
    }

}
