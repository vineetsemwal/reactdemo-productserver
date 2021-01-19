package com.aplombee.apps.productsmgt.dto;

import com.aplombee.apps.productsmgt.entities.Product;

public class ProductDetails {
    private Long id;
    private String name;
    private double price;

    public ProductDetails(){}

    public ProductDetails(Long id, String name, double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
