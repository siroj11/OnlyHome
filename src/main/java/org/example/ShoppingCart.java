package org.example;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class ShoppingCart {
    private Map<String ,Double>contents=new HashMap<>();
    public void addProduct(String productName,double productPrice){
        contents.put(productName,productPrice);
    }
}
