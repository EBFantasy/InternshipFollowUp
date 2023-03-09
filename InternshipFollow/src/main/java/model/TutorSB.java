package model;
import jakarta.ejb.EJBException;
import jakarta.ejb.Stateless;
import jakarta.persistence.*;

import java.util.List;

@Stateless
public class TutorSB {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    public /*TutorEntity*/ Object logIn(String username, String password) {
        Query query = entityManager.createQuery("select e from TutorEntity e where e.username = :username and e.password = :password")
                .setParameter("username", username).setParameter("password", password);
        System.out.println(query.getSingleResult());

        Object queryResult = query.getSingleResult();
        return queryResult;

        /*if (result == null) {
            return null;
        }
        else {
            return (TutorEntity) query.getSingleResult();
        }*/
    }
}
