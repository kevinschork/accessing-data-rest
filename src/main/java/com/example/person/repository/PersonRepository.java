package com.example.person.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.person.model.Person;

@RepositoryRestResource
public interface PersonRepository extends CrudRepository<Person, String> {
	
	List<Person> findAll(Sort sort);
	
	List<Person> findAllByFirstNameIgnoreCase(@Param("name") String name, Sort sort);

	Page<Person> findByFirstNameIgnoreCase(@Param("name") String name, Pageable page);
	
	Page<Person> findByFirstNameStartsWithIgnoreCase(@Param("name") String name, Pageable page);
	
	List<Person> findAllByLastNameIgnoreCase(@Param("name") String name, Sort sort);

	Page<Person> findByLastNameIgnoreCase(@Param("name") String name, Pageable page);
	
	Page<Person> findByLastNameStartsWithIgnoreCase(@Param("name") String name, Pageable page);

}
