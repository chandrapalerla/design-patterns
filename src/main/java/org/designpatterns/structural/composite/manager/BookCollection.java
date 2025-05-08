package org.designpatterns.structural.composite.manager;

import java.util.ArrayList;

public class BookCollection implements Book {

    private final ArrayList<NonfictionBook> nonfictionBooks = new ArrayList();
    private final ArrayList<FictionBook> fictionBooks = new ArrayList();

    public void addNonfictionBook(NonfictionBook nonfictionBook) {
        nonfictionBooks.add(nonfictionBook);
    }

    public void addFictionBook(FictionBook fictionBook) {
        fictionBooks.add(fictionBook);
    }

    @Override
    public void checkout() {
        nonfictionBooks.forEach(NonfictionBook::checkout);
        fictionBooks.forEach(FictionBook::checkout);
    }

    @Override
    public void returnBook() {
        nonfictionBooks.forEach(NonfictionBook::returnBook);
        fictionBooks.forEach(FictionBook::returnBook);
    }

}
