package experimentos;

import poo.io.*;

public class experimento2 {

  public static void main(String[] args) {

    String linea;
    char caracter;
    double numero;
    boolean logico;

    System.out.print("Este texto ");
    System.out.print("se queda en una sola línea.");
    System.out.println("Pero este texto");
    System.out.println("va saltando de una línea");
    System.out.println("a otra...");
    System.out.print("También puedes cambiar de línea\n");
    System.out.print("con el carácter de escape \\n\n");
    System.out.println("Y puedes unir texto " + "así de fácilmente");

    
    // Lectura de líneas
    System.out.println("Introduce una linea de texto:");
    linea = IO.readLine();
    System.out.println("Has tecleado: " + linea);

    
    // Lectura de caracteres
    System.out.println("Introduce un caracter:");
    caracter = IO.readChar();
    System.out.println("El caracter es: " + caracter);

    // Lectura de un número
    System.out.println("Introduce un número:");
    numero = IO.readNumber();
    System.out.println("El número es: " + numero);

    //Lectura de un valor lógico
    System.out.println("Introduce un valor lógico:");
    logico = IO.readBoolean();
    System.out.println("El valor es: " + logico);

    // Sacamos por pantalla todo lo que no se haya enviado
    System.out.flush();

  }

}