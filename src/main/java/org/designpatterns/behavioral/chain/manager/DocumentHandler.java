package org.designpatterns.behavioral.chain.manager;

public abstract class DocumentHandler {
    private final DocumentHandler next;

    public DocumentHandler(DocumentHandler next) {
        this.next = next;
    }

    public void openDocument(String fileExtension) {
        if (next != null) {
            next.openDocument(fileExtension);
        }
    }

}
