package org.designpatterns.behavioral.chain.manager;

public class SpreadsheetHandler extends DocumentHandler {

  public SpreadsheetHandler(DocumentHandler handler) {
    super(handler);
  }

  @Override
 public  void openDocument(String fileExtension) {
    if(fileExtension.equals("xlsx")) {
      System.out.println("Opening spreadsheet document");
    } else {
      super.openDocument(fileExtension);
    }
  }

}
