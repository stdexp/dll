package app.entities;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import java.util.Date;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name="tasks") 
public class Task {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="task_id")
    @Getter @Setter
    private Long   id;
    
    @ManyToOne
    @JoinColumn(name = "category")
    @Getter @Setter
    private Category category;

    @Getter @Setter
    private String content;

    @Column(name="creation_date")
    @CreationTimestamp
    @Getter @Setter
    private Date   creationDate;
    @Column(name="end_date")
    @Getter @Setter
    private Date   endDate;

    protected Task() {}

    public Task(Category category, String content ) {
        this.category = category;
        this.content  = content;
        //this.creationDate     = new Date();
    }

    @Override
    public String toString() {
        return String.format(
                "Task[id=%d, content='%s', category='%s']", id, content, category);
    }
    
}   
