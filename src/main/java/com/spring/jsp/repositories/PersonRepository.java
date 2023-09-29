package com.spring.jsp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.jsp.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer>
{
	

}
