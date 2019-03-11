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
public abstract class Pet implements Serializable {
    
    protected String id;
    protected String name;
    protected String haircolor;

    public Pet(String id, String name, String haircolor) {
        this.id = id;
        this.name = name;
        this.haircolor = haircolor;
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
    public abstract void giveInformation();
    public abstract String sound();
}
