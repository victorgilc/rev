package com.rev.data.structure;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ServiceRequest {
    private Person requestor;
	private String type;
	private String availability;
	private String place;
}