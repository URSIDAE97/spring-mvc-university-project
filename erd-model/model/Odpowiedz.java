package pl.edu.prz.kia.universityproject.model;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Set;

@Entity
@Table(name = "odpowiedz")

public class Odpowiedz {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_odpowiedzi")
    private int id;

    @Column(name="wartosc")
    private int wartosc;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_uzytkownika")
    private User userid;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_pytania")
    private Pytanie pytanieid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWartosc() {
        return wartosc;
    }

    public void setWartosc(int wartosc) {
        this.wartosc = wartosc;
    }
}
