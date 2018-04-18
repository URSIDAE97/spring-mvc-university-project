package pl.edu.prz.kia.universityproject.model;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Transient;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int id;

	@Column(name = "email")
	@Email(message = "*Podaj poprawny adres email")
	@NotEmpty(message = "*Podaj email")
	private String email;

	@Column(name = "password")
	@Length(min = 5, message = "*Haslo musi posiadac conajmniej 5 znakow")
	@NotEmpty(message = "*Podaj haslo")
	@Transient
	private String password;

	@Column(name = "name")
	@NotEmpty(message = "*Podaj imie")
	private String name;

	@Column(name = "last_name")
	@NotEmpty(message = "*Podaj nazwisko")
	private String lastName;

	@Column(name = "active")
	private int active;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_kierunek", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "id_kierunku"))
	private Set<Kierunek> kierunki;

    @OneToMany(mappedBy = "userid")
    private Set<Odpowiedz> odpowiedzi;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Set<Kierunek> getKierunki() {return kierunki;}

	public void setKierunki(Set<Kierunek> kierunki) {
		this.kierunki = kierunki;
	}

    public Set<Odpowiedz> getOdpowiedzi() {return odpowiedzi;}

    public void setOdpowiedzi(Set<Odpowiedz> odpowiedzi) {
        this.odpowiedzi = odpowiedzi;
    }
}
