package pl.piegoose.gradebook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.piegoose.gradebook.entities.Classroom;

import java.util.Optional;

public interface ClassroomRepo extends JpaRepository {

    Optional<Classroom> findByName(String name);
    boolean existsByName(String name);
}
