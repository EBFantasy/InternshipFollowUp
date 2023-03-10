package model;

import jakarta.persistence.*;

@Entity
@Table(name = "tutor", schema = "advanced_programming", catalog = "")
public class TutorEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id_tutor", nullable = false)
    private int idTutor;
    @Basic
    @Column(name = "username", nullable = true, length = 35)
    private String username;
    @Basic
    @Column(name = "password", nullable = true, length = 35)
    private String password;

    public int getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TutorEntity that = (TutorEntity) o;

        if (idTutor != that.idTutor) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTutor;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
