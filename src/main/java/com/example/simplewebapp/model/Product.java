package com.example.simplewebapp.model;

// import jakarta.annotation.Nullable;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Component
@Entity
public class Product {
    @Id
    private int prodId;
    
    private String prodName;
    
    private int prodPrice;
    

    public int getProdId(){
        return prodId;
    }

    public void setProdId(int prodId){
        this.prodId=prodId;
    }

    public String getProdName(){
        return prodName;
    }

    public void setProdName(String prodName){
        this.prodName=prodName;
    }

    public int getProdPrice(){
        return prodPrice;
    }

    public void setProdPrice(int prodPrice){
        this.prodPrice=prodPrice;
    }
}
