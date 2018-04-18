package pl.edu.prz.kia.universityproject.repository;

import pl.edu.prz.kia.universityproject.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userroleRepository")
public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {

}