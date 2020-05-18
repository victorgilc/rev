package com.rev.data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.rev.data.structure.Occupation;
import com.rev.data.structure.Person;

public class PersonDataMockImplementation implements PersonData{
	
    public List<Person> getData(){
        return null;
    }
    
    public List<Person> findPersonPerOccupation(Occupation occupation){
		List<Person> personList = new ArrayList<Person>();
		
		Person person = new Person.Builder()
				.identifier("78894003819")
				.name("José")
				.birthDay(LocalDate.of(1992, 11, 30))
				.occupation(occupation)
				.build();
		
		
		return personList;
    }
}