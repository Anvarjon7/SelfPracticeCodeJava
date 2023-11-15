package de.telran.additionalHomeworkPractice;

public class BookDemo {
    public static void main(String[] args) {
        Book book = new Book("Firebreak");

        String bookTitle = book.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}
