package pl.edu.prz.kia.universityproject.repository;

import pl.edu.prz.kia.universityproject.model.Kierunek;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("roleRepository")
public interface KierunekRepository extends JpaRepository<Kierunek, Integer> {
    Kierunek findByKierunek(String nazwa);

}