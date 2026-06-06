
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author itzelmax
 */
public class Teoria_booleano_conversion {
    public static void main(String[] args) {
        //Tipos primitivos tipos booleanos
        /*boolean varBool = true;
        System.out.println("varBool =" + varBool);
        
        if (varBool) {
            System.out.println("La bandera es verde");
        }
        else{
            System.out.println("La vandera es roja");
        }
            //Allgoritmo: ¿Es mayor de edad?
    var edad = 15; //Literal tener presente la inferencia de tipos
    //var adulto = edad >= 18; //Esta es una expresión booleana
    if (edad >= 18) {
            System.out.println("Eres mayor de edad");
    }
    else {
            System.out.println("Eres menor de edad");
    }*/
     //Conversión de tipos
//     /*var edad = Integer.parseInt("20");
//     System.out.println("edad =" + (edad + 1));
//     var valorPI = Double.parseDouble("3.1416");
//     System.out.println("valorPI = " + valorPI);
//     
//     //Pedir un valor
       var entrada = new Scanner(System.in);
//     System.out.println("Digite su edad: ");
//     edad = Integer.parseInt( entrada.nextLine());
//     System.out.println("edad = " + edad);*/
     
     //Pedir valor
     var edadTexto = String.valueOf(10);
     System.out.println("edadTexto = " + edadTexto);
     
     var fraseChar = "programadores".charAt(3);
     System.out.println("fraseChar = " + fraseChar);
        
        System.out.println("Digite un caracter: ");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);
    }
}
