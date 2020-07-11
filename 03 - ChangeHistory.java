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

public class ChangeHistory {
    
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        this.history = new ArrayList<>();
    }
    
    public void add(double status){
        this.history.add(status);
    }
    
    public void clear(){
        this.history.clear();
    }
    
    public String toString(){
        return this.history.toString();
    }
    
    public double maxValue(){
        double max = 0;
        for (int i = 0; i < this.history.size(); i++){
            if (this.history.get(i) > max){
                max = this.history.get(i);
            }
        }
        return max;
    }
    
    public double minValue(){
        double min = this.history.get(0);
        for (int i = 0; i < this.history.size(); i++){
            if (this.history.get(i) < min){
                min = this.history.get(i);
            }
        }
        return min;
    }
    
    public double average(){
        double sum = 0;
        int index = 0;
        for (int i = 0; i < this.history.size(); i++){
            sum = sum + this.history.get(i);
            index = i + 1;
        }
        if (this.history.size() == 0){
            return 0;
        }
        return sum / index;
    }
}
