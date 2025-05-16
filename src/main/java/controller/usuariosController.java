/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import helpers.helper;
import java.util.ArrayList;
import models.Usuarios;

/**
 *
 * @author LAB
 */
public class usuariosController extends helper {
    
    private final ArrayList<Usuarios> usuarios = new ArrayList<>();    
    
    private void addUsers(){
        usuarios.add(new Usuarios("root","jkl"));
    }
    
    private void exits(int contador){
        if(contador == 3){
            System.out.println("Demasiados intentos fallidos");
            System.exit(0);
        }
    }
    
    public void login(){
        addUsers();
        int intentos = 0;
        String usuario;
        String pass;
        do {
            System.out.println("Ingrese el Usuario para Ingresar: ");
            usuario = scan.next();
            System.out.println("Ingrese su contraseña: ");
            pass = scan.next();
            intentos++;          
            exits(intentos);
        } while (!usuario.equals("root") || !pass.equals("jkl"));        
    }
    
    
}
