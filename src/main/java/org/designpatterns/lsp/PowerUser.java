package org.designpatterns.lsp;

class PowerUser extends AbstractUser {
    @Override
    void setupAccessRight(String accessRight, boolean status) {
        accessRightToStatus.put(accessRight, status);
    }
}
