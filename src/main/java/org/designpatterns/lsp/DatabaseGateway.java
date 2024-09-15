package org.designpatterns.lsp;

public class DatabaseGateway {
    static final String WRITE_TO_DATABASE = "write to database";
    private static String database;

    static void writeToDBForce(AbstractUser abstractUser, String message) {
        abstractUser.setupAccessRight(WRITE_TO_DATABASE, true);
        writeToDB(abstractUser, message);
    }

    static void writeToDB(AbstractUser abstractUser, String message) {
        if (abstractUser.getValueOfAccessRight(WRITE_TO_DATABASE)) {
            database = message;
        }
    }

    static String readFromDB() {

        return database;
    }
}
