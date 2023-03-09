package model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "student", schema = "advanced_programming", catalog = "")
public class StudentEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id_student", nullable = false)
    private int idStudent;
    @Basic
    @Column(name = "tutor_id", nullable = false)
    private int tutorId;
    @Basic
    @Column(name = "Cdc", nullable = true)
    private Byte cdc;
    @Basic
    @Column(name = "fiche_visite", nullable = true)
    private Byte ficheVisite;
    @Basic
    @Column(name = "fiche_eval_entree", nullable = true)
    private Byte ficheEvalEntree;
    @Basic
    @Column(name = "sondage_web", nullable = true)
    private Byte sondageWeb;
    @Basic
    @Column(name = "rapport_rendu", nullable = true)
    private Byte rapportRendu;
    @Basic
    @Column(name = "soutenance", nullable = true)
    private Byte soutenance;
    @Basic
    @Column(name = "visite_planifiee", nullable = true)
    private Byte visitePlanifiee;
    @Basic
    @Column(name = "visite_faite", nullable = true)
    private Byte visiteFaite;
    @Basic
    @Column(name = "debut", nullable = true)
    private Date debut;
    @Basic
    @Column(name = "fin", nullable = true)
    private Date fin;
    @Basic
    @Column(name = "entree", nullable = true, length = 35)
    private String entree;
    @Basic
    @Column(name = "MdS", nullable = true, length = 35)
    private String mdS;
    @Basic
    @Column(name = "adresse", nullable = true, length = 255)
    private String adresse;
    @Basic
    @Column(name = "note_tech", nullable = true, precision = 0)
    private Double noteTech;
    @Basic
    @Column(name = "note_comm", nullable = true, precision = 0)
    private Double noteComm;
    @Basic
    @Column(name = "nom_entreprise", nullable = true, length = 35)
    private String nomEntreprise;
    @Basic
    @Column(name = "description_mission", nullable = true, length = 255)
    private String descriptionMission;
    @Basic
    @Column(name = "commentaire", nullable = true, length = 255)
    private String commentaire;

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getTutorId() {
        return tutorId;
    }

    public void setTutorId(int tutorId) {
        this.tutorId = tutorId;
    }

    public Byte getCdc() {
        return cdc;
    }

    public void setCdc(Byte cdc) {
        this.cdc = cdc;
    }

    public Byte getFicheVisite() {
        return ficheVisite;
    }

    public void setFicheVisite(Byte ficheVisite) {
        this.ficheVisite = ficheVisite;
    }

    public Byte getFicheEvalEntree() {
        return ficheEvalEntree;
    }

    public void setFicheEvalEntree(Byte ficheEvalEntree) {
        this.ficheEvalEntree = ficheEvalEntree;
    }

    public Byte getSondageWeb() {
        return sondageWeb;
    }

    public void setSondageWeb(Byte sondageWeb) {
        this.sondageWeb = sondageWeb;
    }

    public Byte getRapportRendu() {
        return rapportRendu;
    }

    public void setRapportRendu(Byte rapportRendu) {
        this.rapportRendu = rapportRendu;
    }

    public Byte getSoutenance() {
        return soutenance;
    }

    public void setSoutenance(Byte soutenance) {
        this.soutenance = soutenance;
    }

    public Byte getVisitePlanifiee() {
        return visitePlanifiee;
    }

    public void setVisitePlanifiee(Byte visitePlanifiee) {
        this.visitePlanifiee = visitePlanifiee;
    }

    public Byte getVisiteFaite() {
        return visiteFaite;
    }

    public void setVisiteFaite(Byte visiteFaite) {
        this.visiteFaite = visiteFaite;
    }

    public Date getDebut() {
        return debut;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public String getEntree() {
        return entree;
    }

    public void setEntree(String entree) {
        this.entree = entree;
    }

    public String getMdS() {
        return mdS;
    }

    public void setMdS(String mdS) {
        this.mdS = mdS;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Double getNoteTech() {
        return noteTech;
    }

    public void setNoteTech(Double noteTech) {
        this.noteTech = noteTech;
    }

    public Double getNoteComm() {
        return noteComm;
    }

    public void setNoteComm(Double noteComm) {
        this.noteComm = noteComm;
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public String getDescriptionMission() {
        return descriptionMission;
    }

    public void setDescriptionMission(String descriptionMission) {
        this.descriptionMission = descriptionMission;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (idStudent != that.idStudent) return false;
        if (tutorId != that.tutorId) return false;
        if (cdc != null ? !cdc.equals(that.cdc) : that.cdc != null) return false;
        if (ficheVisite != null ? !ficheVisite.equals(that.ficheVisite) : that.ficheVisite != null) return false;
        if (ficheEvalEntree != null ? !ficheEvalEntree.equals(that.ficheEvalEntree) : that.ficheEvalEntree != null)
            return false;
        if (sondageWeb != null ? !sondageWeb.equals(that.sondageWeb) : that.sondageWeb != null) return false;
        if (rapportRendu != null ? !rapportRendu.equals(that.rapportRendu) : that.rapportRendu != null) return false;
        if (soutenance != null ? !soutenance.equals(that.soutenance) : that.soutenance != null) return false;
        if (visitePlanifiee != null ? !visitePlanifiee.equals(that.visitePlanifiee) : that.visitePlanifiee != null)
            return false;
        if (visiteFaite != null ? !visiteFaite.equals(that.visiteFaite) : that.visiteFaite != null) return false;
        if (debut != null ? !debut.equals(that.debut) : that.debut != null) return false;
        if (fin != null ? !fin.equals(that.fin) : that.fin != null) return false;
        if (entree != null ? !entree.equals(that.entree) : that.entree != null) return false;
        if (mdS != null ? !mdS.equals(that.mdS) : that.mdS != null) return false;
        if (adresse != null ? !adresse.equals(that.adresse) : that.adresse != null) return false;
        if (noteTech != null ? !noteTech.equals(that.noteTech) : that.noteTech != null) return false;
        if (noteComm != null ? !noteComm.equals(that.noteComm) : that.noteComm != null) return false;
        if (nomEntreprise != null ? !nomEntreprise.equals(that.nomEntreprise) : that.nomEntreprise != null)
            return false;
        if (descriptionMission != null ? !descriptionMission.equals(that.descriptionMission) : that.descriptionMission != null)
            return false;
        if (commentaire != null ? !commentaire.equals(that.commentaire) : that.commentaire != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idStudent;
        result = 31 * result + tutorId;
        result = 31 * result + (cdc != null ? cdc.hashCode() : 0);
        result = 31 * result + (ficheVisite != null ? ficheVisite.hashCode() : 0);
        result = 31 * result + (ficheEvalEntree != null ? ficheEvalEntree.hashCode() : 0);
        result = 31 * result + (sondageWeb != null ? sondageWeb.hashCode() : 0);
        result = 31 * result + (rapportRendu != null ? rapportRendu.hashCode() : 0);
        result = 31 * result + (soutenance != null ? soutenance.hashCode() : 0);
        result = 31 * result + (visitePlanifiee != null ? visitePlanifiee.hashCode() : 0);
        result = 31 * result + (visiteFaite != null ? visiteFaite.hashCode() : 0);
        result = 31 * result + (debut != null ? debut.hashCode() : 0);
        result = 31 * result + (fin != null ? fin.hashCode() : 0);
        result = 31 * result + (entree != null ? entree.hashCode() : 0);
        result = 31 * result + (mdS != null ? mdS.hashCode() : 0);
        result = 31 * result + (adresse != null ? adresse.hashCode() : 0);
        result = 31 * result + (noteTech != null ? noteTech.hashCode() : 0);
        result = 31 * result + (noteComm != null ? noteComm.hashCode() : 0);
        result = 31 * result + (nomEntreprise != null ? nomEntreprise.hashCode() : 0);
        result = 31 * result + (descriptionMission != null ? descriptionMission.hashCode() : 0);
        result = 31 * result + (commentaire != null ? commentaire.hashCode() : 0);
        return result;
    }
}
