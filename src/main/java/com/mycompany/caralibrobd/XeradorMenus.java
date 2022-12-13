/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caralibrobd;
import java.util.Scanner;
import java.util.Collection;
import java.util.ArrayList;
/**
 *
 * @author a22alejandrofc
 */
public class XeradorMenus {
    
    
    public void crearPerfil(){
      
       String nome;
        String contrasinal;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca un nombre de usuario\n");
        nome = entrada.nextLine();
        System.out.println("Introduzca una contraseña válida\n");
        contrasinal = entrada.nextLine();
        Perfil novoPerfil = new Perfil(nome, contrasinal);
        Collection.add(novoPerfil);
       
       
                
            
            
           
        }
        
        
    }
    
}
