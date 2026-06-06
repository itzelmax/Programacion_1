
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
public class Teoria_tipos_carac {
    public static void main(String[] args) {
        //Var - diferencia de tipos de Java
        /*var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        /*soutv + tab
        Para ejecutar Shift + F6
        /*Reglas para definir una variable en Java
        No se pueden usar numero al principio de una variable.
        Puede empezar con mayuscula pero se recomienda usar Camel Case
        //No puede tener Caracteres especiales
        //Usar acentos, se puede, pero no es recomendable.
        //Esta prohibido e ilegal usar el numeral #
        */
        /*var usuario = "Osvaldo";
        var titulo = "Ingeniero ";
        var union = titulo + usuario;
        System.out.println("union = " + union);
        
        //No es recomendable usar identificadores tan cortos
        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));
        
        //Ejercicio: Caracteres Especiales Java
        var nombre = "Natalia";
        //  \n -> es para hacer un salto de linea 
        System.out.println("\nNueva linea: \n" + nombre);
        //Tabulador sirve para hacer un espacio para centrar
        System.out.println("Tabulador: \t"+ nombre);
        System.out.println("\t\t.:MENU:.");
        //Caracter de retroceso
        System.out.println("Retroceso: \b"+nombre);
        System.out.println("Comillas simple: \'"+nombre+"\'");
        System.out.println("Comillas Dobles: \""+nombre+"\"");*/
        //Clase scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: "+titulo2+" "+usuario2);
    }
    
}
