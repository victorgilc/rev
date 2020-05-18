package com.rev.data.structure;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class Person {
    private String identifier;
    private String name;
    private LocalDate birthDay;
    private Occupation occupation;
    
    private Person(){}
    
    public static class Builder{
    	
    	private String identifier;
        private String name;
        private LocalDate birthDay;
        private Occupation occupation;

    	public Builder identifier(String identifier){
    		this.identifier = identifier;
    		return this;
    	}
    	
     	public Builder name(String name){
    		this.name = name;
    		return this;
    	}
     	
      	public Builder birthDay(LocalDate birthDay){
    		this.birthDay = birthDay;
    		return this;
    	}
      	
     	public Builder occupation(Occupation occupation){
    		this.occupation = occupation;
    		return this;
    	}
    	
    	public Person build() {
    		Person person = new Person();
    		person.identifier = identifier;
    		person.name = name;
    		person.birthDay = birthDay;
    		person.occupation = occupation;
    		return person;
    	}
    }

}