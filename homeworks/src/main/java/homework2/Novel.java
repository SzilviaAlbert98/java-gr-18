package homework2;

public class Novel extends Book {
    private String type;

    //constructor
    public Novel(String name, int numberOfPages, String type) {
        super(name, numberOfPages);
        this.type = type;
    }

    //methods
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Novel{" +  "name='" + this.getName() + '\'' +
                ", number of pages=" + this.getNumberOfPages() +
                ", type='" + type + '\'' +
                '}';
    }
}
