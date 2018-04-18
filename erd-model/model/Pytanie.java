package pl.edu.prz.kia.universityproject.model;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Table(name = "pytanie")

public class Pytanie {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_pytania")
    private int id;

    @Column(name="tresc")
    private String tresc;


    @OneToMany(mappedBy = "pytanieid")
    private List<Odpowiedz> odpowiedzi;

    @OneToMany(mappedBy = "pytanieiid")
    private List<Oczekiwana> oczekiwane;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

}