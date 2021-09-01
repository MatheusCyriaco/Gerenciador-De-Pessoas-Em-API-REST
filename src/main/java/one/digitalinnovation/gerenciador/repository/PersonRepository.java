package one.digitalinnovation.gerenciador.repository;

import one.digitalinnovation.gerenciador.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
