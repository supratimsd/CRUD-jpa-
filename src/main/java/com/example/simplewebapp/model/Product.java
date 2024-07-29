package com.example.simplewebapp.model;

// import jakarta.annotation.Nullable;

// import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
// @Component

public class Product {
    private Integer prodId;
    private String prodName;
    private Integer prodPrice;
    

}
