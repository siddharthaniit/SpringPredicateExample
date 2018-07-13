package com.example.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.Person;
import com.google.common.base.Predicate;

public interface QueryDslPredicateExecutor<Person> {
	
	 Person findOne(Predicate predicate);

	  List<Person> findAll(Predicate predicate);


	  Page<Person> findAll(Predicate predicate, Pageable pageable);

	  Long count(Predicate predicate);

}
