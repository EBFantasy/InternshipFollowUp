package model;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

@Stateless
public class PersonSB {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    public List<PersonEntity> getPersons() {
        Query query = entityManager.createQuery("select e from PersonEntity e");
        return query.getResultList();
    }
}
