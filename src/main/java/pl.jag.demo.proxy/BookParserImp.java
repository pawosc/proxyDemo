package pl.jag.demo.proxy;

public class BookParserImp implements BookParser {

    private String bookName;

    public BookParserImp(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public Book parseBook() {
        Book book = new Book("978-0135166307", "java core", 999 );
        processing();

        return book;
    }

    private void processing(){
        System.out.println("Parsing the book");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Done ...");
    }


}
