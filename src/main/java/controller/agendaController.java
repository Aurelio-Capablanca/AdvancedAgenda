/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import helpers.helper;

import java.util.ArrayList;
import java.util.Comparator;

import models.Agenda;
import models.Contact_type;

/**
 * @author LAB
 */
public class agendaController extends helper {

    private final ArrayList<Agenda> agendas = new ArrayList<>();
    private final Agenda agenda = new Agenda();

    public void showsimple() {
        this.validarListas(agendas);
        for (int i = 0; i < agendas.size(); i++) {
            System.out.println("\n" + (i + 1) + "" + "\nNombre: " + agendas.get(i).getNombre()
                    + "\nTelefono: " + agendas.get(i).getTelefono()
                    + "\nTipo Contacto: " + agendas.get(i).getTipoContacto().toString());
        }
    }

    private void showOne(int index) {
        this.validarListas(agendas);
        System.out.println("\nNombre: " + agendas.get(index).getNombre() + "\nTelefono: " + agendas.get(index).getTelefono() + "\nTipo Contacto: " + agendas.get(index).getTipoContacto().toString());
    }

    private Agenda setData() {
        System.out.println("Ingrese el nombre del contacto: ");
        agenda.setNombre(this.scan.next());
        System.out.println("Ingrese el Telefono del contacto: ");
        agenda.setTelefono(this.validarTelefono(scan.next()));
        System.out.println("Seleccione el tipo de contacto: ");
        this.SeleccionarTipoContacto(agenda);
        return agenda;
    }

    public void search() {
        String searcher;
        System.out.println("Ingrese un numero o un nombre para buscar el contacto: ");
        searcher = this.scan.next();
        this.validarListas(agendas);
        for (Agenda searchs : agendas) {
            if (searchs.getNombre().equals(searcher) || searchs.getTelefono().equals(searcher)) {
                showOne(agendas.indexOf(searcher));
            }
        }
    }

    public void save(boolean isupdate, int index) {
        if (!isupdate) {
            agendas.add(setData());
            if (agendas.size() + 1 == 10) {
                System.out.println("Ya no se pueden ingresar mas numeros");
            }
        } else {
            agendas.set(index, setData());
        }
    }

    public void update() {
        int seleccion;
        System.out.println("Seleccione un contacto a actualizar: ");
        showsimple();
        seleccion = this.validarNumeros();
        showOne(seleccion);
        save(true, seleccion);
    }

    public void delete() {
        int seleccion;
        String respuesta;
        System.out.println("Seleccione un contacto a actualizar: ");
        showsimple();
        seleccion = this.validarNumeros();
        showOne(seleccion);
        System.out.println("Desea Continuar s / n");
        respuesta = scan.next();
        boolean cont = this.validarMenu(respuesta);
        if (cont) {
            agendas.remove(seleccion);
            System.out.println("Se elimino el contacto");
        } else {
            System.out.println("No se elimino el Contacto");
        }
    }

    public void listarContactos(int tipo) {
        this.validarListas(agendas);
        switch (tipo) {
            case 1 -> {
                for (int i = 0; i < agendas.size(); i++) {
                    if (agendas.get(i).getTipoContacto().equals(Contact_type.Casa)) {
                        System.out.println((i + 1) + "" + agendas.get(i));
                    }
                }
            }
            case 2 -> {
                for (int i = 0; i < agendas.size(); i++) {
                    if (agendas.get(i).getTipoContacto().equals(Contact_type.Movil)) {
                        System.out.println((i + 1) + "" + agendas.get(i));
                    }
                }
            }
            case 3 -> {
                for (int i = 0; i < agendas.size(); i++) {
                    if (agendas.get(i).getTipoContacto().equals(Contact_type.Oficina)) {
                        System.out.println((i + 1) + "" + agendas.get(i));
                    }
                }
            }
            default ->
                System.out.println("No existe la opción seleccionada");
        }
    }

    private void printOrder(ArrayList<Agenda> nombres) {
        for (Agenda order : nombres) {
            System.out.println("\nNombre: " + order.getNombre() + "\nTelefono: " + order.getTelefono() + "\nTipo Contacto: " + order.getTipoContacto().toString());
        }
    }

    public void ordenarContactos(boolean asc) {
        this.validarListas(agendas);
        ArrayList<Agenda> nombres = new ArrayList<>(agendas);
        if (asc) {
            nombres.sort(Comparator.comparing(Agenda::getNombre));
        } else {
            nombres.sort(Comparator.comparing(Agenda::getNombre).reversed());
        }
        printOrder(nombres);
        nombres.clear();
    }

}
