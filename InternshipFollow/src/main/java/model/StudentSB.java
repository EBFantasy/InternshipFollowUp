package model;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

@Stateless
public class StudentSB {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    public Object getStudentInfo(int student_id) {
        Query query = entityManager.createQuery(
                        "select e from StudentEntity e where e.idStudent = :id_student")
                .setParameter("id_student", student_id);

        Object queryResult = query.getSingleResult();
        return queryResult;
    }

    public void postStudentInfo(List student_infos) {
        Query query = entityManager.createQuery(
                        "select e from StudentEntity e where e.idStudent = :id_student")
                .setParameter("id_student", student_id);

        Object queryResult = query.getSingleResult();
        return queryResult;
    }

    postStudentInfo(ALL_STUDENT_DETAILS) --> modifie les infos d'un student
            "UPDATE person SET nom='nom', prenom='prenom' WHERE person_id='id'"
            "UPDATE student SET Cdc = 'Cdc ', fiche_visite = 'fiche_visite' , fiche_eval_entree = 'fiche_eval_entree' , sondage_web = 'sondage_web', rapport_rendu = 'rapport_rendu' , soutenance = 'soutenance', visite_planifiee = 'visite_planifiee', visite_faite = 'visite_faite' ,debut = 'debut' ,fin = 'fin', entree = 'entree' ,MdS = 'MdS' ,adresse = 'adresse' ,note_tech = 'note_tech' ,note_comm = 'note_comm' ,nom_entreprise = 'nom_entreprise' ,description_mission = 'description_mission' ,commentaire = 'commentaire' , WHERE student_id = 'id'"
}
