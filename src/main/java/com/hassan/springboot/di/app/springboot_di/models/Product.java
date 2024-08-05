package com.hassan.springboot.di.app.springboot_di.models;

public class Product {
    
    private Long id;
    private String name;
    private Long price;
    
    //Constructors
    public Product(Long id, String name, Long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    //Setters and Getters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getPrice() {
        return price;
    }
    public void setPrice(Long d) {
        this.price = d;
    }
}