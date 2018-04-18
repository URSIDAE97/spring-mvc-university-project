package pl.edu.prz.kia.universityproject.model;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotEmpty;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
@Table(name = "kierunek")

public class Kierunek {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_kierunku")
    private int id;

    @Column(name="kierunek")
    @NotEmpty(message = "*Podaj nazwe kierunku")
    private String name;

    @Column(name="opis")
    private String opis;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_wydzialu")
    private Wydzial wydzialid;

    @OneToMany(mappedBy = "kierunekid")
    private List<Oczekiwana> oczekiwane;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
