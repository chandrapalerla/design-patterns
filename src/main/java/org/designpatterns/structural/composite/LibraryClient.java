package org.designpatterns.structural.composite;

import org.designpatterns.structural.composite.manager.Book;
import org.designpatterns.structural.composite.manager.BookCollection;
import org.designpatterns.structural.composite.manager.FictionBook;
import org.designpatterns.structural.composite.manager.NonfictionBook;

public class LibraryClient {

    public static void main(String[] args) {

        NonfictionBook nonfictionBook = new NonfictionBook("A Brief History of Time");
        FictionBook fictionBookOne = new FictionBook("Hamlet", true);
        FictionBook fictionBookTwo = new FictionBook("The Great Gatsby", false);

        BookCollection bookCollection = new BookCollection();
        bookCollection.addNonfictionBook(nonfictionBook);
        bookCollection.addFictionBook(fictionBookOne);
        bookCollection.addFictionBook(fictionBookTwo);

        checkoutBook(nonfictionBook);
        checkoutBook(fictionBookOne);
        checkoutBook(bookCollection);

        returnBook(nonfictionBook);
        returnBook(fictionBookOne);
        returnBook(bookCollection);

    }

    public static void checkoutBook(Book book) {
        book.checkout();
    }

    public static void returnBook(Book book) {
        book.returnBook();
    }
}
