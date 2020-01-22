package homework2;

public class LibraryMain {
    public static void main(String[] args) {
        Novel novel1 = new Novel("The Great Gatsby", 218, "tragedy");
        Novel novel2 = new Novel("Jane Eyre", 592,"romance");
        Novel novel3 = new Novel("The Little Prince",96, "children' s novel");
        Album album1 = new Album("War of the Worlds",75,"good");
        Album album2 = new Album("Flowers", 120, "medium");
        Album album3 = new Album("Animals", 150, "slow");
        Book book1 = new Book("Romeo and Juliet",480);

        Book[] books = new Book[5];
        books[0] = novel1;
        books[1] = album1;
        books[2] = album2;
        books[3] = novel2;
        books[4] = book1;

        Library library = new Library(books);

        System.out.println("The original library: ");
        library.list();

        library.addBook(novel3);
        library.addBook(album3);
        library.addBook(book1);
        System.out.println();
        System.out.println("The library after adding new books: ");
        library.list();

        library.deleteBook(novel1);
        library.deleteBook(-5);
        System.out.println();
        System.out.println("The library after deleting books: ");
        library.list();
    }
}
