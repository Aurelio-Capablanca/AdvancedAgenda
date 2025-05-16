/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;

/**
 *
 * @author LAB
 */
public class roboticActions extends agendaController {
    
    private ArrayList<String> nombres = new ArrayList<>();
    private ArrayList<String> telefonos = new ArrayList<>();
    private ArrayList<Integer> tipoContactos = new ArrayList<>();
    
    private void listNames(){
        nombres.add("joaquin");
        nombres.add("manuel");
        nombres.add("roberto");
        nombres.add("mardoqueo");
        nombres.add("emerson");
        nombres.add("fernando");
        nombres.add("ernesto");
        nombres.add("alvaro");
        nombres.add("jaime");
        nombres.add("gerson");
    }
    
    private void listTelefonos(){
        for (int i = 0; i < 10; i++) {
          int randomnumbers = (int)(Math.random() * (4840 - 3400) + 3400);
          telefonos.add(String.valueOf(randomnumbers)); 
        }
    }
    
    private void listTipos(){
        
    }
    
    
    public void addAll(){
        
    }
    
}
