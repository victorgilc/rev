package com.rev.data.structure;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Request {
    private Person requestor;
    private Person provider;
    private LocalDateTime raise;

}