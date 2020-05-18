package com.rev.data.structure;

import java.time.LocalTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Journey {
	private Person person;
	private int day;
	private LocalTime start;
	private LocalTime end;
}
