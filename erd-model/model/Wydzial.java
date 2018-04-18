package pl.edu.prz.kia.universityproject.model;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name = "wydzial")

public class Wydzial {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_wydzialu")
    private int id;

    @Column(name="nazwa")
    @NotEmpty(message = "*Podaj nazwe wydzialu")
    private String name;

    @Column(name="adres")
    @NotEmpty(message = "*Podaj adres wydzialu")
    private String adres;

    @Column(name="logo")
    private String logo;

     @OneToMany(mappedBy = "wydzialid")
    private List<Kierunek> kierunki;

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

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}