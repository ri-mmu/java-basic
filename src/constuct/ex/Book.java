package constuct.ex;

public class Book {
    String tile;
    String author;
    int page;

    Book(){
        this("", "", 0);
    }

    Book(String tile, String author) {
        this(tile, author, 0);
    }

    Book(String tile, String author, int page) {
        this.tile = tile;
        this.author = author;
        this.page = page;
    }



    void displayInfo(){
        System.out.println("제목: " + tile + ", 저자: " + author + ", 페이지: " + page);
    }
}
