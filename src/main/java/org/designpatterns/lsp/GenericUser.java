package org.designpatterns.lsp;

import java.util.HashSet;
import java.util.Set;

public class GenericUser extends AbstractUser {
    private final Set<String> protectedRights;

    GenericUser(HashSet<String> protectedRights) {
        this.protectedRights = protectedRights;
    }

    @Override
    void setupAccessRight(String accessRight, boolean status) {
        if (isNotContainAccessRight(accessRight)) {
            accessRightToStatus.put(accessRight, status);
        }
    }

    private boolean isNotContainAccessRight(String accessRight) {
        return !protectedRights.contains(accessRight);
    }

}
