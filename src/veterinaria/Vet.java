/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author ancardenas
 */
public class Vet implements Serializable {
    private HashMap<String,Pet> pets;
    private ArrayList<Person> clientes;
    public Vet() {
    this.pets =new  HashMap<>();
    this.clientes = new ArrayList<>();
    }
    
    public void removePet(String id){
        try {
            this.pets.remove(id);
        } catch (Exception e) {
            System.out.println("El id Ingresado no corresponde a ningna mascota registrada");
        }
       
    
            
    }
    public void showPetsByType(){
     Scanner sc = new  Scanner(System.in);
     
        System.out.println("Que tipo desea consultar");
        System.out.println("1. Perros");
        System.out.println("2. Gatos");
        System.out.println("3. Hamsters");
        int a = sc.nextInt();
        
        switch(a){
            case 1: for (Map.Entry<String, Pet> entry : pets.entrySet()) {
                    String key = entry.getKey();
                    if (pets.get(key) instanceof Dog ) {
                        this.pets.get(key).giveInformation();
                    }
                
                    
                }break;
            case 2: for (Map.Entry<String, Pet> entry : pets.entrySet()) {
                    String key = entry.getKey();
                    if (pets.get(key) instanceof Cat ) {
                        this.pets.get(key).giveInformation();
                    }
                    
                }break;
            case 3: for (Map.Entry<String, Pet> entry : pets.entrySet()) {
                    String key = entry.getKey();
                    if (pets.get(key) instanceof Hmaster ) {
                        this.pets.get(key).giveInformation();
                    }
                    
                }break;
                    
                }
        }
    public void showPets(){
        for (Map.Entry<String, Pet> entry : pets.entrySet()) {
            String key = entry.getKey();
            this.pets.get(key).giveInformation();
            
        }
}
    public void addPet(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre de la mascotra");
        String nom = sc.nextLine();
        System.out.println("Ingrese el ID");
        String id = sc.nextLine();
        System.out.println("Ingrese el color de cabello");
        String haircolor = sc.nextLine();
        System.out.println("De que tipo es su mascota?");
        System.out.println("1. Perro");
        System.out.println("2. Gato");
        System.out.println("3. Hamster");
        int a = sc.nextInt();
        switch (a){
            case 1: 
                Dog dog =new Dog(id, nom, haircolor);
                
                System.out.println("Ingrese la raza del perro ");
                
                String raza = sc.nextLine();
                raza =sc.nextLine();
                dog.setBreed(raza);
                this.pets.put(id,dog);
                break;
            case 2:
                Cat cat = new Cat(id, nom, haircolor);
                System.out.println("Es cazador?");
                System.out.println("1. Si");
                System.out.println("2. No");
                int b = sc.nextInt();
                switch (b){
                    case 1: cat.setIsHunter(true);break;
                    case 2: cat.setIsHunter(false);break;
                    
                }
                this.pets.put(id, cat);
                break;
            case 3:
                Hmaster ham = new Hmaster(id, nom, haircolor);
                System.out.println("Ingrese el peso del Hamster");
                double peso = sc.nextDouble();
                ham.setWeight(peso);
                this.pets.put(id, ham);
                break;
            
        }
    }
    public void manageVet(){
        System.out.println("Bienvenido a la veterinaria");
        System.out.println("Que desea hacer?");
        System.out.println("1. Remover mascota por ID");
        System.out.println("2. Lsitar mascotas por tipo");
        System.out.println("3. Listar todas las mascotas registradas");
        System.out.println("4. Añadir mascota");
        System.out.println("5. Salir");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a){
            case 1: System.out.println("Ingrese el ID de la mascota");
            String id = sc.nextLine();
            id = sc.nextLine();
            this.removePet(id);
            break;
            case 2: this.showPetsByType();
            break;
            case 3: this.showPets();
            break;
            case 4: this.addPet();break;
            case 5: System.exit(0);break;
        }
    }
}

