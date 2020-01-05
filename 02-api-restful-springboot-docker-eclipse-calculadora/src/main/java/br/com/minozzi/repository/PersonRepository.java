package br.com.minozzi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.minozzi.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}
