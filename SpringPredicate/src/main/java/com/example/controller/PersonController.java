package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Person;
import com.example.model.Employee;
import com.example.repository.PersonSpecification;
import com.example.repository.UserRepository;

@RestController
public class PersonController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void save(@RequestBody Person person) {
		
		userRepository.save(person);	
		
	}
	
	@RequestMapping(value="/getDetail",method=RequestMethod.GET)
	public void getDetils() {
		
		userRepository.findAll();
		
	}
}
	
	/*@RequestMapping(value="/getDetails",method=RequestMethod.POST)
	public List<Person> getDetilsByname(@RequestBody Person person) {
		
		//name.setName("siddu");
		//name.setSurname("kodam");
		//name.setAge(23);
		//name.setCity("warangal");		
		
		
	Specification<Person> spec = new PersonSpecification(person.getStartDate(),person.getStartDate1(),
			person.getId());	
  	List<Person> findAll = userRepository.findAll(spec);
		return findAll;
		
	}

}
*/