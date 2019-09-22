package pl.jag.demo.proxy;

public class Book {
    private String ISBN ;
    private String title;
    private int pages;

    public Book(String ISBN, String title, int pages) {
        this.ISBN = ISBN;
        this.title = title;
        this.pages = pages;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }
}
