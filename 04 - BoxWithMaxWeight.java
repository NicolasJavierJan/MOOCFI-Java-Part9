/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    
    private int maxWeight;
    private ArrayList<Item> box;
    
    public BoxWithMaxWeight(int capacity){
        this.maxWeight = capacity;
        this.box = new ArrayList<>();
    }
    
    public void add(Item item){
        int weight = 0;
        for (int i = 0; i < this.box.size(); i++){
            weight = weight + this.box.get(i).getWeight();
        }
        if ((weight + item.getWeight()) <= this.maxWeight){
            this.box.add(item);
        }
    }
    
    public boolean isInBox(Item item){
        if (this.box.contains(item)){
            return true;
        }
        return false;
    }
    
}
