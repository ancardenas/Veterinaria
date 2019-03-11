/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ancardenas
 */
public class Main {

    public void readPets(Vet v){
        
    }
    public void manageVet(Vet v){
        System.out.println("Bienvenido a la veterinaria");
        System.out.println("Que desea hacer?");
        System.out.println("1. Remover mascota por ID");
        System.out.println("2. Lsitar mascotas por tipo");
        System.out.println("3. Listar todas las mascotas registradas");
        System.out.println("4. Salir");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a){
            case 1: System.out.println("Ingrese el ID de la mascota");
            String id = sc.nextLine();
            v.removePet(id);
            break;
            case 2: v.showPetsByType();
            break;
            case 3: v.showPets();
        }
         
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vet vet = new Vet();
        File objetos = new File("objetos.txt");
        FileInputStream entrada =null;
        FileOutputStream salida =null;
        ObjectInputStream reader = null;
        ObjectOutputStream writer =null;
        
        
        try {
            System.out.println("Leyendo...");
            entrada =new FileInputStream(objetos);
            reader = new ObjectInputStream(entrada);
            vet = (Vet) reader.readObject();
            
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        
        
        while(true){
            vet.manageVet();
            try {
                System.out.println("Guardando...");
            salida =new FileOutputStream(objetos);
            writer =new ObjectOutputStream(salida);
            writer.writeObject(vet);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            System.err.println("Null pointer");
        }
        
        
    catch(Exception ex){
            System.out.println("Vuelva a inentar");
    }}
        }
    }
    

