package pl.edu.prz.kia.universityproject.model;

import javax.persistence.*;

@Entity
@Table(name = "kierunek")

public class Kierunek {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_kierunku")
    private int id;

    @Column(name="nazwa")
    private String name;

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
}
