package com.rev.data.structure;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Person {
    private String identifier;
    private String name;
    private LocalDate birthDay;
    private Occupation occupation;
}