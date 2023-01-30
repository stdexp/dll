package app.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.*;


@Entity
@Table(name="categories") 
public class Category {

    static public Category TODO = new Category("todo");
    static public Category WIP = new Category("wip");
    static public Category DONE = new Category("done");

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="category_id")
    @Getter @Setter
    private Long id;

    @Getter @Setter
    private String name;

    protected Category() {}

    public Category(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
                "Category[id=%d, name='%s']", id, name);
    }
}   
