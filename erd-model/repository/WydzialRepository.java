package pl.edu.prz.kia.universityproject.repository;

import pl.edu.prz.kia.universityproject.model.Wydzial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("wydzialRepository")
public interface WydzialRepository extends JpaRepository<Wydzial, Integer> {

}