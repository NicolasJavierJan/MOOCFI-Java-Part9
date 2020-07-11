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
import java.util.List;

public class Herd implements Movable{
    private List<Movable> herd;
    
    public Herd(){
        this.herd = new ArrayList<>();
    }
    
    public String toString(){
        String herd = "";
        for (int i = 0; i < this.herd.size(); i++){
            herd = herd + this.herd.get(i).toString() + "\n";
        }
        
        return herd;
    }
    
    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }
    
    public void move(int dx, int dy){
        for (Movable organism : this.herd){
            organism.move(dx, dy);
        }
    }
}
