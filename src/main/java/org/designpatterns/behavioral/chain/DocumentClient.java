package org.designpatterns.behavioral.chain;

import org.designpatterns.behavioral.chain.manager.DocumentHandler;
import org.designpatterns.behavioral.chain.manager.SlideshowHandler;
import org.designpatterns.behavioral.chain.manager.SpreadsheetHandler;
import org.designpatterns.behavioral.chain.manager.TextDocumentHandler;

public class DocumentClient {

    public static void main(String[] args) {
        DocumentHandler chain = new SlideshowHandler(new SpreadsheetHandler(new TextDocumentHandler(null)));
        chain.openDocument("ppt");
        chain.openDocument("txt");
    }

}
