package pl.jag.demo.proxy;

public class Main {

    public static void main(String[] args) {
        String someBookToPars = "java";

        BookParserProxy  proxy = new BookParserProxy(someBookToPars);

        Book book = proxy.parseBook();
        System.out.println(book);

        Book bookCache = proxy.parseBook();
        System.out.println(bookCache);
    }
}
