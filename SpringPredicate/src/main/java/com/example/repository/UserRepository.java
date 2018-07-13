package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Person;

public interface UserRepository extends MongoRepository<Person, Long>{

	

	



}
