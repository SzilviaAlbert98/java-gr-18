package homework2;

import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public Book[] addBook(Book bookToAdd){
        Book[] copy = Arrays.copyOf(books, books.length+1);
        copy[books.length] = bookToAdd;
        books = Arrays.copyOf(copy, copy.length);

        return books;
    }

    //polymorphism - method overloading
    public Book[] deleteBook(Book bookToDelete){
        if (books == null) {
            return null;
        } else {
            for (int index = 0; index < books.length; index++){
                if (books[index] == bookToDelete){
                    for (int index2 = index; index2 < books.length - 1; index2++) {
                        books[index2] = books[index2 + 1];
                    }
                    break;
                }
            }
            books[books.length-1] = null;
            return books;
        }
    }

    public Book[] deleteBook(int indexOfElement){
        if (books == null || indexOfElement < 0 || indexOfElement >= books.length) {
            return books;
        } else {
            for (int index = indexOfElement; index < books.length - 1; index++){
                books[index] = books[index + 1];
            }
            books[books.length-1] = null;
            return books;
        }
    }

    public void list(){
        for (Book element : books) {
            if (element != null) {
                System.out.println(element.toString());
            }
        }
    }


}
