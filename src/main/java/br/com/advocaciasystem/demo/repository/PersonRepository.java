package br.com.advocaciasystem.demo.repository;

import br.com.advocaciasystem.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository <Person, Long> {
}
