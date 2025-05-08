package org.designpatterns.behavioral.memento;

import org.designpatterns.behavioral.memento.manager.TextDocument;

public class DocumentViewer {
    private static final TextDocument textDocument = new TextDocument();

    public static void main(String[] args) {
        textDocument.write("hello");
        textDocument.save();
        textDocument.print();
        textDocument.write(" world");
        textDocument.print();
        textDocument.undo();
        textDocument.print();
    }

}
