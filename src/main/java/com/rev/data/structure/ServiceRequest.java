package com.rev.data.structure;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ServiceRequest extends Request{
	private String type;
	private String availability;
	private String place;
}