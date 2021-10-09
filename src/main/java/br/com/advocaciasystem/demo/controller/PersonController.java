package br.com.advocaciasystem.demo.controller;


import br.com.advocaciasystem.demo.model.entity.Person;
import br.com.advocaciasystem.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public List<Person> getAllPerson(){
        return personRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Person createPerson(@RequestBody Person person){
        return personRepository.save(person);
    }

    @DeleteMapping(path = "/{id}")
    public Person deletePerson( @PathVariable Long id){
        personRepository.findById(id);
        personRepository.deleteById(id);
        return null;
    }
}
