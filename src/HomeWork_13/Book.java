package HomeWork_13;

import java.util.Objects;

public class Book {
    private Author author;
    private String nameBook;
    private int yearBook;


    public Book ( Author author, String nameBook, int yearBook) {
        this.author = author;
        this.nameBook = nameBook;
        this.yearBook = yearBook;

    }

    public Author getAuthor() {
        return author;

    }

    public String getNameBook(){
        return this.nameBook;
    }
    public int getYearBook(){
        return this.yearBook;
    }

    public void setYearBook(int yearBook){
        this.yearBook = yearBook;
    }
    @Override
    public String toString() {
        return author + ": " + this.nameBook + " " + this.yearBook;
    }
    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass()) return false;
        Book book = (Book) ob;
        return Objects.equals(author, book.author) && Objects.equals(nameBook, book.nameBook)  && yearBook == book.yearBook;
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, nameBook, yearBook);
    }


}

