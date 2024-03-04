package org.example;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class ShoppingCart {
    private Map<String ,Long>contents=new HashMap<>();
    public void addProduct(String productName,Long productPrice){
        contents.put(productName,productPrice);
    }
}
