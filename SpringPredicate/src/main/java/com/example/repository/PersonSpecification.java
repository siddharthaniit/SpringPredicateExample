package com.example.repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.example.Person;
import com.example.model.Employee;

public class PersonSpecification implements Specification<Person> {
	
	 private Employee filter;
	 
	 private long age;
	 
	 private long age1;
	 
	 private long id;
	
	 
	
	 
	 public PersonSpecification(long age,long age1,long id) {
	        super();
	        this.age = age;
	        this.age1=age1;
	        this.id = id;
	       
	    }
	 
	
	@Override
	public Predicate toPredicate(Root<Person> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		
		  Predicate p = cb.disjunction();
		  
		/*  if (age != 0) {
			  
			  criteriaBuilder.between(root.get("age"), age1, age2);
	            p.getExpressions()
	                    .add(criteriaBuilder.equal(root.get("name"), filter.getName()));
	        }
		  */
		  
		  /*  if (age != 0) {
			 
	            p.getExpressions()
	                    .add(cb.between(root.get("startDate"), age, age1));
	        		  
	        }
		    */
		  
		  if (age != 0) {
				 
	            p.getExpressions()
	                    .add(
	                    		cb.and(
	                    
	                    
	                    cb.between(root.get("startDate"), age, age1),
	                    cb.equal(root.get("id"), id)
	                    
	                    
	                    ));
	        		  
	        }
		    
		     if(id != 0) {
		        p.getExpressions()
                .add(cb.equal(root.get("id"), id));
		    	
		    }
		  
		   
		  
		 /*   if (filter.getName() != null) {
	            p.getExpressions()
	                    .add(criteriaBuilder.equal(root.get("name"), filter.getName()));
	        }

	        if (filter.getSurname() != null && filter.getAge() != null) {
	            p.getExpressions().add(
	            		criteriaBuilder.and(criteriaBuilder.equal(root.get("surname"), filter.getSurname()),
	            				criteriaBuilder.equal(root.get("age"), filter.getAge())));
	        }*/

	        return p;
	
	}

}
