package ru.sunsongs.jpa;

import javax.persistence.*;
import java.sql.Date;
import java.util.Calendar;

/**
 * @author kraken
 * @since 9/28/14.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class MessageEntity {
    @Id @GeneratedValue
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar date;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @PrePersist
    private void onCreateMessage(){
        System.out.printf("onCreateMessage executed");
        date = Calendar.getInstance();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
