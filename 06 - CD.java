/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */
public class CD implements Packable{
    
    private String artist;
    private String title;
    private int publicationYear;
    private double weight;
    
    public CD(String artist, String title, int publicationYear){
        this.artist = artist;
        this.title = title;
        this.publicationYear = publicationYear;
        this.weight = 0.1;
    }
    
    public String toString(){
        return this.artist + ": " + this.title + " (" + this.publicationYear + ")";
    }
    
    public double weight(){
        return this.weight;
    }
}
