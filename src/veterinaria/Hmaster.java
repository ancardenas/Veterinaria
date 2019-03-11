/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import java.io.Serializable;

/**
 *
 * @author ancardenas
 */
public class Hmaster extends Pet implements Serializable{

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private double weight;
    public Hmaster(String id, String name, String haircolor) {
        super(id, name, haircolor);
    }

    @Override
    public String sound() {
        String a = " ";
        return a;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void giveInformation() {
        
        System.out.println( "Hamster "+this.name+" "+this.id+" "+this.haircolor+" "+this.weight); //To change body of generated methods, choose Tools | Templates.
    }
    
}
