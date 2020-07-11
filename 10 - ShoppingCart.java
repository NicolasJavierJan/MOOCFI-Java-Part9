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

public class ShoppingCart {
    private Map<String, Item> shoppingCart;
    
    public ShoppingCart(){
        this.shoppingCart = new HashMap<>();
    }
    
    public void add(String product, int price){
        if (this.shoppingCart.keySet().contains(product)){
            this.shoppingCart.get(product).increaseQuantity();
        } else {
            this.shoppingCart.put(product, new Item(product, 1, price));
        }
    }
    
    public int price(){
        int sum = 0;
        for (Item product : this.shoppingCart.values()){
            sum = sum + product.price();
        }
        
        return sum;
    }
    
    public void print(){
        for (Item product : this.shoppingCart.values()){
            System.out.println(product.toString());
        }
    }
}
