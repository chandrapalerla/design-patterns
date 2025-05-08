package org.designpatterns.creational.singleton;

public class InsufficientRightsException extends RuntimeException {
    private User user;
    private String accessedPath;

    public InsufficientRightsException(User user, String accessedPath) {
        super("User " + user.getUsername() + " does not have sufficient rights to access " + accessedPath);
        this.user = user;
        this.accessedPath = accessedPath;
    }

    public User getUser() {
        return user;
    }

    public String getAccessedPath() {
        return accessedPath;
    }
}
