package helpers;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import models.Agenda;
import models.Contact_type;

/**
 * @author Honorée Reille
 */
public class helper {

  public final Scanner scan = new Scanner(System.in);


  private Boolean Matcher(String value){
    Pattern pattern = Pattern.compile("^\\d{8}$");
    Matcher matcher = pattern.matcher(value);
    return matcher.find();
  }

  public String validarTelefono(String value) {
    boolean finds = Matcher(value);
    while (!finds) {
      System.out.println("El numero no coincide con el formato, favor reingrese el numero telefonico");
      value = scan.next();
      finds = Matcher(value);
    }
    return value;
  }

  public void SeleccionarTipoContacto(Agenda agenda) {
    System.out.println("\n1. Movil"
            + "\n2. Casa"
            + "\n3. Oficina");
    int value = scan.nextInt();
    switch (value) {
      case 1 -> {
        agenda.setTipoContacto(Contact_type.Movil);
      }
      case 2 -> {
        agenda.setTipoContacto(Contact_type.Casa);
      }
      case 3 -> {
        agenda.setTipoContacto(Contact_type.Oficina);
      }
      default -> {
        System.out.print("No Existe la opción");
        SeleccionarTipoContacto(agenda);
      }
    }
  }

  public int validarNumeros() {
    int value;
    while (!scan.hasNextInt()) {
      System.out.println("No puede ingresar valores no numericos");
      scan.next();
    }
    value = scan.nextInt();
    return value;
  }


  public boolean validarMenu(String value) {
    boolean validator;
    while (!value.equals("s") && !value.equals("n")) {
      System.out.println("No se puede elegir un valor distinto de s/n");
      value = scan.next();
    }
    validator = value.equals("s");
    return validator;
  }
  
  public boolean validarListas(ArrayList<?> arr){
      if(arr.isEmpty()){
          System.out.println("No hay Contactos para mostrar");
          return false;          
      }
      return true;
  }

}