package org.designpatterns.creational.singleton;

public class AccessChecker {
    private static volatile AccessChecker instance;
    private final ServerConfig config = ServerConfig.getInstance();

    private AccessChecker() {
        // initialization...
    }

    public static synchronized AccessChecker getInstance() {
        if (instance == null) {
            instance = new AccessChecker();
        }
        return instance;
    }

    public boolean mayAccess(User user, String path) {
        String userLevel = config.getAccessLevel(user);
        return !path.startsWith("/admin") || userLevel.equals("admin");
    }
}
