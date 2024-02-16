package Aggregation;

public class TextBook{
    String title;
    String author;
    String publisher;

    public TextBook() {
        this.title = "";
        this.author = "";
        this.publisher = "";
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
