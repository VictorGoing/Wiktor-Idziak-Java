package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser){
        List<Book> listbook = new ArrayList<Book>();
        return listbook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookLibrary)) return false;
        BookLibrary that = (BookLibrary) o;
        return Objects.equals(libraryDatabase, that.libraryDatabase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(libraryDatabase);
    }
}
