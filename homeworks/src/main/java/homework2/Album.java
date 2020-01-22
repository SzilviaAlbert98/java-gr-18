package homework2;

public class Album extends Book {
    private String paperQuality;

    public Album(String name, int numberOfPages, String paperQuality) {
        super(name, numberOfPages);
        this.paperQuality = paperQuality;
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }

    @Override
    public String toString() {
        return "Album{" +  "name='" + this.getName() + '\'' +
                ", number of pages=" + this.getNumberOfPages() +
                ", paper quality='" + paperQuality + '\'' +
                '}';
    }
}
