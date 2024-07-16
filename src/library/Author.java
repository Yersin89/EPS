package library;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Author {

    private String name;
    private Integer age;
    private List<Book> books;

    public Author(String name, Integer age, List<Book> books) {
        this.name = name;
        this.age = age;
        this.books = books;
    }
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getBookNames() {
        return books.stream().map(Book::getTitle).collect(Collectors.joining(","));
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    public void addBook(Book book) {
        if (this.books!=null){
            this.books.add(book);
        }else{
            this.books = new ArrayList<>();
            this.books.add(book);
        }
    }

    public void printBook()
    {
        System.out.println(name + " " + age + " " + books);
    }
}
