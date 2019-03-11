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
public class Dog extends Pet implements Serializable{

    private String breed;

    public Dog(String id, String name, String haircolor) {
        super(id, name, haircolor);
    }

    @Override
    public String sound() {
        String a = "Guau";
        return a; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void giveInformation() {
        System.out.println("Perro "+this.name+" "+this.id+" "+this.haircolor+" "+this.breed); //To change body of generated methods, choose Tools | Templates.
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHaircolor() {
        return haircolor;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }
    
}
