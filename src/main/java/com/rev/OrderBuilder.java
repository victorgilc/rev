package com.rev;

import org.springframework.web.servlet.function.RenderingResponse.Builder;

import lombok.Getter;
import lombok.Setter;

public class OrderBuilder {
    private String nomeProduto;
    private Integer quantidade;
    private String responsavel;
    private String status;

    private OrderBuilder nomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
        return this;
    }

    public void build(){

    }
}