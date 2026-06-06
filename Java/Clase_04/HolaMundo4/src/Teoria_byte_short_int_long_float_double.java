/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author itzelmax
 */
public class Teoria_byte_short_int_long_float_double {
    public static void main(String[] args) {
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
 
        float numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor minimo de float:"+ Float.MIN_VALUE);
        System.out.println("El valor maximo:"+Float.MAX_VALUE);
        double numDouble = 1.7976931348623157E308D;
        System.out.println("numDouble = " + numDouble);
        System.out.println("El valor minimo:"+ Double.MIN_VALUE);
        System.out.println("El valor maximo:"+ Double.MAX_VALUE);
    }
    
}
