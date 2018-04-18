package pl.edu.prz.kia.universityproject.repository;

import pl.edu.prz.kia.universityproject.model.Oczekiwana;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("oczekiwanaRepository")
public interface OczekiwanaRepository extends JpaRepository<Oczekiwana, Integer> {

}