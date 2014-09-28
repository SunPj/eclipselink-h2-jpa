package ru.sunsongs.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * @author kraken
 * @since 9/28/14.
 */
public class Main {
    public static void main(String ...args){

        // new feedback
        Feedback feedback = new Feedback();
        feedback.setValue(123L);
        feedback.setMessage("Pre persist test!");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        entityManager.persist(feedback);

        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
