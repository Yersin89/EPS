package library;

public class Book {

    private String title;
    private Integer page;
    private String author;
    private String genre;

    public Book(String title, Integer page, String author, String genre) {
        this.title = title;
        this.page = page;
        this.author = author;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "library.Book{" +
                "title='" + title + '\'' +
                ", page=" + page +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void printBook()
    {
        System.out.println(title + " " + page + " " + author + " " + genre);
    }
}
