package com.rev;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rev.data.PersonData;
import com.rev.data.structure.Person;

public class Request {
	
	@Autowired
	private PersonData personData;

	public void create(com.rev.data.structure.Request entry) {
		List<Person> personList = personData.findPersonPerOccupation(null);
	}
}
