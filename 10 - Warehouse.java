/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Warehouse {
    
    private Map<String, Integer> productsPrice;
    private Map<String, Integer> productsStock;
    
    public Warehouse(){
        this.productsPrice = new HashMap<>();
        this.productsStock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.productsPrice.put(product, price);
        this.productsStock.put(product, stock);
    }
    
    public int price(String product){
        return this.productsPrice.getOrDefault(product, -99);
    }
    
    public int stock(String product){
        return this.productsStock.getOrDefault(product, 0);
    }
    
    public boolean take(String product){
        if (this.stock(product) > 0){
            this.productsStock.put(product, this.stock(product) - 1);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        Set<String> products = new HashSet<>();
        for (String key : this.productsStock.keySet()){
            products.add(key);
        }
        
        return products;
    }
}
