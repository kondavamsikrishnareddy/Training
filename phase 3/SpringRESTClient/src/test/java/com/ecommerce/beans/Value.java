package com.ecommerce.beans;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    private Long id;
    private String quote1;

    public Value() {
    }

    public Long getId() {
        return this.id;
    }

    public String getQuote1() {
        return this.quote1;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuote1(String quote1) {
        this.quote1 = quote1;
    }

    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", quote1='" + quote1 + '\'' +
                '}';
    }
    }
    

