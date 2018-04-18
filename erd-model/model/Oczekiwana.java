package pl.edu.prz.kia.universityproject.model;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "oczekiwana")

public class Oczekiwana {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_odpowiedzi")
    private int id;

    @Column(name="wartosc")
    private int wartosc;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_kierunku")
    private Kierunek kierunekid;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_pytania")
    private Pytanie pytanieiid;

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