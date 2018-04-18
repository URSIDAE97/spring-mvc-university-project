package pl.edu.prz.kia.universityproject.repository;

import pl.edu.prz.kia.universityproject.model.Odpowiedz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("odpowiedzRepository")
public interface OdpowiedzRepository extends JpaRepository<Odpowiedz, Integer> {

}