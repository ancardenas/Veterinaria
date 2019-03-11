/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ancardenas
 */
public class Person implements Serializable{
    private String name;
    private int id;
    private HashMap<String,Pet> pets;
    
    public void showPets(){
        for (Map.Entry<String, Pet> entry : pets.entrySet()) {
            String key = entry.getKey();
            pets.get(key).giveInformation();
            
        }
    }
}
