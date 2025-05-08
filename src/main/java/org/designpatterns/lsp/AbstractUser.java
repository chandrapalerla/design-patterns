package org.designpatterns.lsp;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractUser {
    Map<String, Boolean> accessRightToStatus = new HashMap<>();

    abstract void setupAccessRight(String accessRight, boolean status);

    boolean getValueOfAccessRight(String accessRight) {
        return accessRightToStatus.getOrDefault(accessRight, false);
    }
}
