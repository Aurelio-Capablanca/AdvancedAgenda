/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author LAB
 */
public class menu extends Injector {

    public void mainMenu() {
        boolean continues = true;
        usuarios.login();
        int seleccionMenu;
        do {
           System.out.println("Seleccione una de las Siguientes opciones: "); 
           System.out.println("\n1. Agregar un número\n"
                + "2. buscar un número\n"
                + "3. modificar un número\n"
                + "4. eliminar un número\n"
                + "5. insertar un número en una posición dada\n"
                + "6. Mostrar elementos\n"
                + "7. Orden A-Z\n"
                + "8. Orden Z-A\n"
                + "9. Salir");
            seleccionMenu = this.validarNumeros();
            switch(seleccionMenu){
                case 1 -> agenda.save(false, 0);
                case 2 -> agenda.search();
                case 3 -> agenda.update();
                case 4 -> agenda.delete();
                case 5 -> {}
                case 6 -> agenda.showsimple();
                case 7 -> agenda.ordenarContactos(true);
                case 8 -> agenda.ordenarContactos(false);
                case 9 -> continues = false;
                default -> {}
            }
        } while (continues);
    }

}
