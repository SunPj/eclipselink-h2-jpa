package ru.sunsongs.jpa;

import javax.persistence.Entity;
import javax.persistence.PrePersist;

/**
 * @author kraken
 * @since 9/28/14.
 */
@Entity
public class Feedback extends MessageEntity {
    private Long value;

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    @PrePersist
    private void onCreateFeedback(){
        System.out.printf("onCreateFeedback executed");
    }
}
