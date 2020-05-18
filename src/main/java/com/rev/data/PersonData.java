package com.rev.data;

import java.util.List;

import com.rev.data.structure.Occupation;
import com.rev.data.structure.Person;

public interface PersonData {
	List<Person> findPersonPerOccupation(Occupation occupation);
}
