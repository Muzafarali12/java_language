package com.test.PersonsRegistrationForm.dao;

import java.util.List;
import com.test.PersonsRegistrationForm.model.Person;

public interface personDao {
	void register(Person person);
	List<Person> getAllPerson();
}
