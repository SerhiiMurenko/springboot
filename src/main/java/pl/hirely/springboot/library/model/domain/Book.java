package pl.hirely.springboot.library.model.domain;

import javax.persistence.*;

@Entity
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue
    private  long id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "title")
    private String title;

    public Book(long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    @Column(name = "description")
    private String description;





}
