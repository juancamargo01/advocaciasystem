package br.com.advocaciasystem.demo.repository;

import br.com.advocaciasystem.demo.model.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository <Person, Long> {

}
