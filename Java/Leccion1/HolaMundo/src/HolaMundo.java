
import java.util.Scanner;

//Nuestro primer programa Hola mundo
public class HolaMundo {

    public static void main(String[] args) {
        /*System.out.println("Hola Mundo desde Java"); */

 /*int miVariable = 10;//Una vez instanciada la variable, no es necesario instanciala de nuevo.
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);//El uso de viariables tiene restricciones, no puede ser utilizada en otro metodo.
        //Tipo String
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en programación";
        System.out.println(miVariableCadena);//Ctrl + click izquierdo, nos muestra donde fue instanciada la variable y si no fue instanciada*/
        //Var - inferebcia de tipos de Java
        /*var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);*/
        //soutv + tab
        //Para ejecutar Shift + F6
        //Reglas para definir una variable en Java
        //No se pueden usar numero al principio de una variable.
        //Puede empezar con mayuscula pero se recomienda usar Camel Case
        //No puede tener Caracteres especiales
        //Usar acentos, se puede, pero no es recomendable.
        //Esta prohibido e ilegal usar el numeral #
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
        

        /*Clase scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);*/
 /*byte numEnteroByte = (byte)127;//Si se supera el valor maximo, se convierte en un error
        System.out.println("numEnteroByte ="+ numEnteroByte);
        System.out.println("Valor minimo del Byte:"+ Byte.MIN_VALUE);
        System.out.println("Valor maximo del Byte"+ Byte.MAX_VALUE);
        
        short numEnteroShort = (short)32767;//Si se supera el valor maximo, se convierte en un error
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del Short:"+ Short.MIN_VALUE);
        System.out.println("Valor maximo del Short: "+ Short.MAX_VALUE);
        
        int numEnteroInt = (int)2147483647L; //Si el valor supera el maximo, no se resuelve, y pasaria a usarse el long(L)
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor minimo del int:"+ Integer.MIN_VALUE);
        System.out.println("Valor maximo del int: "+ Integer.MAX_VALUE);
        
        long numEnteroLong = 9223372036854775807L;//Si el valor supera el maximo, se agrega la letra L al final.
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor minimo del long:"+ Long.MIN_VALUE);
        System.out.println("Valor maximo del long: "+ Long.MAX_VALUE);*/
 
        /*float numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor minimo de float:"+ Float.MIN_VALUE);
        System.out.println("El valor maximo:"+Float.MAX_VALUE);
        double numDouble = 1.7976931348623157E308D;
        System.out.println("numDouble = " + numDouble);
        System.out.println("El valor minimo:"+ Double.MIN_VALUE);
        System.out.println("El valor maximo:"+ Double.MAX_VALUE);*/
        
        //Inferencia de tipos var y tipos primitivos
        /*var numEntero = 20; //Las literales sin punto automaticamente son de tipo int
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0; //Automaticamente con el punto se transforma en double.
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);*/
        
        //Tipos primitivos char
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        
        char 6varCaracter = '\u0024'; //Indicamos a Java la asignsvion con el codigo unicode
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36;//Valor decimal del juego de caracteres de unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$'; // Un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
        
        
        var varCaracter1 = '\u0024'; //Indicamos a Java la asignsvion con el codigo unicode
        System.out.println("varCaracter1 = " + varCaracter1);
        var varCaracterDecimal1 = (char)36;//Valor entero y le asigna un tipo int
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        var varCaracterSimbolo1 = '$'; // Un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
        
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);
    }

}
