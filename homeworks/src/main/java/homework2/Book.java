package homework2;

public class Book {
    private String name;
    private int numberOfPages;

    //parametrized constructor
    public Book(String name, int numberOfPages){
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    //methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", number of pages=" + numberOfPages +
                '}';
    }
}