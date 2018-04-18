package pl.edu.prz.kia.universityproject.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "odpowiedz_uzytkownika")
public class UserAnswer {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Max(value = 10)
    @Column(name="wartosc")

    private Integer value;

    @ManyToOne
    private Question question;

    @ManyToOne
    private User user;

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
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
