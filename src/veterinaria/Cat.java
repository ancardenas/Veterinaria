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
public class Cat extends Pet implements Serializable{

    private boolean isHunter;
    
    public Cat(String id, String name, String haircolor) {
        super(id, name, haircolor);
    }

    public void setIsHunter(boolean isHunter) {
        this.isHunter = isHunter;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }

    @Override
    public String sound() {
       String a = "Miau ";
        return a; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void giveInformation() {
        System.out.print("Gato "+this.name+" "+this.id+" "+this.haircolor);
        if (isHunter) {
            System.out.println(" Es Cazador");
        }else{
            System.out.println(" No es Cazador");
        }
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
