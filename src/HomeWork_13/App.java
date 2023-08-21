package HomeWork_13;

import java.sql.SQLOutput;

public class App {

    public static void main(String[] args) {
        System.out.println("Домашнее задание №13");
        System.out.println(" ");
        //
        Author author = new Author("Иван", "Гончаров");

        Book book = new Book(author,"Обрыв", 1869);
        Author author1 = book.getAuthor();
        System.out.println("Автор - " + author1.getFirstName() + " " + author1.getLastName());
        System.out.println("Название книги - " + book.getNameBook());
        System.out.println("Год издания - " + book.getYearBook());
        book.setYearBook(1736);
        System.out.println("Измененный год издания - " + book.getYearBook());
        System.out.println(" ");

        Author author2 = new Author("Федор", "Достаевкий");

        Book book2 = new Book(author2,"Бесы", 1871);
        Author author3 = book2.getAuthor();
        System.out.println("Автор - " + author3.getFirstName() + " " + author3.getLastName());
        System.out.println("Название книги - " + book2.getNameBook());
        System.out.println("Год издания - " + book2.getYearBook());
        book2.setYearBook(1872);
        System.out.println("Измененный год издания - " + book2.getYearBook());
        System.out.println(" ");

        System.out.println("==========================");
        System.out.println("Часть вторая");
        System.out.println(book);
        System.out.println(book2);
        System.out.println(" ");

        Book c = new Book(author1,"Обрыв", 1871);
        Book c2 = new Book(author1,"Обрыв", 1871);
        System.out.println(c.equals(c2));
        System.out.println(" ");

        Book c3 = new Book(author1,"Обрыв", 1871);
        Book c4 = c3;
        System.out.println(c3.equals(c4));
        System.out.println("Сравнение второй книги с первой - "
                + book2.equals(book));





    }
}
