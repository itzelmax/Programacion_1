
public class Teoria_Operadores {

    public static void main(String[] args) {
        // Operadores Arismeticos

        /*int num1 = 5, num2 = 4;
        var solucion = num1 + num2;
        System.out.println("solucion suma = " + solucion);
        
        solucion = num1 - num2;
        System.out.println("solucion de la resta = " + solucion);
        
        solucion = num1 * num2;
        System.out.println("solucion de la multiplicacion = " + solucion);
        
        solucion = num1 / num2;
        System.out.println("solucion de la división = " + solucion);
        
        var solucion2 = 3.4 / num2;
        System.out.println("solucion2 resultado de la división = " + solucion2);
        
        solucion = num1 % num2; //Guarda el residuo entero de la división
        System.out.println("solucion = " + solucion); // 5/4
        
        if (num2 % 2 == 0)//No se agrego corchetes porque solo hay una linea de codigo.
            System.out.println("Es un número Par");
        else
            System.out.println("Es un número Impar");*/
 /*int varNum1 = 1, varNum2 = 4;
        var varNum3 = varNum1 + 6 - varNum2; //Una operacion.
        System.out.println("varNum3 = " + varNum3);
        
        varNum1 += 1;
        System.out.println("varNum1 = " + varNum1);
        
        // -= *= /= %=
        varNum2 -= 2;
        System.out.println("varNum2 = " + varNum2);
        varNum1 *= 5;
        System.out.println("varNum1 = " + varNum1);
        varNum3 /= 4;
        System.out.println("varNum3 = " + varNum3);
        varNum1 %= 6;
        System.out.println("varNum1 = " + varNum1);*/
        //Operadores Unarios 
        /*var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);
        
        // Operador de Negación
        var varC = true; //Esta literal por default en Java es de tipo boolean
        var varD = !varC; //Aquí esta invirtiendo el valor
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);
        
        //Operadores Unarios de Incremento: Preincremento
        var varE = 9; // Se va a modificar su valor
        var varF = ++varE; //Simbolo antes de la variable
        //Primero se incrementa la variable y despues se usa su valor
        System.out.println("varE = " + varE); //Se incrementa en la unidad
        System.out.println("varF = " + varF); //va a sumar uno 
        
        //Post-incremento (el simbolo va despues de la variable)
        
        var varG = 3;
        var varH = varG++; //Primero el valor de la variable, luego el incremento
        System.out.println("varg = " + varG);
        System.out.println("varH = " + varH);
        
        //Operadores Unarios de decremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI); //La variable ya esta con decremento
        System.out.println("varJ = " + varJ);
        
        //Post-decremento
        var varK = 8;
        var varL = varK--; //Primero el valor de la variable, luego queda el decremento
        System.out.println("varK = " + varK); //Aqui va a decrementar en 1
        System.out.println("varL = " + varL);*/
        //Operadores de Igualdad y Relacionales
        /*var aNum = 5;
        var bNum = 9;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);

        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);

        var cadenaA = "Hello";
        var cadenaB = "Hello";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);

        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);

        var gVar = aNum >= bNum; //> >= < <= == !=
        System.out.println("gVar = " + gVar);

        if (aNum % 2 == 0) {
            System.out.println("El numero es Par");
        } else {
            System.out.println("El numero es Impar");
        }
        var edad = 3;
        var adulto = 18;
        if(edad >= adulto){
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("Es menor de edad");
        }*/
        // Operador Condicional And
        /*var valorA = 11;
        var valorMinimo = 0; //rango del 0 al 10
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;

        if (respuesta) {
            System.out.println("Esta dentro del rango establecido");
        } else {
            System.out.println("Esta fuera del rango establecido");
        }
        
        var vacaciones = false;
        var diaLibre = true;
        if (vacaciones || diaLibre)
            System.out.println("Papá puede asistir al juego de su hijo");
        else
            System.out.println("Papa no puede asistir al juego de su hijo");*/
        
        //Operador Ternario
        /*var resultadoT = (5 > 8) ? "Verdadero" : "Falso";
        System.out.println("resultadoT = " + resultadoT);
        
        var numeroT = 4;
        resultadoT = (numeroT % 2 == 0) ? "Es Par" : "Es Impar";
        System.out.println("resultadoT = " + resultadoT);*/
        
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x); //6
        System.out.println("y = " + y); //9
        System.out.println("z = " + z); //16
        
        var solucionAritmetica = 4 + 5 * 6 / 3; // // 4 + ((5 * 6) / 3 = 30 / 3 = 10 + 4 = 14
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
        solucionAritmetica = (4 + 5) * 6 / 3; // 4 + 5 = 9 * 6 = 54 / 3 = 18
        System.out.println("solucionAritmetica = " + solucionAritmetica);

    }

}
