package pl.edu.prz.kia.universityproject.model;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Entity
@Table (name="wartosc_oczekiwana")
public class ExpectedAnswer {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Max(value = 10)
    @Column (name="wartosc")
    private Integer value;

    @ManyToOne
    private Question question;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
