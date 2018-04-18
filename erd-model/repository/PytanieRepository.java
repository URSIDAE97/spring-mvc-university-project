package pl.edu.prz.kia.universityproject.repository;

import pl.edu.prz.kia.universityproject.model.Pytanie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("pytanieRepository")
public interface PytanieRepository extends JpaRepository<Pytanie, Integer> {

}