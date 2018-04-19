/**
 * This file was generated by the Jeddict
 */
package pl.edu.prz.kia.universityproject.model.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 * @author Krystian
 */
@Entity
@IdClass(WARTOSC_OCZEKIWANAPK.class)
public class WARTOSC_OCZEKIWANA {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID_wartosci;

    @Basic
    @NotNull
    private Integer Wartosc;

    @Id
    @ManyToOne
    private KIERUNEK KIERUNEK;

    @Id
    @ManyToOne
    private PYTANIE PYTANIE;

    public Integer getID_wartosci() {
        return this.ID_wartosci;
    }

    public void setID_wartosci(Integer ID_wartosci) {
        this.ID_wartosci = ID_wartosci;
    }

    public Integer getWartosc() {
        return this.Wartosc;
    }

    public void setWartosc(Integer Wartosc) {
        this.Wartosc = Wartosc;
    }

    public KIERUNEK getKIERUNEK() {
        return this.KIERUNEK;
    }

    public void setKIERUNEK(KIERUNEK KIERUNEK) {
        this.KIERUNEK = KIERUNEK;
    }

    public PYTANIE getPYTANIE() {
        return this.PYTANIE;
    }

    public void setPYTANIE(PYTANIE PYTANIE) {
        this.PYTANIE = PYTANIE;
    }

}