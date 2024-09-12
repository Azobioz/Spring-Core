package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Преступление и наказание")
    private String name;

    @Value("Ф. М. Достоевский ")
    private String author;

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    @Value("1886")
    private int yearOfPublication;

    public String getName() {
        return name;
    }
}
