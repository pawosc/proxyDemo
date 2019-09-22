package pl.jag.demo.proxy;

import java.util.HashMap;

public class BookParserProxy implements BookParser {

    private String bookName;
    private BookParser bookParser;
    private HashMap<String, Book> booksCache = new HashMap<>();

    public BookParserProxy(String bookName) {
        this.bookName = bookName;
        this.bookParser = new BookParserImp(bookName);
    }

    @Override
    public Book parseBook() {
        Book book = booksCache.get(bookName);
        if (book == null) {
            book = bookParser.parseBook();
            booksCache.put(bookName, book);
        } else {
            System.out.println("Retrieved book '" + bookName + "' from cache.");
        }
        return book;
    }
}
